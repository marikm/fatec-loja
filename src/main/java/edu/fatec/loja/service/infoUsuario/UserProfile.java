package edu.fatec.loja.service.infoUsuario;

import edu.fatec.loja.excecoes.InfoUserException;

public class UserProfile {

    private final String option;

    public UserProfile(String option) throws InfoUserException {
        if(option == null || option.isBlank()){
            throw new InfoUserException("Profile user not informed");
        }
        if (!validateProfile(option)) {
            throw new InfoUserException("Invalid profile user, just salesPerson or client");
        }
        this.option = option;
    }

    public static boolean validateProfile(String salesPersonOrClient) {
        return salesPersonOrClient.equals("salesPerson" )|| salesPersonOrClient.equals("client");
    }

    public String getOption() {
        return option;
    }

    @Override
    public String toString() {
        return option;
    }
}
