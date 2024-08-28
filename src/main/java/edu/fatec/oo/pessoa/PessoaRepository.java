package edu.fatec.oo.pessoa;

import java.util.List;

// camada/layer de acesso ao banco
//    interface/trait/contrato para salva banco
public interface PessoaRepository {
    void save(Pessoa pessoa);
    Pessoa findOne(String cpf);
    List<Pessoa> findAll();
    List<Pessoa> findByName(String nome);
}