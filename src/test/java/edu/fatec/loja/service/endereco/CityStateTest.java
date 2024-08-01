package edu.fatec.loja.service.endereco;

import edu.fatec.loja.excecoes.AdressException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CityStateTest {

    @Test
    void testExceptions() {
        assertEquals("Cep value null or uninformed", assertThrows(AdressException.class, () -> new CityState("")).getMessage());
        assertEquals("Cep value null or uninformed", assertThrows(AdressException.class, () -> new CityState("    ")).getMessage());
    }

    @Test
    void testGetCep() throws AdressException {
        assertEquals("16072470", new CityState("16072470").getCep());
        assertEquals("38540970", new CityState("38540970").getCep());
    }

    @Test
    void testGetCityName() throws AdressException {
        assertEquals("Araçatuba", new CityState("16072470").getCityName());
        assertEquals("Abadia dos Dourados", new CityState("38540970").getCityName());
    }

    @Test
    void testGetStateName() throws AdressException {
        assertEquals("SP", new CityState("16072470").getStateName());
        assertEquals("MG", new CityState("38540970").getStateName());
    }

    @Test
    void testToString() throws AdressException {
        assertEquals("Araçatuba, SP", new CityState("16072470").toString());
        assertEquals("São Gotardo, MG", new CityState("38800000").toString());
    }
}