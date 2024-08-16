package edu.fatec.loja.service.infoUsuario;

import edu.fatec.loja.excecoes.InfoUserException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserProfileTest {

    @Test
    void testandoExcecoes() {
        InfoUserException e = assertThrows(InfoUserException.class, () -> new UserProfile(""));
        assertEquals("Profile user not informed", e.getMessage());

        InfoUserException e1 =  assertThrows(InfoUserException.class, () -> new UserProfile("user"));
        assertEquals("Invalid profile user, just salesPerson or client", e1.getMessage());
        assertDoesNotThrow(() -> new UserProfile("salesPerson"));
        assertDoesNotThrow(() -> new UserProfile("client"));
    }

    @Test
    void validarPerfil() {
        assertTrue(UserProfile.validateProfile("salesPerson"));
        assertTrue(UserProfile.validateProfile("client"));
        assertFalse(UserProfile.validateProfile("user"));
    }

    @Test
    void getVendedorOuCliente() throws InfoUserException {
        assertEquals("salesPerson", new UserProfile("salesPerson").getOption());
        assertEquals("client", new UserProfile("client").getOption());
    }

    @Test
    void testToString() throws InfoUserException {
        assertEquals("salesPerson", new UserProfile("salesPerson").toString());
        assertEquals("client", new UserProfile("client").toString());
    }

    @Test
    void testEquals() throws InfoUserException {
        UserProfile profile1 = new UserProfile("client");
        UserProfile profile2 = new UserProfile("client");

        assertEquals(profile1, profile2);
    }

    @Test
    void testHashCode() throws InfoUserException {
        UserProfile profile1 = new UserProfile("client");
        UserProfile profile2 = new UserProfile("client");

        assertEquals(profile1.hashCode(), profile2.hashCode());

    }
}