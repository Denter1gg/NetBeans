/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kassegui;


/**
 *
 * @author belomeda
 */
public class KasseStart {
    
    public static MarktKasse marktKasse;
    public static KasseFrame kasseFrame;
    
    public static void main(String[] args) {
    marktKasse = new MarktKasse();
    kasseFrame = new KasseFrame(marktKasse);
    kasseFrame.setVisible(true);
    
    String s = "12";
    int i = Integer.parseInt(s);
    double d = Double.parseDouble(s);
    d = (double)i;
    double r = d + 0.12;
    
        // TODO code application logic here
    }
    
    public void setVisible() {
    
    }
}

