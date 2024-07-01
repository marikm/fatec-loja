package edu.fatec.loja.modelo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LoginTest {

    @Test
    public void verificaGettersEstaoCorretos() {
        final Login login = new Login("marina", "123");

        assertEquals("marina", login.getNomeUsuario());
        assertEquals("123", login.getSenha());
    }


    @Test
    void testToString() {
        assertTrue(false);
        //TODO
    }

}
