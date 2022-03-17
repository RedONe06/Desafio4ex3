package br.ulbra.classes;

public class CamaroteSuperior extends VIP{
    
    private double valorExtraCamarote;
    
    
    public CamaroteSuperior(){
        
    }

    public CamaroteSuperior(double valorExtraCamarote, double valor, double valorAdicional) {
        super(valor, valorAdicional);
        this.valorExtraCamarote = valorExtraCamarote;
    }

    public double getValorExtraCamarote() {
        return valorExtraCamarote;
    }

    public void setValorExtraCamarote(double valorExtraCamarote) {
        this.valorExtraCamarote = valorExtraCamarote;
    }
    
    public String imprimirValorCamarote(){
        return "Ingresso camarote: " + (this.getValor() + this.valorExtraCamarote);
    }
}
