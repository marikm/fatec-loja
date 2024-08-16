package edu.fatec.loja.service.login;

import edu.fatec.loja.excecoes.LoginException;

public class Name {
    private final String nome;

    public Name(String nome) throws LoginException {
        if(nome.isBlank()){
            throw new LoginException("Nome nao pode ser nulo ou vazio");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }

}
