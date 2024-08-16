package edu.fatec.loja.service.login;

import edu.fatec.loja.excecoes.LoginException;

import java.util.Objects;

public class Password {
    private final String value;

    public Password(String value) throws LoginException {
        if(value == null || value.isBlank()){
            throw new LoginException("Password null or blank");
        }
        if(!validatePasswordField(value)){
            throw new LoginException("Password must have 1 caracter lowcase, 1 uppercase and 1 number");
        }
        if(!validatePasswordSize(value)){
            throw new LoginException("Password must have 6-15 caracters");
        }
        this.value = value;
    }

    public static boolean validatePasswordSize(String password){
        return password.length() >=6 && password.length() < 16;
    }

    public static boolean validatePasswordField(String senha){
        return senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).+$");
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Password password = (Password) o;
        return Objects.equals(value, password.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    @Override
    public String toString() {
        return value;
    }
}
