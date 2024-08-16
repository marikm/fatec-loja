package edu.fatec.loja.service.login;

import edu.fatec.loja.excecoes.LoginException;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class NameTest {

    @Test
    public void verificaExcecoesNome(){
        assertDoesNotThrow(() -> new Name("Marina"));
        assertEquals("Nome nao pode ser nulo ou vazio", assertThrows(LoginException.class, ()-> new Name("")).getMessage());
    }

    @Test
    void getNome() throws LoginException {
        assertEquals("maria",new Name("maria").getNome());
    }

    @Test
    void testToString() throws LoginException {
        assertEquals("maria",new Name("maria").toString());
    }
}