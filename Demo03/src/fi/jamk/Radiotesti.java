
package fi.jamk;

public class Radiotesti {
    public static void main (String args[]){
        
        Radio eka = new Radio("Radio Loop", true, 30, 99.8);
        eka.setVolume(5);
        eka.setHz(111.9);
        System.out.println(eka.annaTiedot());
    }
    
    
    
}
