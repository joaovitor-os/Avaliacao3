package app;


import java.util.Objects;


public class Contas{
    private int id_conta;
    private int mes_conta;
    private int ano_conta;
    private double valor;
    private Pessoas pessoas;

    public Contas() {
    }

    public Contas(int id_conta, int mes_conta, int ano_conta, double valor, Pessoas pessoas) {
        this.id_conta = id_conta;
        this.mes_conta = mes_conta;
        this.ano_conta = ano_conta;
        this.valor = valor;
        this.pessoas = pessoas;
    }

    public int getId_conta() {
        return this.id_conta;
    }

    public void setId_conta(int id_conta) {
        this.id_conta = id_conta;
    }

    public int getMes_conta() {
        return this.mes_conta;
    }

    public void setMes_conta(int mes_conta) {
        this.mes_conta = mes_conta;
    }

    public int getAno_conta() {
        return this.ano_conta;
    }

    public void setAno_conta(int ano_conta) {
        this.ano_conta = ano_conta;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Pessoas getPessoas() {
        return this.pessoas;
    }

    public void setPessoas(Pessoas pessoas) {
        this.pessoas = pessoas;
    }

    public Contas id_conta(int id_conta) {
        this.id_conta = id_conta;
        return this;
    }

    public Contas mes_conta(int mes_conta) {
        this.mes_conta = mes_conta;
        return this;
    }

    public Contas ano_conta(int ano_conta) {
        this.ano_conta = ano_conta;
        return this;
    }

    public Contas valor(double valor) {
        this.valor = valor;
        return this;
    }

    public Contas pessoas(Pessoas pessoas) {
        this.pessoas = pessoas;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Contas)) {
            return false;
        }
        Contas contas = (Contas) o;
        return id_conta == contas.id_conta && mes_conta == contas.mes_conta && ano_conta == contas.ano_conta && valor == contas.valor && Objects.equals(pessoas, contas.pessoas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_conta, mes_conta, ano_conta, valor, pessoas);
    }

    @Override
    public String toString() {
        return "{" +
            " id_conta='" + getId_conta() + "'" +
            ", mes_conta='" + getMes_conta() + "'" +
            ", ano_conta='" + getAno_conta() + "'" +
            ", valor='" + getValor() + "'" +
            ", pessoas='" + getPessoas() + "'" +
            "}";
    }

   
}

