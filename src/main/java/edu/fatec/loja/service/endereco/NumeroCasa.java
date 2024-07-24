package edu.fatec.loja.service.endereco;

import edu.fatec.loja.excecoes.EnderecoException;

public class NumeroCasa {

    private final String numeroCasa;

    public NumeroCasa(String numeroCasa) throws EnderecoException {
        if (numeroCasa.isBlank()) {
            throw new EnderecoException("Valor do campo numero da casa nulo ou vazio");
        }

        if(!validaNumeroCasa(numeroCasa)){
            throw new EnderecoException("Numero de casa invalido");
        }
        this.numeroCasa = numeroCasa;
    }

    public static boolean validaNumeroCasa(String numeroCasa){
        return numeroCasa.matches("[0-9]*");
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    @Override
    public String toString() {
        return numeroCasa;
    }

}
