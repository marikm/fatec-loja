package edu.fatec.loja.modelo;

import edu.fatec.loja.excecoes.EnderecoException;

public class Endereco {
    private final String cidade;
    private final String rua;
    private final String numeroCasa;

    public Endereco(String cidade, String rua, String numeroCasa) throws EnderecoException {
        if (cidade == null || cidade.isEmpty()) {
            throw new EnderecoException("Valor do campo cidade nulo ou vazio");
        }
        if (rua == null || rua.isEmpty()) {
            throw new EnderecoException("Valor do campo rua nulo ou vazio");
        }
        if (numeroCasa == null || numeroCasa.isEmpty()) {
            throw new EnderecoException("Valor do campo numero da casa nulo ou vazio");
        }

        this.cidade = cidade;
        this.rua = rua;
        this.numeroCasa = numeroCasa;
    }

    public String getCidade() {
        return cidade;
    }

    public String getRua() {
        return rua;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cidade='" + cidade + '\'' +
                ", rua='" + rua + '\'' +
                ", numeroCasa='" + numeroCasa + '\'' +
                '}';
    }

}











