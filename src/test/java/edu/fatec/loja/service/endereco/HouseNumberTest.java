package edu.fatec.loja.service.endereco;

import edu.fatec.loja.excecoes.AdressException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseNumberTest {

    @Test
    void testandoExcecoes() {
        assertEquals("Numero de casa invalido", assertThrows(AdressException.class, () -> new HouseNumber(0)).getMessage());
        assertEquals("Valor do campo numero da casa nulo ou vazio", assertThrows(AdressException.class, () -> new HouseNumber(null)).getMessage());
    }

//    @Test
//    void validaNumeroCasa() {
//        assertFalse(HouseNumber.validaNumeroCasa("qeqqe"));
//        assertFalse(HouseNumber.validaNumeroCasa("123a"));
//        assertTrue(HouseNumber.validaNumeroCasa("21213"));
//    }

    @Test
    void testToString() throws AdressException {
        assertEquals(12345, new HouseNumber(12345).toString());
    }

    @Test
    void getNumeroCasa() throws AdressException {
        assertEquals(12345, new HouseNumber(12345).getValue());
    }
}