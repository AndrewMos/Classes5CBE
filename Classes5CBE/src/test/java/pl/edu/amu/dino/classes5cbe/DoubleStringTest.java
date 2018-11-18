/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.dino.classes5cbe;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Khokhlov.m
 */
public class DoubleStringTest {

    @Test
    public void testDouble0() {
        System.out.println("double");
        String a = "hello";
        String expResult = "hello_hello";
        String result = DoubleString.doubleString(a);
        assertEquals(expResult, result);
    }


    @Test (expected = NullPointerException.class)
    public void testDoubleNullPointer(){
        System.out.println("testDoubleNullPointer");
        String a= null;
        String result = DoubleString.doubleString(a);
    }

    @Test
    public void testDoubleNotEquals(){
        System.out.println("testDoubleNotEquals");
        String a = "hello";
        String expResult = "hellohello";
        String result = DoubleString.doubleString(a);
        assertNotEquals(expResult, result);
    }

}
