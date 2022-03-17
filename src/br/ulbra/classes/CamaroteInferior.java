package br.ulbra.classes;

public class CamaroteInferior extends VIP{
    
    private String localizacao;
    
    public CamaroteInferior(){
        
    }
    
    public CamaroteInferior(String localizacao){
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
    public String imprimirLocalizacao(){
        return this.localizacao;
    }
    
}
