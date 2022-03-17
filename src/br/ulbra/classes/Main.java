//@author Andriele Joras dos Santos
// 16/03/22 - Noturno

package br.ulbra.classes;

public class Main {
    public static void main(String[] args){
        
        Ingresso ingresso = new Ingresso(5.0);
        ingresso.imprimeValor();
        
        VIP vip = new VIP(1,ingresso.getValor());
        System.out.println(vip.imprimirVIP());
        
        Normal normal = new Normal();
        System.out.println(normal.imprimeNormal());
            
        CamaroteInferior inferior = new CamaroteInferior("c2");
        System.out.println(inferior.imprimirLocalizacao());
        
        CamaroteSuperior superior = new CamaroteSuperior(2, ingresso.getValor(), vip.getValorAdicional());
        System.out.println(superior.imprimirValorCamarote());
        
        
    }
}
