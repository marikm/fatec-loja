package edu.fatec.loja.service.login;

import edu.fatec.loja.excecoes.LoginException;

import java.util.Objects;

public class Password {
    private final String senha;

    public Password(String senha) throws LoginException {
        if(senha.isBlank()){
            throw new LoginException("Senha nao pode ser nulo ou vazio");
        }
        if(!validarCharSenha(senha)){
            throw new LoginException("Senha deve conter pelo menos 1 numero, 1 caracter minusculo e 1 maisculo");
        }
        if(!validarTamanhoSenha(senha)){
            throw new LoginException("Senha deve conter entre 6-15 caracteres");
        }
        this.senha = senha;
    }

    public static boolean validarTamanhoSenha(String senha){
        return senha.length() >=6 && senha.length() < 16;
    }

    public static boolean validarCharSenha(String senha){
        return senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).+$");
    }

    public String getSenha() {
        return senha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Password password = (Password) o;
        return Objects.equals(senha, password.senha);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(senha);
    }

    @Override
    public String toString() {
        return senha;
    }
}
