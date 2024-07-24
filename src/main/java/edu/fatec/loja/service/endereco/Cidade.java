package edu.fatec.loja.service.endereco;

import edu.fatec.loja.excecoes.EnderecoException;

public class Cidade {
    private final String nome;
    private final String estado;

    public Cidade(String nome, String estado) throws EnderecoException {
        if (nome.isBlank() || estado.isBlank()) {
            throw new EnderecoException("Valor do nome ou estado da cidade nulo ou vazio");
        }
        this.nome = nome;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome + ", UF = " + estado;
    }
}
