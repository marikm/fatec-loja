package edu.fatec.loja.modelo;

import edu.fatec.loja.excecoes.EnderecoException;
import edu.fatec.loja.service.endereco.Cidade;
import edu.fatec.loja.service.endereco.NumeroCasa;

public class Endereco {
    private final Cidade cidade;
    private final String rua;
    private final NumeroCasa numeroCasa;

    public Endereco(Cidade cidade, String rua, NumeroCasa numeroCasa) throws EnderecoException {
        if (rua.isBlank()) {
            throw new EnderecoException("Valor do campo rua nulo ou vazio");
        }
        this.cidade = cidade;
        this.rua = rua;
        this.numeroCasa = numeroCasa;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public String getRua() {
        return rua;
    }

    public NumeroCasa getNumeroCasa() {
        return numeroCasa;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cidade=" + cidade +
                ", rua='" + rua + '\'' +
                ", numeroCasa=" + numeroCasa +
                '}';
    }
}











