/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.dino.classes5cbe;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Bohee Kim
    added 3 test cases.
 */
public class MultiplyTest {

    public MultiplyTest() {
    }

    @Test
    public void testMultiply0() {
        System.out.println("multiply");
        String a = "10";
        String b = "3";
        String expResult = "30";
        String result = Multiply.multiply(a, b);
        assertNotEquals(expResult, result);

    }

    @Test
    public void testMultiply1() {
        System.out.println("multiply1");
        String a = "3";
        String b = "3";
        String expResult = "9";
        String result = Multiply.multiply(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testMultiply2() {
        System.out.println("multiply2");
        String a = "500";
        String b = "10";
        String expResult = "5000";
        String result = Multiply.multiply(a, b);
        assertEquals(expResult, result);

    }
