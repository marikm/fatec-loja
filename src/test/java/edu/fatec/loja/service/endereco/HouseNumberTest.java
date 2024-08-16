package edu.fatec.loja.service.endereco;

import edu.fatec.loja.excecoes.AdressException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseNumberTest {

    @Test
    void ExceptionTestMessage() {
        AdressException e =  assertThrows(AdressException.class, () -> new HouseNumber(null));
        assertEquals("House number field null", e.getMessage());
    }

    @Test
    void getHouseNumbervalue() throws AdressException {
        assertEquals(12345, new HouseNumber(12345).getValue());
    }

    @Test
    void testHouseNumberToString() throws AdressException {
        assertEquals("12345", new HouseNumber(12345).toString());
    }

    @Test
    void testEquals() throws AdressException {
        assertEquals(new HouseNumber(123), new HouseNumber(123));
    }

    @Test
    void testHashCode() throws AdressException {
        assertEquals(new HouseNumber(123).hashCode(), new HouseNumber(123).hashCode());
    }
}