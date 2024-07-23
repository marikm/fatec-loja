package edu.fatec.loja.service.login;

import edu.fatec.loja.excecoes.LoginException;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class NomeTest {

    @Test
    public void verificaExcecoesNome(){
        assertDoesNotThrow(() -> new Nome("Marina"));
        assertEquals("Nome nao pode ser nulo ou vazio", assertThrows(LoginException.class, ()-> new Nome("")).getMessage());
    }

    @Test
    void getNome() throws LoginException {
        assertEquals("maria",new Nome("maria").getNome());
    }

    @Test
    void testToString() throws LoginException {
        assertEquals("maria",new Nome("maria").toString());
    }
}