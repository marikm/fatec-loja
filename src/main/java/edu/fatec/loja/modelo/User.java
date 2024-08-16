package edu.fatec.loja.modelo;

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

    public Adress getEndereco() {
        return adress;
    }

    public InfoUser getInfoUsuario() {
        return infoUser;
    }

    @Override
    public String toString() {
        return login + " " + adress + " " + infoUser;
    }

}
