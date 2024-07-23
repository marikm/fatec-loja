package edu.fatec.loja.service.infoUsuario;

import edu.fatec.loja.excecoes.InfoUsuarioException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfilUsuarioTest {

    @Test
    void testandoExcecoes() {
        assertEquals("Perfil de usuario nao informado", assertThrows(InfoUsuarioException.class, () -> new PerfilUsuario("")).getMessage());
        assertEquals("Perfil de usuario invalido, deve ser vendedor ou cliente", assertThrows(InfoUsuarioException.class, () -> new PerfilUsuario("usuario")).getMessage());
        assertDoesNotThrow(() -> new PerfilUsuario("vendedor"));
        assertDoesNotThrow(() -> new PerfilUsuario("cliente"));
    }

    @Test
    void validarPerfil() {
        assertTrue(PerfilUsuario.validarPerfil("vendedor"));
        assertTrue(PerfilUsuario.validarPerfil("cliente"));
        assertFalse(PerfilUsuario.validarPerfil("usuario"));
    }

    @Test
    void getVendedorOuCliente() throws InfoUsuarioException {
        assertEquals("vendedor", new PerfilUsuario("vendedor").getVendedorOuCliente());
        assertEquals("cliente", new PerfilUsuario("cliente").getVendedorOuCliente());
    }

    @Test
    void testToString() throws InfoUsuarioException  {
        assertEquals("vendedor", new PerfilUsuario("vendedor").toString());
        assertEquals("cliente", new PerfilUsuario("cliente").toString());
    }
}