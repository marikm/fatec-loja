package edu.fatec.loja.service;

import edu.fatec.loja.excecoes.EnderecoException;

public class NumeroCasa {

    private final String numeroCasa;

    public NumeroCasa(String numeroCasa) throws EnderecoException {

        if(!validaNumeroCasa(numeroCasa)){
            throw new EnderecoException("Numero de casa invalido");
        }

        this.numeroCasa = numeroCasa;
    }

    public boolean validaNumeroCasa(String numeroCasa){
        return numeroCasa.matches("[0-9]*");
    }

    public boolean isBlank() {
        return numeroCasa.isBlank();
    }

    @Override
    public String toString() {
        return numeroCasa;
    }
}
