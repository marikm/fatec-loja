package edu.fatec.loja.modelo;

import edu.fatec.loja.service.infoUsuario.Cpf;
import edu.fatec.loja.service.infoUsuario.PerfilUsuario;


public class InfoUsuario {
    private final Cpf cpf;
    private final PerfilUsuario perfilUsuario;

    public InfoUsuario(Cpf cpf, PerfilUsuario perfilUsuario) {
        this.cpf = cpf;
        this.perfilUsuario = perfilUsuario;
    }

    public Cpf getCpf() {
        return cpf;
    }

    public PerfilUsuario getPerfilUsuario() {
        return perfilUsuario;
    }

    @Override
    public String toString() {
        return "InfoUsuario{" +
                "cpf=" + cpf +
                ", perfilUsuario=" + perfilUsuario +
                '}';
    }


}
