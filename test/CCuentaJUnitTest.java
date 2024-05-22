/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import examen3refactorizado.CCuenta;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author persona
 */
public class CCuentaJUnitTest {
    CCuenta cuenta;
    public CCuentaJUnitTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    cuenta = new CCuenta();
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testIngresarNegativo(){
    assertEquals(1, cuenta.ingresar(-100));}
    @Test
    public void testIngresarCero(){
    assertEquals(1, cuenta.ingresar(0));}
 
      @Test
    public void testIngresarLimite(){
    assertEquals(1, cuenta.ingresar(3000));}
         @Test
    public void testIngresarDeMas(){
    assertEquals(0, cuenta.ingresar(3001));}
      @Test
    public void testIngresar(){
    assertEquals(0, cuenta.ingresar(100));}
}
