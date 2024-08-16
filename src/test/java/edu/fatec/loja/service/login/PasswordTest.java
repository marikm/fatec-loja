package edu.fatec.loja.service.login;

import edu.fatec.loja.excecoes.LoginException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {

    @Test
    void validatePasswordSize() {
        assertEquals("Password null or blank", assertThrows(LoginException.class, ()-> new Password("")).getMessage());
        assertEquals("Password must have 6-15 caracters", assertThrows(LoginException.class, ()-> new Password("a1b3C")).getMessage());
    }

    @Test
    void validatePasswordField() {
        assertDoesNotThrow( ()-> new Password("12412aB"));
        assertEquals("Password must have 1 caracter lowcase, 1 uppercase and 1 number", assertThrows(LoginException.class, ()-> new Password("a1b334")).getMessage());
    }

    @Test
    void getPasswordValue() throws LoginException {
        assertEquals("1234Ab", new Password("1234Ab").getValue());
    }

    @Test
    void testToString() throws LoginException {
        assertEquals("1234Ab", new Password("1234Ab").toString());
    }

    @Test
    void testEquals() throws LoginException {
        Password pass1 = new Password("1234Ab");
        Password pass2 = new Password("1234Ab");

        assertEquals(pass1, pass2);
    }

    @Test
    void testHashCode() throws LoginException {
        Password pass1 = new Password("1234Ab");
        Password pass2 = new Password("1234Ab");

        assertEquals(pass1.hashCode(), pass2.hashCode());
    }

    @Test

    void testValidatePasswordSize() {
        String pass = "1234Ab";
        assertTrue(Password.validatePasswordSize(pass));
    }

    @Test
    void testValidatePasswordField() {
        String pass = "1234Ab";
        assertTrue(Password.validatePasswordField(pass));

    }
}