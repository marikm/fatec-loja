package edu.fatec.loja.modelo;

import java.util.logging.Logger;

public class Usuario {
    private Login login;
    private Endereco endereco;

    public Usuario(Login login, Endereco endereco) {
        this.login = login;
        this.endereco = endereco;
    }

    public Login getLogin() {
        return login;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
