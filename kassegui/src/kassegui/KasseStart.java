/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kassegui;

public class KasseStart {
    
    public static MarktKasse marktKasse;
    public static KasseFrame kasseFrame;
    
    public static void main(String[] args) {
    marktKasse = new MarktKasse();
    kasseFrame = new KasseFrame(marktKasse);
    kasseFrame.setVisible(true);
    }
    
    public void setVisible() {
    
    }
}

