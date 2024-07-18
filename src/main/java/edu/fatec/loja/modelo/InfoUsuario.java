package edu.fatec.loja.modelo;

import edu.fatec.loja.service.InfoUsuarioValido;

import java.util.Objects;

public class InfoUsuario {
    private final InfoUsuarioValido cpf;
    private final InfoUsuarioValido tipo;

    public InfoUsuario(InfoUsuarioValido cpf, InfoUsuarioValido tipo) {
        this.cpf = cpf;
        this.tipo = tipo;
    }

    public InfoUsuarioValido getCpf() {
        return cpf;
    }

    public InfoUsuarioValido getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "InfoUsuario{" +
                "cpf='" + cpf + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InfoUsuario that = (InfoUsuario) o;
        return Objects.equals(cpf, that.cpf) && Objects.equals(tipo, that.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf, tipo);
    }
}
