package edu.fatec.oo.pessoa;

import java.util.List;

public class PessoaPostgresqlRepository implements PessoaRepository {

    @Override
    public void save(final Pessoa pessoa) {

    }

    @Override
    public Pessoa findOne(final String cpf) {
        return null;
    }

    @Override
    public List<Pessoa> findAll() {
        return List.of();
    }

    @Override
    public List<Pessoa> findByName(final String nome) {
        return List.of();
    }
}