/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex201;

import java.util.Comparator;

/**
 *
 * @author User
 */
public class Compari implements Comparator<Measurement>{

    public int compare(Measurement m1, Measurement m2) {
         if (m1.getUeberschreitung() < m2.getUeberschreitung()) {
                    return 1;
                } else {
                    return -1;
                }
    }
}
