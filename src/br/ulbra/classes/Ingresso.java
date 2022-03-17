package br.ulbra.classes;

public class Ingresso {
    
    protected double valor;
    
    public Ingresso(){
        
    }
    public Ingresso(double valor){
        this.valor = valor;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
    public double getValor(){
        return this.valor;
    }
    
    public void imprimeValor(){
        System.out.println(this.valor);
    }
    
    public String toString(){
        return "Valor: " + this.valor;
    }
}
