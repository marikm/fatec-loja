package edu.fatec.loja.modelo;

public class Usuario {
    private final Login login;
    private final Endereco endereco;

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

    @Override
    public String toString() {
        return "Usuario{" +
                "login=" + login +
                ", endereco=" + endereco +
                '}';
    }
}
