package edu.fatec.loja.modelo;

import edu.fatec.loja.service.infoUsuario.Cpf;
import edu.fatec.loja.service.infoUsuario.UserProfile;

import java.util.Objects;

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

    public UserProfile getProfileUser() {
        return userProfile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InfoUser infoUser = (InfoUser) o;
        return Objects.equals(cpf, infoUser.cpf) && Objects.equals(userProfile, infoUser.userProfile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf, userProfile);
    }

    @Override
    public String toString() {
        return "InfoUsuario{" +
                "cpf=" + cpf +
                ", perfilUsuario=" + userProfile +
                '}';
    }

}
