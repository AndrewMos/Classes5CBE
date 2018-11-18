/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.dino.classes5cbe;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Evgeniia Panova
 */
public class AppendTests {

    @Test
    public void testAppend0() {
        System.out.println("append");
        String a = "Hello ";
        String b = "world";
        String expResult = "Hello world";
        String result = Multiply.appendStrings(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testAppend1() {
        System.out.println("append");
        String a = "Hello";
        String b = "world";
        String expResult = "Hello world";
        String result = Multiply.appendStrings(a, b);
        assertNotEquals(expResult, result);
    }

    @Test
    public void testAppend2() {
        System.out.println("append");
        String a = null;
        String b = null;
        String result = Multiply.appendStrings(a, b);
        assertNotNull(result);
    }

}
