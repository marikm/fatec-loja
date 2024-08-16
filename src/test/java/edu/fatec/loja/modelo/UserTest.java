package edu.fatec.loja.modelo;

import edu.fatec.loja.excecoes.AdressException;
import edu.fatec.loja.excecoes.InfoUserException;
import edu.fatec.loja.excecoes.LoginException;
import edu.fatec.loja.service.endereco.CityState;
import edu.fatec.loja.service.endereco.HouseNumber;
import edu.fatec.loja.service.infoUsuario.Cpf;
import edu.fatec.loja.service.infoUsuario.UserProfile;
import edu.fatec.loja.service.login.Name;
import edu.fatec.loja.service.login.Password;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void getLogin() throws LoginException, AdressException, InfoUserException {
        User userTeste = new User(new Login(new Name("marina"), new Password("Ab123123")),
                new Adress(new CityState("38800000"), "nomeRua", new HouseNumber(123)),
                new edu.fatec.loja.modelo.InfoUser(new Cpf("09809889012"), new UserProfile("vendedor")));

        assertEquals("Login{nomeUsuario=marina, senha=Ab123123}", userTeste.getLogin().toString());
    }

    @Test
    void getEndereco() throws LoginException, AdressException, InfoUserException {
        User userTeste = new User(new Login(new Name("marina"), new Password("Ab123123")),
                new Adress(new CityState("38800000"), "nomeRua", new HouseNumber(123)),
                new edu.fatec.loja.modelo.InfoUser(new Cpf("09809889012"), new UserProfile("vendedor")));

        assertEquals("Endereco{cidade=sao gotardo, UF = MG, rua='nomeRua', numeroCasa=123}", userTeste.getEndereco().toString());
    }

    @Test
    void getInfoUsuario() throws LoginException, AdressException, InfoUserException {
        User userTeste = new User(new Login(new Name("marina"), new Password("Ab123123")),
                new Adress(new CityState("38800000"), "nomeRua", new HouseNumber(123)),
                new edu.fatec.loja.modelo.InfoUser(new Cpf("09809889012"), new UserProfile("vendedor")));

        assertEquals("InfoUsuario{cpf=09809889012, perfilUsuario=vendedor}", userTeste.getInfoUsuario().toString());
    }

    @Test
    void testToString() throws AdressException, LoginException, InfoUserException {
        User userTeste = new User(new Login(new Name("marina"), new Password("Ab123123")),
                new Adress(new CityState("38800000"), "nomeRua", new HouseNumber(123)),
                new edu.fatec.loja.modelo.InfoUser(new Cpf("09809889012"), new UserProfile("vendedor")));

        assertEquals("Login{nomeUsuario=marina, senha=Ab123123} Endereco{cidade=sao gotardo, UF = MG, rua='nomeRua', numeroCasa=123} InfoUsuario{cpf=09809889012, perfilUsuario=vendedor}", userTeste.toString());

    }
}