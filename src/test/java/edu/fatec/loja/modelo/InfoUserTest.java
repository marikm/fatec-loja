package edu.fatec.loja.modelo;

import edu.fatec.loja.excecoes.InfoUserException;
import edu.fatec.loja.service.infoUsuario.Cpf;
import edu.fatec.loja.service.infoUsuario.UserProfile;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class InfoUserTest {

    @Test
    void getCpfOfInfoUser() throws InfoUserException {
        InfoUser user1 = new InfoUser(new Cpf("13212123"), new UserProfile("salesPerson"));
    }

    @Test
    void getProfileUser() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void testHashCode() {
    }

    @Test
    void testToString() {
    }
}