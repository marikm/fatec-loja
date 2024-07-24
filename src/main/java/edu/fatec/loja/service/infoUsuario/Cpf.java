package edu.fatec.loja.service.infoUsuario;

import edu.fatec.loja.excecoes.InfoUsuarioException;

public class Cpf {

    private final String cpf;

    public Cpf(String cpf) throws InfoUsuarioException {

        if(cpf.isBlank()){
            throw new InfoUsuarioException("Cpf nao informado");
        }

        if (!validarCpf(cpf)) {
            throw new InfoUsuarioException("O cpf digitado não contem 11 digitos");
        }
        this.cpf = cpf;

    }

    public String getCpf() {
        return cpf;
    }

    public static boolean validarCpf(String cpf) {
        return cpf.length() == 11;
    }

    @Override
    public String toString() {
        return cpf;
    }

}


