/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.perkalian;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


/**
 *
 * @author HP
 */
public class PerkalianTest {
    
    @Test
    public void testMultiply() {
        Perkalian multiplication = new Perkalian();
        assertEquals(12, multiplication.multiply(3, 4), "3 x 4 harus sama dengan 12");
        assertEquals(0, multiplication.multiply(0, 4), "0 x 4 harus sama dengan 0");
        assertEquals(-15, multiplication.multiply(3, -5), "3 x -5 harus sama dengan -15");
    }
    
    // Penambahan code smell: test yang tidak berkaitan
    @Test
    public void testUnrelatedFunction() {
        String str = "hello";
        assertEquals(5, str.length(), "Panjang string 'hello' harus 5");
    }
    
}
