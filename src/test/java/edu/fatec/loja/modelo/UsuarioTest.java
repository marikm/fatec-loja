package edu.fatec.loja.modelo;

import edu.fatec.loja.excecoes.EnderecoException;
import edu.fatec.loja.excecoes.InfoUsuarioException;
import edu.fatec.loja.excecoes.LoginException;
import edu.fatec.loja.service.endereco.Cidade;
import edu.fatec.loja.service.endereco.NumeroCasa;
import edu.fatec.loja.service.infoUsuario.Cpf;
import edu.fatec.loja.service.infoUsuario.PerfilUsuario;
import edu.fatec.loja.service.login.Nome;
import edu.fatec.loja.service.login.Senha;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void getLogin() throws LoginException, EnderecoException, InfoUsuarioException {
        Usuario usuarioTeste = new Usuario(new Login(new Nome("marina"), new Senha("Ab123123")),
                new Endereco(new Cidade("sao gotardo", "MG"), "nomeRua", new NumeroCasa("123")),
                new InfoUsuario(new Cpf("09809889012"), new PerfilUsuario("vendedor")));

        assertEquals("Login{nomeUsuario=marina, senha=Ab123123}", usuarioTeste.getLogin().toString());
    }

    @Test
    void getEndereco() throws LoginException, EnderecoException, InfoUsuarioException {
        Usuario usuarioTeste = new Usuario(new Login(new Nome("marina"), new Senha("Ab123123")),
                new Endereco(new Cidade("sao gotardo", "MG"), "nomeRua", new NumeroCasa("123")),
                new InfoUsuario(new Cpf("09809889012"), new PerfilUsuario("vendedor")));

        assertEquals("Endereco{cidade=sao gotardo, UF = MG, rua='nomeRua', numeroCasa=123}", usuarioTeste.getEndereco().toString());
    }

    @Test
    void getInfoUsuario() throws LoginException, EnderecoException, InfoUsuarioException {
        Usuario usuarioTeste = new Usuario(new Login(new Nome("marina"), new Senha("Ab123123")),
                new Endereco(new Cidade("sao gotardo", "MG"), "nomeRua", new NumeroCasa("123")),
                new InfoUsuario(new Cpf("09809889012"), new PerfilUsuario("vendedor")));

        assertEquals("InfoUsuario{cpf=09809889012, perfilUsuario=vendedor}", usuarioTeste.getInfoUsuario().toString());
    }

    @Test
    void testToString() throws EnderecoException, LoginException, InfoUsuarioException {
        Usuario usuarioTeste = new Usuario(new Login(new Nome("marina"), new Senha("Ab123123")),
                new Endereco(new Cidade("sao gotardo", "MG"), "nomeRua", new NumeroCasa("123")),
                new InfoUsuario(new Cpf("09809889012"), new PerfilUsuario("vendedor")));

        assertEquals("Login{nomeUsuario=marina, senha=Ab123123} Endereco{cidade=sao gotardo, UF = MG, rua='nomeRua', numeroCasa=123} InfoUsuario{cpf=09809889012, perfilUsuario=vendedor}", usuarioTeste.toString());

    }
}