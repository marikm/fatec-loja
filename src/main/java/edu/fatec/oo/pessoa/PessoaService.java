package edu.fatec.oo.pessoa;

// camada service
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    public PessoaService() {
        this.pessoaRepository = new PessoaMysqlRepository();
    }

    public Pessoa salvarPessoa(String cpf, String nome) {

        if(cpf != null && !cpf.isBlank()) {
            throw new RuntimeException("cpf tem que ser bao");
        }
        if(nome != null && !nome.isBlank()) {
            throw new RuntimeException("nome tem que ser bao");
        }
        final Pessoa pessoa = new Pessoa(cpf, nome);

        final Pessoa pessoaExistente = pessoaRepository.findOne(cpf);
        if(pessoaExistente != null) {
            throw new RuntimeException("cpf duplicado, nao vou cadastrar");
        }

        pessoaRepository.save(pessoa);
        return pessoa;
    }

}