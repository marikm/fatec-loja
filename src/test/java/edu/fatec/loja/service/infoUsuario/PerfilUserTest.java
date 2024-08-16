package edu.fatec.loja.service.infoUsuario;

import edu.fatec.loja.excecoes.InfoUserException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfilUserTest {

    @Test
    void testandoExcecoes() {
        assertEquals("Perfil de usuario nao informado", assertThrows(InfoUserException.class, () -> new UserProfile("")).getMessage());
        assertEquals("Perfil de usuario invalido, deve ser vendedor ou cliente", assertThrows(InfoUserException.class, () -> new UserProfile("usuario")).getMessage());
        assertDoesNotThrow(() -> new UserProfile("vendedor"));
        assertDoesNotThrow(() -> new UserProfile("cliente"));
    }

    @Test
    void validarPerfil() {
        assertTrue(UserProfile.validarPerfil("vendedor"));
        assertTrue(UserProfile.validarPerfil("cliente"));
        assertFalse(UserProfile.validarPerfil("usuario"));
    }

    @Test
    void getVendedorOuCliente() throws InfoUserException {
        assertEquals("vendedor", new UserProfile("vendedor").getVendedorOuCliente());
        assertEquals("cliente", new UserProfile("cliente").getVendedorOuCliente());
    }

    @Test
    void testToString() throws InfoUserException {
        assertEquals("vendedor", new UserProfile("vendedor").toString());
        assertEquals("cliente", new UserProfile("cliente").toString());
    }
}