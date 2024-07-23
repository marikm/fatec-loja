package edu.fatec.loja.modelo;

import edu.fatec.loja.excecoes.LoginException;
import edu.fatec.loja.service.endereco.Cidade;
import edu.fatec.loja.service.endereco.NumeroCasa;
import edu.fatec.loja.service.login.Nome;
import edu.fatec.loja.service.login.Senha;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void getLogin() throws LoginException {
        Usuario usuarioTeste = new Usuario(new Login(new Nome("marina"), new Senha("Ab123123")),
                new Endereco(new Cidade("sao gotardo", "MG"), "nomeRua", new NumeroCasa("123")))
        assertEquals("Login{nomeUsuario=marina, senha=Ab123123}", );
    }

    @Test
    void getEndereco() {
    }

    @Test
    void getInfoUsuario() {
    }

    @Test
    void testToString() {
    }
}