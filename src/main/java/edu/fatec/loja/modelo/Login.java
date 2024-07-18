package edu.fatec.loja.modelo;

public class Login {
    private final String nomeUsuario;
    private final String senha;

    public Login(String nomeUsuario, String senha) {

        if (nomeUsuario == null || nomeUsuario.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do usuário não pode ser nulo nem vazio");
        }

        if (senha == null || senha.length() < 5) {
            throw new IllegalArgumentException("Campo senha não pode ser nulo nem conter menos de 5 caracteres");
        }

        this.nomeUsuario = nomeUsuario.trim();
        this.senha = senha.trim();
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
