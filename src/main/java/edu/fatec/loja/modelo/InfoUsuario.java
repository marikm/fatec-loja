package edu.fatec.loja.modelo;

public class InfoUsuario {
    private final String cpf;
    private final String tipo;

    public InfoUsuario(String cpf, String tipo) {
        this.cpf = cpf;
        this.tipo = tipo;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "InfoUsuario{" +
                "cpf='" + cpf + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
