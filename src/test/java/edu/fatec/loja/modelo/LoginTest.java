package edu.fatec.loja.modelo;

import static org.junit.jupiter.api.Assertions.*;

import edu.fatec.loja.excecoes.LoginException;
import edu.fatec.loja.service.login.Name;
import edu.fatec.loja.service.login.Password;
import org.junit.jupiter.api.Test;

class LoginTest {

    @Test
    void getUsername() throws LoginException {
        Login login1 = new Login(new Name("maria"), new Password("4545DCsj"));

        assertEquals(new Name("maria"), login1.getUsername());
    }

    @Test
    void getPassword() throws LoginException {
        Login login1 = new Login(new Name("maria"), new Password("4545DCsj"));

        assertEquals(new Password("4545DCsj"), login1.getPassword());
    }

    @Test
    void testEquals() throws LoginException {
        Login login1 = new Login(new Name("josé"), new Password("hDas456"));
        Login login2 = new Login(new Name("josé"), new Password("hDas456"));

        assertEquals(login1, login2);
    }

    @Test
    void testHashCode() throws LoginException {
        Login login1 = new Login(new Name("josé"), new Password("hDas456"));
        Login login2 = new Login(new Name("josé"), new Password("hDas456"));

        assertEquals(login1.hashCode(), login2.hashCode());
    }

    @Test
    void testToString() throws LoginException {
        Login login1 = new Login(new Name("josé"), new Password("hDas456"));

        assertEquals("Login{username=josé, password=hDas456}", login1.toString());
    }
}
