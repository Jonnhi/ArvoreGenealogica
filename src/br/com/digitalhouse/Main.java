package br.com.digitalhouse;

public class Main {

    public static void main(String[] args) {
        //Filho fiuk = new Filho("Fabio Junior","Cristina Karthalian");
        //Filho cleo = new Filho("Fabio Junior","Gloria Pires");

        //System.out.println(fiuk.getMae());
        Filho filhoUm = new Filho("Fabio Junior","Cristina Karthalian", "Fiuk");
        Filho filhoDois = new Filho("Fabio Junior","Gloria Pires", "Cleo Pires");

        temAMesmaMae(filhoUm, filhoDois);
        temOMesmoPai(filhoUm, filhoDois);

        System.out.println(saoMeioIrmaos(filhoUm,filhoDois));

    }

    public static String maeDe(Filho novofilho){
        return novofilho.getMae();
    }

    public static  String paiDe(Filho novofilho){
        return novofilho.getPai();
    }

    public static  boolean temAMesmaMae(Filho filhoUm, Filho filhoDois){
        return maeDe(filhoUm) == maeDe(filhoDois);
    }

    public static  boolean  temOMesmoPai(Filho filhoUm, Filho filhoDois){
        return paiDe(filhoUm) == paiDe(filhoDois);
    }

    public static  boolean saoMeioIrmaos(Filho filhoUm, Filho filhoDois){
        return temAMesmaMae(filhoUm, filhoDois) && !temOMesmoPai(filhoUm, filhoDois)
                || !temAMesmaMae(filhoUm, filhoDois) && temOMesmoPai(filhoUm, filhoDois);
    }



}
