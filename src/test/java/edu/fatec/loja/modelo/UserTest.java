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
    void getLogin() throws AdressException, LoginException, InfoUserException {
        Login login1 = new Login(new Name("maria"), new Password("Sdw1456d"));
        Adress adress1 = new Adress(new CityState("38800000"), "Oliveiras", new HouseNumber(123));
        InfoUser infoUser1 = new InfoUser(new Cpf("71982196670"), new UserProfile("salesPerson"));
        User user1 = new User(login1, adress1, infoUser1);

        Login login2 = new Login(new Name("maria"), new Password("Sdw1456d"));
        assertEquals(login2, user1.getLogin());
    }

    @Test
    void getAdress() throws AdressException, LoginException, InfoUserException {
        Login login1 = new Login(new Name("maria"), new Password("Sdw1456d"));
        Adress adress1 = new Adress(new CityState("38800000"), "Oliveiras", new HouseNumber(123));
        InfoUser infoUser1 = new InfoUser(new Cpf("71982196670"), new UserProfile("salesPerson"));
        User user1 = new User(login1, adress1, infoUser1);

        Adress adress2 = new Adress(new CityState("38800000"), "Oliveiras", new HouseNumber(123));
        assertEquals(adress2, user1.getAdress());
    }

    @Test
    void getInfoUsuario() throws AdressException, LoginException, InfoUserException  {
        Login login1 = new Login(new Name("maria"), new Password("Sdw1456d"));
        Adress adress1 = new Adress(new CityState("38800000"), "Oliveiras", new HouseNumber(123));
        InfoUser infoUser1 = new InfoUser(new Cpf("71982196670"), new UserProfile("salesPerson"));
        User user1 = new User(login1, adress1, infoUser1);

        InfoUser infoUser2 = new InfoUser(new Cpf("71982196670"), new UserProfile("salesPerson"));
        assertEquals(infoUser2, user1.getInfoUsuario());
    }

    @Test
    void testEquals() throws AdressException, LoginException, InfoUserException {
        Login login1 = new Login(new Name("maria"), new Password("Sdw1456d"));
        Adress adress1 = new Adress(new CityState("38800000"), "Oliveiras", new HouseNumber(123));
        InfoUser infoUser1 = new InfoUser(new Cpf("71982196670"), new UserProfile("salesPerson"));
        User user1 = new User(login1, adress1, infoUser1);

        Login login2 = new Login(new Name("maria"), new Password("Sdw1456d"));
        Adress adress2 = new Adress(new CityState("38800000"), "Oliveiras", new HouseNumber(123));
        InfoUser infoUser2 = new InfoUser(new Cpf("71982196670"), new UserProfile("salesPerson"));
        User user2 = new User(login2, adress2, infoUser2);

        assertEquals(user1, user2);
    }

    @Test
    void testHashCode() throws AdressException, LoginException, InfoUserException {
        Login login1 = new Login(new Name("maria"), new Password("Sdw1456d"));
        Adress adress1 = new Adress(new CityState("38800000"), "Oliveiras", new HouseNumber(123));
        InfoUser infoUser1 = new InfoUser(new Cpf("71982196670"), new UserProfile("salesPerson"));
        User user1 = new User(login1, adress1, infoUser1);

        Login login2 = new Login(new Name("maria"), new Password("Sdw1456d"));
        Adress adress2 = new Adress(new CityState("38800000"), "Oliveiras", new HouseNumber(123));
        InfoUser infoUser2 = new InfoUser(new Cpf("71982196670"), new UserProfile("salesPerson"));
        User user2 = new User(login2, adress2, infoUser2);

        assertEquals(user1.hashCode(), user2.hashCode());
    }

    @Test
    void testToString() throws AdressException, LoginException, InfoUserException {
        Login login1 = new Login(new Name("maria"), new Password("Sdw1456d"));
        Adress adress1 = new Adress(new CityState("38800000"), "Oliveiras", new HouseNumber(123));
        InfoUser infoUser1 = new InfoUser(new Cpf("71982196670"), new UserProfile("salesPerson"));

        User user1 = new User(login1, adress1, infoUser1);
        assertEquals("Login{username=maria, password=Sdw1456d} Endereco{cidade=São Gotardo, estado=MG, rua='Oliveiras', numeroCasa=123} InfoUser{cpf=71982196670, userProfile=salesPerson}", user1.toString());
    }
}