
package Volvo;


public class S60test {
 public static void main (String args[]){
        S60T5 T5 = new S60T5("T5", true, true, "Musta", 180);
        System.out.println(T5.getTiedot());
        
        S60T6 Polestar = new S60T6("T6 Polestar Production model", true, false, "Sininen", 257);
        System.out.println(Polestar.getTiedot());
        
        S60T6 Concept = new S60T6("T6 Polestar Concept model", true, true, "Sininen", 374);
        System.out.println(Concept.getTiedot());
    }   
}
