package edu.fatec.loja.modelo;

import edu.fatec.loja.excecoes.LoginException;
import edu.fatec.loja.service.login.Nome;
import edu.fatec.loja.service.login.Senha;

public class Login {
    private final Nome nomeUsuario;
    private final Senha senha;

    public Login(Nome nomeUsuario, Senha senha) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public Nome getNomeUsuario() {
        return nomeUsuario;
    }

    public Senha getSenha() {
        return senha;
    }

    @Override
    public String toString() {
        return "Login{" +
                "nomeUsuario=" + nomeUsuario +
                ", senha=" + senha +
                '}';
    }
}
