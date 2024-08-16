package edu.fatec.loja.service.endereco;

import edu.fatec.loja.excecoes.AdressException;

import java.util.Objects;

public class HouseNumber {

    private final Integer value;

    public HouseNumber(Integer value) throws AdressException {
        if (value == null) {
            throw new AdressException("House number field null");
        }
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HouseNumber that = (HouseNumber) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    @Override
    public String toString() {
        return value.toString();
    }

}
