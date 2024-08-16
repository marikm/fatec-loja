package edu.fatec.loja.modelo;

import edu.fatec.loja.excecoes.InfoUserException;
import edu.fatec.loja.service.infoUsuario.Cpf;
import edu.fatec.loja.service.infoUsuario.UserProfile;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InfoUserExceptionTest {

    @Test
    void getCpf() throws InfoUserException {
        assertEquals("12323123124", new edu.fatec.loja.modelo.InfoUser(new Cpf("12323123124"), new UserProfile("vendedor")).getCpf().toString());
    }

    @Test
    void getPerfilUsuario() throws InfoUserException {
        assertEquals("vendedor", new edu.fatec.loja.modelo.InfoUser(new Cpf("12323123124"), new UserProfile("vendedor")).getPerfilUsuario().toString());
        assertEquals("cliente", new edu.fatec.loja.modelo.InfoUser(new Cpf("12323123124"), new UserProfile("cliente")).getPerfilUsuario().toString());
    }

    @Test
    void testToString() throws InfoUserException {
        assertEquals("InfoUsuario{cpf=12323123124, perfilUsuario=vendedor}", new edu.fatec.loja.modelo.InfoUser(new Cpf("12323123124"), new UserProfile("vendedor")).toString());
    }
}