package br.ulbra.classes;

public class Normal extends Ingresso {
    
    private int quantidade;

    public Normal(){
        
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public String imprimeNormal(){
        return "Ingresso Normal";
    }
    
}
