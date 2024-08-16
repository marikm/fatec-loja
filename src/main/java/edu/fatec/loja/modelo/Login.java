package edu.fatec.loja.modelo;

import edu.fatec.loja.service.login.Name;
import edu.fatec.loja.service.login.Password;

public class Login {
    private final Name nameUsuario;
    private final Password password;

    public Login(Name nameUsuario, Password password) {
        this.nameUsuario = nameUsuario;
        this.password = password;
    }

    public Name getNomeUsuario() {
        return nameUsuario;
    }

    public Password getSenha() {
        return password;
    }

    @Override
    public String toString() {
        return "Login{" +
                "nomeUsuario=" + nameUsuario +
                ", senha=" + password +
                '}';
    }
}
