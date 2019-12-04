package app;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.event.SwingPropertyChangeSupport;

public class APPFinancas {

    //CONEXÃO COM BANCO DE DADOS
    public static Connection getConnection() throws Exception {
        try {
            Properties props = getProps();
            final String url = "jdbc:mysql://localhost:3306/contas";
            final String user = "root";
            final String password = "";

            return DriverManager.getConnection(url, user, password);
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Properties getProps() throws IOException {
        Properties props = new Properties();
        
        props.load(APPFinancas.class.getResourceAsStream());
        return props;
    }

    // INSERIR NOME E EMAIL EM PESSOAS
    private static void cadastrarPessoa(
        Pessoas p,
        Connection conexao
    )throws Exception {
        String cadastropessoa = "INSERT INTO pessoas " + 
                        "(nome, email) " + 
                    "VALUES(?,?)";
        try{
            PreparedStatement statement = conexao.prepareStatement(cadastropessoa);
            statement.setString(1, p.setNome_pessoa(nome_pessoa));
            statement.setString(2, p.setEmail_pessoa(email_pessoa));
            
            statement.executeUpdate();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    //INSERIR NOME, ANO, MES, VALOR E DESCONTO EM DIVIDAS
    private static void cadastrarDivida(
        Dividas d,
        Connection conexao
    )throws Exception {
        String cadastrodivida = "INSERT INTO dividas " + 
                        "(nome, ano, mes, valor, desconto ) " + 
                    "VALUES(?,?,?,?,?)";
        try{
            PreparedStatement statement = conexao.prepareStatement(cadastrodivida);
            statement.setString(1, d.setNome_pessoa(nome_pessoa));
            statement.setInt(2, d.setAno_conta(ano_conta));
            statement.setInt(3, d.setMes_conta(mes_conta));
            statement.setDouble(4, d.setValor(valor));
            statement.setDouble(5, d.getPorcentualDesconto(porcentual_desconto));
            
            statement.executeUpdate();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    //INSERIR NOME, ANO, MES, VALOR E IMPOSTO EM PROVENTOS
    private static void cadastrarProvento(
        Proventos p,
        Connection conexao
    )throws Exception {
        String cadastroprovento = "INSERT INTO proventos " + 
                        "(nome, ano, mes, valor, desconto ) " + 
                    "VALUES(?,?,?,?,?)";
        try{
            PreparedStatement statement = conexao.prepareStatement(cadastroprovento);
            statement.setString(1, p.setNome_pessoa(nome_pessoa));
            statement.setInt(2, p.setAno_conta(ano_conta));
            statement.setInt(3, p.setMes_conta(mes_conta));
            statement.setString(4, p.setValor(valor));
            statement.setDouble(5, p.setImposto(imposto));
            
            statement.executeUpdate();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    // CONSULTAR A TABELA PESSOAS
    public static void consultarPessoa(
        Connection conexao
        ) throws Exception {
        String cadastropessoa = "SELECT * FROM pessoas";
        Statement statemente = conexao.createStatement();
        ResultSet resultados = statemente.executeQuery(cadastropessoa);

        while(resultados.next()){
            Pessoas pessoas = new Pessoas(
                resultados.getInt("id"),
                resultados.getString("nome"),
                resultados.getString("email")
            );

            System.out.println(pessoas);
        }
    }

    //CONSULTAR A TABELA DIVIDAS
    public static void consultarDivida(
        Connection conexao
        ) throws Exception {
        String cadastrodivida = "SELECT * FROM dividas";
        Statement statemente = conexao.createStatement();
        ResultSet resultados = statemente.executeQuery(cadastrodivida);

        while(resultados.next()){
            Dividas dividas = new Dividas(
                resultados.getString("nome"),
                resultados.getInt("ano"),
                resultados.getInt("mes"),
                resultados.getDouble("valor"),
                resultados.getDouble("desconto")
            );

            System.out.println(dividas);
        }
    }

    //CONSULTAR A TABELA PROVENTOS
    public static void consultarProvento(
        Connection conexao
        ) throws Exception {
        String cadastroprovento = "SELECT * FROM proventos";
        Statement statemente = conexao.createStatement();
        ResultSet resultados = statemente.executeQuery(cadastroprovento);

        while(resultados.next()){
            Proventos proventos = new Proventos(
                resultados.getString("nome"),
                resultados.getInt("ano"),
                resultados.getInt("mes"),
                resultados.getDouble("valor"),
                resultados.getDouble("imposto")
            );

            System.out.println(proventos);
        }
    }


        
    
}