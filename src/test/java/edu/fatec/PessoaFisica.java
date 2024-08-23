package edu.fatec;

import java.util.Objects;

public class PessoaFisica {
    private final String nome;
    private final String cpf;

    public PessoaFisica(final String nome, final String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final PessoaFisica that = (PessoaFisica) o;
        return Objects.equals(nome, that.nome) && Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf);
    }
}
