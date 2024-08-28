package edu.fatec.oo.pessoa;

import java.util.Objects;

// classe de dominio = domain
public class Pessoa {
    private final String cpf;
    private final String nome;

    public Pessoa(final String cpf, final String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Pessoa pessoa = (Pessoa) o;
        return Objects.equals(cpf, pessoa.cpf) && Objects.equals(nome, pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf, nome);
    }
}




class Main {

    public static void main(String[] args) {

        PessoaService pessoaService = new PessoaService();

        pessoaService.salvarPessoa("123", "mike");
        pessoaService.salvarPessoa("321", "marina");
    }

}







