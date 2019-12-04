package app;

import java.util.Objects;

public class Pessoas{
    private int id_pessoa;
    private String nome_pessoa;
    private String email_pessoa;


    public Pessoas() {
    }

    public Pessoas(int id_pessoa, String nome_pessoa, String email_pessoa) {
        this.id_pessoa = id_pessoa;
        this.nome_pessoa = nome_pessoa;
        this.email_pessoa = email_pessoa;
    }

    public int getId_pessoa() {
        return this.id_pessoa;
    }

    public void setId_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public String getNome_pessoa() {
        return this.nome_pessoa;
    }

    public void setNome_pessoa(String nome_pessoa) {
        this.nome_pessoa = nome_pessoa;
    }

    public String getEmail_pessoa() {
        return this.email_pessoa;
    }

    public void setEmail_pessoa(String email_pessoa) {
        this.email_pessoa = email_pessoa;
    }

    public Pessoas id_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
        return this;
    }

    public Pessoas nome_pessoa(String nome_pessoa) {
        this.nome_pessoa = nome_pessoa;
        return this;
    }

    public Pessoas email_pessoa(String email_pessoa) {
        this.email_pessoa = email_pessoa;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pessoas)) {
            return false;
        }
        Pessoas pessoas = (Pessoas) o;
        return id_pessoa == pessoas.id_pessoa && Objects.equals(nome_pessoa, pessoas.nome_pessoa) && Objects.equals(email_pessoa, pessoas.email_pessoa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_pessoa, nome_pessoa, email_pessoa);
    }

    @Override
    public String toString() {
        return "{" +
            " id_pessoa='" + getId_pessoa() + "'" +
            ", nome_pessoa='" + getNome_pessoa() + "'" +
            ", email_pessoa='" + getEmail_pessoa() + "'" +
            "}";
    }
   
}

    