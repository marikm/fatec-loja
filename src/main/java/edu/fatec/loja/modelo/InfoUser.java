package edu.fatec.loja.modelo;

import edu.fatec.loja.service.infoUsuario.Cpf;
import edu.fatec.loja.service.infoUsuario.UserProfile;


public class InfoUser {
    private final Cpf cpf;
    private final UserProfile userProfile;

    public InfoUser(Cpf cpf, UserProfile userProfile) {
        this.cpf = cpf;
        this.userProfile = userProfile;
    }

    public Cpf getCpf() {
        return cpf;
    }

    public UserProfile getPerfilUsuario() {
        return userProfile;
    }

    @Override
    public String toString() {
        return "InfoUsuario{" +
                "cpf=" + cpf +
                ", perfilUsuario=" + userProfile +
                '}';
    }


}
