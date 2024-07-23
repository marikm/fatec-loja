package edu.fatec.loja.service.endereco;

import edu.fatec.loja.excecoes.EnderecoException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumeroCasaTest {

    @Test
    void testandoExcecoes() {
        assertEquals("Numero de casa invalido", assertThrows(EnderecoException.class, () -> new NumeroCasa("adasdd")).getMessage());
        assertEquals("Valor do campo numero da casa nulo ou vazio", assertThrows(EnderecoException.class, () -> new NumeroCasa("")).getMessage());
        assertEquals("Valor do campo numero da casa nulo ou vazio", assertThrows(EnderecoException.class, () -> new NumeroCasa("    ")).getMessage());

    }

    @Test
    void validaNumeroCasa() throws EnderecoException {
        assertFalse(NumeroCasa.validaNumeroCasa("qeqqe"));
        assertFalse(NumeroCasa.validaNumeroCasa("123a"));
        assertTrue(NumeroCasa.validaNumeroCasa("21213"));

    }

    @Test
    void testToString() throws EnderecoException {
        assertEquals("12345", new NumeroCasa("12345").toString());
    }

    @Test
    void getNumeroCasa() throws EnderecoException {
        assertEquals("12345", new NumeroCasa("12345").getNumeroCasa());
    }
}