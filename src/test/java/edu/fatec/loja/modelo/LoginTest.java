package edu.fatec.loja.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LoginTest {


    final Login login = new Login("marina", "12345");

    @Test
    public void verificaGettersEstaoCorretos() {
        assertEquals("marina", login.nomeUsuario());
        assertEquals("12345", login.senha());
    }
    @Test
    public void verificaExcecoes(){
        assertDoesNotThrow(() -> login.nomeUsuario());
        assertDoesNotThrow(() -> login.senha());

        Assertions.assertThrows(IllegalArgumentException.class, ()-> new Login("", ""));
        Assertions.assertThrows(IllegalArgumentException.class, ()-> new Login("marina", "123"));

    }


    @Test
    void testToString() {
        Login joao = new Login("joão", "12345");
        assertEquals("Login{senha='12345', nomeUsuario='marina'}", login.toString());
        assertEquals("Login{senha='12345', nomeUsuario='joão'}", joao.toString());

    }

}
