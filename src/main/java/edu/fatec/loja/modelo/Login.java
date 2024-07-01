package edu.fatec.loja.modelo;

public class Login {
    private final String nomeUsuario;
    private final String senha;

    public Login(String nomeUsuario, String senha) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    @Override
    public String toString() {
        return "Login{" +
                "senha='" + senha + '\'' +
                ", nomeUsuario='" + nomeUsuario + '\'' +
                '}';
    }
}
