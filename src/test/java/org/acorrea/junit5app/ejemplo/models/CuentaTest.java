package org.acorrea.junit5app.ejemplo.models;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    @Test
    void testNombreCuenta() {
        Cuenta cuenta = new Cuenta("Alejo", new BigDecimal("1000.12345"));
        cuenta.setPersona("Alejo");
        String esperado = "Alejo";
        String real = cuenta.getPersona();
        assertEquals(esperado, real);
        assertTrue(real.equals("Alejo"));

    }
}