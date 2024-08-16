package edu.fatec.loja.modelo;

import edu.fatec.loja.excecoes.InfoUserException;
import edu.fatec.loja.service.infoUsuario.Cpf;
import edu.fatec.loja.service.infoUsuario.UserProfile;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InfoUserTest {

    @Test
    void getCpfOfInfoUser() throws InfoUserException {
        InfoUser user1 = new InfoUser(new Cpf("07172152298"), new UserProfile("salesPerson"));
        assertEquals(new Cpf("07172152298"), user1.getCpf());
    }

    @Test
    void getProfileUser() throws InfoUserException {
        InfoUser user1 = new InfoUser(new Cpf("07172152298"), new UserProfile("salesPerson"));
        assertEquals(new UserProfile("salesPerson"), user1.getProfileUser());
    }

    @Test
    void testEqualsInfoUser() throws InfoUserException {
        InfoUser user1 = new InfoUser(new Cpf("07172152298"), new UserProfile("salesPerson"));
        InfoUser user2 = new InfoUser(new Cpf("07172152298"), new UserProfile("salesPerson"));

        assertEquals(user1, user2);
    }

    @Test
    void testHashCode() throws InfoUserException {
        InfoUser user1 = new InfoUser(new Cpf("07172152298"), new UserProfile("salesPerson"));
        InfoUser user2 = new InfoUser(new Cpf("07172152298"), new UserProfile("salesPerson"));

        assertEquals(user1.hashCode(), user2.hashCode());
    }

    @Test
    void testToString() throws InfoUserException {
        InfoUser user1 = new InfoUser(new Cpf("07172152298"), new UserProfile("salesPerson"));
        assertEquals("InfoUser{cpf=07172152298, userProfile=salesPerson}", user1.toString());
    }
}