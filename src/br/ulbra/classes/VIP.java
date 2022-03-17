package br.ulbra.classes;

public class VIP extends Ingresso {

    protected double valorAdicional;

    public VIP() {

    }

    public VIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

   

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public String imprimirVIP() {
        return "Ingresso VIP: " + (this.valorAdicional + this.valor);
    }
}
