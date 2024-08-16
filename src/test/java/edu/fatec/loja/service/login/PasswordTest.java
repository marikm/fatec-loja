package edu.fatec.loja.service.login;

import edu.fatec.loja.excecoes.LoginException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {

    @Test
    void validarTamanhoSenha() {
        assertEquals("Senha nao pode ser nulo ou vazio", assertThrows(LoginException.class, ()-> new Password("")).getMessage()); // porque quando coloco valor nulo nao da certo
        assertEquals("Senha deve conter entre 6-15 caracteres", assertThrows(LoginException.class, ()-> new Password("a1b3C")).getMessage());
    }

    @Test
    void validarCharSenha() {
        assertDoesNotThrow( ()-> new Password("12412aB"));
        assertEquals("Senha deve conter pelo menos 1 numero, 1 caracter minusculo e 1 maisculo", assertThrows(LoginException.class, ()-> new Password("a1b334")).getMessage());
    }

    @Test
    void getSenha() throws LoginException {
        assertEquals("1234Ab", new Password("1234Ab").getSenha());
    }

    @Test
    void testToString() throws LoginException {
        assertEquals("1234Ab", new Password("1234Ab").toString());
    }
}