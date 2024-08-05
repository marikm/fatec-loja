package edu.fatec.loja.service.endereco;

import edu.fatec.loja.excecoes.AdressException;

public class HouseNumber {

    private final Integer value;

    public HouseNumber(Integer value) throws AdressException {
        if (value == 0 || value == null) {
            throw new AdressException("Valor do campo numero da casa nulo ou vazio");
        }
        if(value.toString().matches("[a-z]*")){
            throw new AdressException("Valor informado contém letra, deve conter apenas numeros");
        }
        this.value = value;
    }

//    public static boolean validaNumeroCasa(String numeroCasa){
//        return numeroCasa.matches("[0-9]*");
//    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
