package edu.fatec.loja.modelo;

import static org.junit.jupiter.api.Assertions.*;

import edu.fatec.loja.excecoes.LoginException;
import edu.fatec.loja.service.login.Nome;
import edu.fatec.loja.service.login.Senha;
import org.junit.jupiter.api.Test;

class LoginTest {

    @Test
    public void verificaGettersNomeSenha() throws LoginException {
        assertEquals("marina", new Login(new Nome("marina"), new Senha("1234Ab")).getNomeUsuario().toString());
        assertEquals("1234Ab", new Login(new Nome("marina"), new Senha("1234Ab")).getSenha().toString());

    }

    @Test
    public void verificaExcecoesLogin(){
        assertEquals("Nome nao pode ser nulo ou vazio", assertThrows(LoginException.class, ()-> new Login(new Nome(""), new Senha("123aBCdsde"))).getMessage());
        assertEquals("Senha nao pode ser nulo ou vazio", assertThrows(LoginException.class, ()-> new Login(new Nome("Mike"), new Senha(""))).getMessage());
        assertEquals("Senha deve conter pelo menos 1 numero, 1 caracter minusculo e 1 maisculo", assertThrows(LoginException.class, ()-> new Login(new Nome("Mike"), new Senha("a2b321"))).getMessage());
        assertEquals("Senha deve conter entre 6-15 caracteres", assertThrows(LoginException.class, ()-> new Login(new Nome("Maria"), new Senha("a1b3C"))).getMessage());

    }


    @Test
    void testToString() throws LoginException {
        assertEquals("Login{nomeUsuario=marina, senha=1234Ab}", new Login(new Nome("marina"), new Senha("1234Ab")).toString());
        assertEquals("Login{nomeUsuario=maria, senha=ABc1d1223}", new Login(new Nome("maria"), new Senha("ABc1d1223")).toString());

    }

}
