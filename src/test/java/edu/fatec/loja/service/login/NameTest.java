package edu.fatec.loja.service.login;

import edu.fatec.loja.excecoes.LoginException;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class NameTest {

    @Test
    public void checkingExceptionsName(){
        assertDoesNotThrow(() -> new Name("Marina"));
        LoginException e = assertThrows(LoginException.class, ()-> new Name(""));
        assertEquals("Name is null or blank", e.getMessage());
    }

    @Test
    void getNome() throws LoginException {
        assertEquals("maria",new Name("maria").getValue());
    }

    @Test
    void testEquals() throws LoginException {
        Name person1 = new Name("João");
        Name person2 = new Name("João");

        assertEquals(person1, person2);
    }

    @Test
    void testHashCode() throws LoginException {
        Name person1 = new Name("João");
        Name person2 = new Name("João");

        assertEquals(person1.hashCode(), person2.hashCode());
    }

    @Test
    void testToString() throws LoginException {
        assertEquals("maria",new Name("maria").toString());
    }

}