package edu.fatec.loja.service.login;

import edu.fatec.loja.excecoes.LoginException;

import java.util.Objects;

public class Name {
    private final String value;

    public Name(String value) throws LoginException {
        if(value == null || value.isBlank()){
            throw new LoginException("Name is null or blank");
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name = (Name) o;
        return Objects.equals(value, name.value);
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
