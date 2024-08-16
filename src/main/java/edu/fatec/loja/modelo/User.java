package edu.fatec.loja.modelo;

import java.util.Objects;

public class User {
    private final Login login;
    private final Adress adress;
    private final InfoUser infoUser;

    public User(Login login, Adress adress, InfoUser infoUser) {
        this.login = login;
        this.adress = adress;
        this.infoUser = infoUser;
    }

    public Login getLogin() {
        return login;
    }

    public Adress getAdress() {
        return adress;
    }

    public InfoUser getInfoUsuario() {
        return infoUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(adress, user.adress) && Objects.equals(infoUser, user.infoUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, adress, infoUser);
    }

    @Override
    public String toString() {
        return login + " " + adress + " " + infoUser;
    }

}
