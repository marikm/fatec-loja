package edu.fatec.loja.service.login;

import edu.fatec.loja.excecoes.LoginException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SenhaTest {

    @Test
    void validarTamanhoSenha() {
        assertEquals("Senha nao pode ser nulo ou vazio", assertThrows(LoginException.class, ()-> new Senha("")).getMessage()); // porque quando coloco valor nulo nao da certo
        assertEquals("Senha deve conter entre 6-15 caracteres", assertThrows(LoginException.class, ()-> new Senha("a1b3C")).getMessage());
    }

    @Test
    void validarCharSenha() {
        assertDoesNotThrow( ()-> new Senha("12412aB"));
        assertEquals("Senha deve conter pelo menos 1 numero, 1 caracter minusculo e 1 maisculo", assertThrows(LoginException.class, ()-> new Senha("a1b334")).getMessage());
    }

    @Test
    void getSenha() throws LoginException {
        assertEquals("1234Ab", new Senha("1234Ab").getSenha());
    }

    @Test
    void testToString() throws LoginException {
        assertEquals("1234Ab", new Senha("1234Ab").toString());
    }
}