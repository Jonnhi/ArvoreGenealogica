package br.com.digitalhouse;

public class Filho {
    private String mae;
    private String pai;
    private String filho;


    //construtor específico
    public Filho(String nomePai, String nomeMae, String nomeFilho){
        pai = nomePai;
        mae = nomeMae;
        filho = nomeFilho;

    }

    //Construtor padrao
    public Filho(){

    }


    //Get - Acessor
    public String getPai(){
        return pai;
    }

    public String getMae(){
        return mae;
    }

    public String getFilho(){
        return filho;
    }


    //Set - Modificador
    public void setPai(String nomePai){
        pai = nomePai;
    }

    public void setMae(String nomeMae){
        mae = nomeMae;
    }

    public void setFilho(String nomeFilho){
        filho = nomeFilho;
    }


}
