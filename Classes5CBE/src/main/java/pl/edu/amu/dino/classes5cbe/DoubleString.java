/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.dino.classes5cbe;

/**
 * @author Khokhlov.m
 */
public class DoubleString {

    public static String doubleString(String a) {
        StringBuilder result = new StringBuilder(a);
        result.append("_");
        result.append(a);
        return result.toString();
    }
}
