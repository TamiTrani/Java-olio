/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk;

/**
 *
 * @author H8265
 */
public class Tyontekijatesti {
    
    public static void main (String args[]){
        Johtaja pomo = new Johtaja("Rick James", "Toimitusjohtaja", 30000, "Chevrolet Impala", 5000);
        System.out.println(pomo.getTiedot());
    }
}
