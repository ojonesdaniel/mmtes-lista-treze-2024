package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

    @Test
    public void testSetNome() {
        Usuario usuario = new Usuario();
        usuario.setNome("João");
        assertEquals("João", usuario.getNome());
    }

    @Test
    public void testSetCpf() {
        Usuario usuario = new Usuario();
        usuario.setCpf("12345678901");
        assertEquals("12345678901", usuario.getCpf());
    }

    @Test
    public void testSetIdade() {
        Usuario usuario = new Usuario();
        usuario.setIdade(30);
        assertEquals(30, usuario.getIdade());
    }

    @Test
    public void testValidarCPF() {
        assertTrue(Main.validarCPF("12345678901")); // CPF válido
        assertFalse(Main.validarCPF("123")); // CPF com menos de 11 dígitos

    }
}