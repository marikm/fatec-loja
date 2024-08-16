package edu.fatec.loja.modelo;

import edu.fatec.loja.service.login.Name;
import edu.fatec.loja.service.login.Password;

import java.util.Objects;

public class Login {
    private final Name username;
    private final Password password;

    public Login(Name username, Password password) {
        this.username = username;
        this.password = password;
    }

    public Name getUsername() {
        return username;
    }

    public Password getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Login login = (Login) o;
        return Objects.equals(username, login.username) && Objects.equals(password, login.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }

    @Override
    public String toString() {
        return "Login{" +
                "username=" + username +
                ", password=" + password +
                '}';
    }
}
