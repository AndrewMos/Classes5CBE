/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.dino.classes5cbe;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jsiwek
 */
public class MultiplyTest {

    public MultiplyTest() {
    }

    @Test
    public void testMultiply0() {
        System.out.println("multiply");
        String a = "2";
        String b = "3";
        String expResult = "1";
        String result = Multiply.multiply(a, b);
        assertNotEquals(expResult, result);

    }

    @Test
    public void testMultiply1() {
        System.out.println("multiply1");
        String a = "2";
        String b = "3";
        String expResult = "6";
        String result = Multiply.multiply(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testMultiply2() {
        System.out.println("multiply2");
        String a = "30";
        String b = "10";
        String expResult = "300";
        String result = Multiply.multiply(a, b);
        assertEquals(expResult, result);

    }

    @Test
    public void testMultiply10() {
        System.out.println("multiply");
        String a = "2";
        String b = "3";
        String expResult = "6";
        String result = Multiply.multiply(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testMultiply20() {
        System.out.println("multiply");
        String a = "2";
        String b = "3";
        String expResult = "7";
        String result = Multiply.multiply(a, b);
        assertNotEquals(expResult, result);
    }

    @Test
    public void testMultiply3() {
        System.out.println("multiply");
        String a = "2";
        String b = "a";
        String expResult = null;
        String result = Multiply.multiply(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testMultiply4() {
        String a = "Hello";
        String b = "World";
        int expResult = 260000;
        Multiply.multiply(a, b);
        int result = Multiply.result1;
        assertEquals(expResult, result);

    }

    @Test
    public void testMultiply5() {
        String a = "Software";
        String b = "Engineering";
        int expResult = 953433;
        Multiply.multiply(a, b);
        int result = Multiply.result1;
        assertEquals(expResult, result);
    }

    @Test
    public void testMultiply6() {
        String a = "Hello";
        String b = "Engineering";
        int expResult = 2;
        Multiply.multiply(a, b);
        int result = Multiply.result1;
        assertNotEquals(expResult, result);
    }
    @Test
    public void testMultiply7()
    {
         String x="bonjour";
         String y="student";
         int sort= 1;
         Multiply.multiply(x, y);
         int r=Multiply.result1;
         assertNotEquals(sort,r);
    }
    @Test
    public void testMultiply8()
    {
        String k="2";
        String b="4";
        String sorted ="8";
        String expect=Multiply.multiply(k, b);
        assertEquals(expect,sorted);
    }
    @Test
    public void testMultiply9()
    {
        String a="5";
        String b="dakar";
        String r="oui";
        String expect =Multiply.multiply(a,b);
        assertNotEquals(expect,r);
    }
    
}
