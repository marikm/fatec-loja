package edu.fatec.loja.service.infoUsuario;

import edu.fatec.loja.excecoes.InfoUserException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CpfTest {

    @Test
    void invalidCpfValuesTest() {
        assertFalse(Cpf.isCPF(null));
        assertFalse(Cpf.isCPF(""));
        assertFalse(Cpf.isCPF("0"));
        assertFalse(Cpf.isCPF("00000000000"));
        assertFalse(Cpf.isCPF("11111111111"));
        assertFalse(Cpf.isCPF("99999999999"));
        assertFalse(Cpf.isCPF("12345687911"));
        assertFalse(Cpf.isCPF("11488954644"));
        assertFalse(Cpf.isCPF("32132454544"));
        assertFalse(Cpf.isCPF("456567767657"));
        assertFalse(Cpf.isCPF("123.456.879-11"));
        assertFalse(Cpf.isCPF("114.889.546-44"));
        assertFalse(Cpf.isCPF("321.324.545-44"));
        assertFalse(Cpf.isCPF("456.567.767-57"));
        assertFalse(Cpf.isCPF("071.721.522-98"));
        assertFalse(Cpf.isCPF("847.781.803-72"));
        assertFalse(Cpf.isCPF("471.382.531-09"));
        assertFalse(Cpf.isCPF("434.896.155-73"));
        assertFalse(Cpf.isCPF("179.947.946-37"));
        assertFalse(Cpf.isCPF("328.179.426-20"));
        assertFalse(Cpf.isCPF("916.326.148-04"));
        assertFalse(Cpf.isCPF("761.859.339-69"));
        assertFalse(Cpf.isCPF("916.326.148-**"));
        assertFalse(Cpf.isCPF("761.859.339-##"));
    }

    @Test
    void valiCpfValuesTest() {
        assertTrue(Cpf.isCPF("07172152298"));
        assertTrue(Cpf.isCPF("84778180372"));
        assertTrue(Cpf.isCPF("47138253109"));
        assertTrue(Cpf.isCPF("43489615573"));
        assertTrue(Cpf.isCPF("17994794637"));
        assertTrue(Cpf.isCPF("32817942620"));
        assertTrue(Cpf.isCPF("91632614804"));
        assertTrue(Cpf.isCPF("76185933969"));
    }


    @Test
    void getCpf() throws InfoUserException {
        assertEquals("76185933969", new Cpf("76185933969").getCpf());
    }

    @Test
    void testToString() throws InfoUserException {
        assertEquals("76185933969",  new Cpf("76185933969").toString());
    }

}