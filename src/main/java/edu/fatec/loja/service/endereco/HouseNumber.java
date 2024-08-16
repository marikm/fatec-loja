package edu.fatec.loja.service.endereco;

import edu.fatec.loja.excecoes.AdressException;

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
    public String toString() {
        return value.toString();
    }

}
