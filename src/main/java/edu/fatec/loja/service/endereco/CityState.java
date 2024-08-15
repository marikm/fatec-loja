package edu.fatec.loja.service.endereco;

import br.com.brasilapi.BrasilAPI;
import edu.fatec.loja.excecoes.AdressException;

public class CityState {
    private final String cep;

    public CityState(String cep) throws AdressException {
        if (cep == null || cep.isBlank()) {
            throw new AdressException("Cep value null or uninformed");
        }
        this.cep = cep;
    }

    public String getCep() {
        return cep ;
    }

    public String getCityName() {
        return BrasilAPI.cep(cep).getCity();
    }

    public String getStateName() {
        return BrasilAPI.cep(cep).getState();
    }

    @Override
    public String toString() {
        return BrasilAPI.cep(cep).getCity() + ", " + BrasilAPI.cep(cep).getState();
    }
}
