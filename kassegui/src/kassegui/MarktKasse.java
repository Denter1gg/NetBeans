/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kassegui;

public class MarktKasse {
    private int kassPersN; //Personalnummer des Kassierers
    private String kassName; //Name des Kassierers
    private int balance; //Aktuell in der Kasse vorhandener Geldbetrag in Cent (Kassenstand)
    private int verkauft; //Anzahl bisher verkaufter Artikel

    public MarktKasse(){
        this.kassPersN=1;
        this.kassName="Steve";
        this.balance=0;
        this.verkauft=0;
    }

    public MarktKasse(int kassPersNN, String kassNameN, int balanceN, int verkauftN){
        kassPersN=kassPersNN;
        kassName=kassNameN;
        balance=balanceN;
        verkauft=verkauftN;
    }
    
    public void verkaufen(int preis, int anzahl){
        balance+=preis*anzahl;
        verkauft+=anzahl;
    }
    
    public int getKassPersN(){
        return kassPersN;
    }
    
    public String getKassName(){
        return kassName;
    }
    
    public int getBalance(){
        return balance;
    }
    
    public int getVerkauft(){
        return verkauft;
    }
    
    public int setKassPersNum(int kassPersNNeu){
        kassPersN=kassPersNNeu;
        return kassPersN;
    }
    
    public String setKassPersName(String kassNameNeu){
        kassName=kassNameNeu;
        return kassName;
    }
    
    public int setBalanceN(int balanceNeu){
        balance=balanceNeu;
        return balance;
    }
    
    public int setVerkauft(int verkauftNeu){
        verkauft=verkauftNeu;
        return verkauft;
    }
}
    