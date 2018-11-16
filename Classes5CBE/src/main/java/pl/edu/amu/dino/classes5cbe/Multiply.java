/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.dino.classes5cbe;

/**
 * @author jsiwek
 */
public class Multiply {
    public static int result1;

    public static String multiply(String a, String b) {

        // Integer.getInteger doesn't convert String to integer!!
        // https://docs.oracle.com/javase/6/docs/api/java/lang/Integer.html#getInteger%28java.lang.String%29

        int inta = Integer.parseInt(a);
        int intb = Integer.parseInt(b);
        int result = inta * intb;

        return String.valueOf(result);
    }
}
