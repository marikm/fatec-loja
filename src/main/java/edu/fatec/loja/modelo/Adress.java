package edu.fatec.loja.modelo;

import br.com.brasilapi.api.CEP;
import edu.fatec.loja.excecoes.AdressException;
import edu.fatec.loja.service.endereco.CityState;
import edu.fatec.loja.service.endereco.HouseNumber;

public class Adress {

    private final CEP cep;
    private final String street;
    private final HouseNumber houseNumber;
    private final String city;
    private final String state;

    public Adress(CEP cep, String street, HouseNumber houseNumber) throws AdressException {
        if (street.isBlank()) {
            throw new AdressException("Valor do campo rua nulo ou vazio");
        }
        this.cep = cep;
        this.street = street;
        this.houseNumber = houseNumber;
        city = new CityState(cep.toString()).getCityName();
        state = new CityState(cep.toString()).getStateName();
    }

    public CEP getCep() {
        return cep;
    }

    public String getStreet() {
        return street;
    }

    public HouseNumber getHouseNumber() {
        return houseNumber;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cidade=" + city +
                "estado=" + state +
                ", rua='" + street + '\'' +
                ", numeroCasa=" + houseNumber +
                '}';
    }
}











