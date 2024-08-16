package edu.fatec.loja.modelo;

import edu.fatec.loja.excecoes.AdressException;
import edu.fatec.loja.service.endereco.CityState;
import edu.fatec.loja.service.endereco.HouseNumber;

public class Adress {
    private final CityState cityState;
    private final String rua;
    private final HouseNumber houseNumber;

    public Adress(CityState cityState, String rua, HouseNumber houseNumber) throws AdressException {
        if (rua.isBlank()) {
            throw new AdressException("Valor do campo rua nulo ou vazio");
        }
        this.cityState = cityState;
        this.rua = rua;
        this.houseNumber = houseNumber;
    }

    public CityState getCityState() {
        return cityState;
    }

    public String getRua() {
        return rua;
    }

    public HouseNumber getNumeroCasa() {
        return houseNumber;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cidade=" + cityState +
                ", rua='" + rua + '\'' +
                ", numeroCasa=" + houseNumber +
                '}';
    }
}











