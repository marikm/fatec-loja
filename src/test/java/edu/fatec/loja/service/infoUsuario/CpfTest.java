package edu.fatec.loja.service.infoUsuario;

import edu.fatec.loja.excecoes.InfoUsuarioException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CpfTest {

    @Test
    void testandoExcecoes(){
        assertEquals("Cpf nao informado", assertThrows(InfoUsuarioException.class, ()->new Cpf("")).getMessage());
        assertEquals("O cpf digitado não contem 11 digitos", assertThrows(InfoUsuarioException.class, ()->new Cpf("12313")).getMessage());
    }

    @Test
    void getCpf() throws InfoUsuarioException {
        assertEquals("12345678912",  new Cpf("12345678912").getCpf());
    }

    @Test
    void testToString() throws InfoUsuarioException {
        assertEquals("12345678912",  new Cpf("12345678912").toString());
    }


    @Test
    void validarCpf() {
        assertTrue(Cpf.validarCpf("12312312345"));
    }
}