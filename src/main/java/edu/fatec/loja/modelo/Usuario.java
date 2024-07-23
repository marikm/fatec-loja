package edu.fatec.loja.modelo;

public class Usuario {
    private final Login login;
    private final Endereco endereco;
    private final InfoUsuario infoUsuario;

    public Usuario(Login login, Endereco endereco, InfoUsuario infoUsuario) {
        this.login = login;
        this.endereco = endereco;
        this.infoUsuario = infoUsuario;
    }

    public Login getLogin() {
        return login;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public InfoUsuario getInfoUsuario() {
        return infoUsuario;
    }

    @Override
    public String toString() {
        return login + " " + endereco + " " + infoUsuario;
    }

}
