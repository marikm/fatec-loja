package edu.fatec.loja.service;

public class Cidade {
    private final String nome;
    private final String estado;

    public Cidade(String nome, String estado) {
        this.nome = nome;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public String getNome() {
        return nome;
    }

    public boolean isBlank(){
        return (nome.isBlank());
    }


    @Override
    public String toString() {
        return nome + ", UF = " + estado;
    }
}
