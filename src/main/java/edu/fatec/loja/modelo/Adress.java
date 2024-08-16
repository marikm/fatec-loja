package edu.fatec.loja.modelo;

import edu.fatec.loja.excecoes.AdressException;
import edu.fatec.loja.service.endereco.CityState;
import edu.fatec.loja.service.endereco.HouseNumber;

import java.util.Objects;

public class Adress {
    private final CityState cityState;
    private final String street;
    private final HouseNumber houseNumber;

    public Adress(CityState cityState, String street, HouseNumber houseNumber) throws AdressException {
        if (street == null || street.isBlank()) {
            throw new AdressException("Field street null or blank");
        }
        this.cityState = cityState;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public CityState getCityState() {
        return cityState;
    }

    public String getStreet() {
        return street;
    }

    public HouseNumber getNumeroCasa() {
        return houseNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adress adress = (Adress) o;
        return Objects.equals(cityState, adress.cityState) && Objects.equals(street, adress.street) && Objects.equals(houseNumber, adress.houseNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityState, street, houseNumber);
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cidade=" + cityState +
                ", rua='" + street + '\'' +
                ", numeroCasa=" + houseNumber +
                '}';
    }
}











