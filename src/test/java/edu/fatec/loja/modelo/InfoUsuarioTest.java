package edu.fatec.loja.modelo;

import edu.fatec.loja.excecoes.InfoUsuarioException;
import edu.fatec.loja.service.infoUsuario.Cpf;
import edu.fatec.loja.service.infoUsuario.PerfilUsuario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InfoUsuarioTest {

    @Test
    void getCpf() throws InfoUsuarioException {
        assertEquals("12323123124", new InfoUsuario(new Cpf("12323123124"), new PerfilUsuario("vendedor")).getCpf().toString());
    }

    @Test
    void getPerfilUsuario() throws InfoUsuarioException {
        assertEquals("vendedor", new InfoUsuario(new Cpf("12323123124"), new PerfilUsuario("vendedor")).getPerfilUsuario().toString());
        assertEquals("cliente", new InfoUsuario(new Cpf("12323123124"), new PerfilUsuario("cliente")).getPerfilUsuario().toString());
    }

    @Test
    void testToString() throws InfoUsuarioException {
        assertEquals("InfoUsuario{cpf=12323123124, perfilUsuario=vendedor}", new InfoUsuario(new Cpf("12323123124"), new PerfilUsuario("vendedor")).toString());
    }
}