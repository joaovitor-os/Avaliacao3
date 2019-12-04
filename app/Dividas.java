package app;

import java.util.Objects;

public class Dividas extends Contas{

    private double porcentualDesconto;


    public Dividas() {
    }

    public Dividas(double porcentualDesconto) {
        this.porcentualDesconto = porcentualDesconto;
    }

    public double getPorcentualDesconto() {
        return this.porcentualDesconto;
    }

    public void setPorcentualDesconto(double porcentualDesconto) {
        this.porcentualDesconto = porcentualDesconto;
    }

    public Dividas porcentualDesconto(double porcentualDesconto) {
        this.porcentualDesconto = porcentualDesconto;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Dividas)) {
            return false;
        }
        Dividas dividas = (Dividas) o;
        return porcentualDesconto == dividas.porcentualDesconto;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(porcentualDesconto);
    }

    @Override
    public String toString() {
        return "{" +
            " porcentualDesconto='" + getPorcentualDesconto() + "'" +
            "}";
    }
    
}