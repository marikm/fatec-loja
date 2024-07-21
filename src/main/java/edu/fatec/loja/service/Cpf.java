package edu.fatec.loja.service;

public class Cpf {

    private final String cpf;

    public Cpf(String cpf) {
        if(cpf == null || !validarCpf(cpf)){
            throw new IllegalArgumentException("O cpf digitado não contem 11 digitos");
        }
        this.cpf = cpf;

    }

    public String getCpf() {
        return cpf;
    }

    private static boolean validarCpf(String cpf){
        if(cpf.length() == 11){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cpf{" +
                "cpf='" + cpf + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Cpf usuario = new Cpf("");

    }
}


