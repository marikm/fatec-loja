package edu.fatec.loja.modelo;

import edu.fatec.loja.excecoes.AdressException;
import edu.fatec.loja.service.endereco.CityState;
import edu.fatec.loja.service.endereco.HouseNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class
AdressTest {

    @Test
    public void exceptionsTestOfFieldStreetNull() {
        AdressException e = assertThrows(AdressException.class, () -> new Adress(new CityState("3880000"), null, new HouseNumber(123)));
        assertEquals("Field street null or blank", e.getMessage());

        AdressException e2 = assertThrows(AdressException.class, () -> new Adress(new CityState("38800000"), "", new HouseNumber(123)));
        assertEquals("Field street null or blank", e2.getMessage());
    }

    @Test
    public void exceptionsTestOfFieldCityStateNull() {
        AdressException e = assertThrows(AdressException.class, () -> new Adress(new CityState(null), "teste", new HouseNumber(123)));
        assertEquals("Cep value null or uninformed", e.getMessage());

        AdressException e2 = assertThrows(AdressException.class, () -> new Adress(new CityState(""), "teste", new HouseNumber(123)));
        assertEquals("Cep value null or uninformed", e2.getMessage());
    }

    @Test
    public void exceptionsTestOfFieldHouseNumberNull() {
        AdressException e = assertThrows(AdressException.class, () -> new Adress(new CityState("38800000"), "teste", new HouseNumber(null)));
        assertEquals("House number field null", e.getMessage());
    }

    @Test
    void testGetCityState() throws AdressException {
        Adress adress = new Adress(new CityState("38800000"), "Onofre", new HouseNumber(123));
        assertNotNull(adress.getCityState());
        assertEquals(new CityState("38800000"), adress.getCityState(),  "CityState should match the expected value");
    }

    @Test
    public void testToString() throws AdressException {

    }
}