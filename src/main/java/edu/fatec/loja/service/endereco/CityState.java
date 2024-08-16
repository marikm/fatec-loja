package edu.fatec.loja.service.endereco;

import br.com.brasilapi.BrasilAPI;
import edu.fatec.loja.excecoes.AdressException;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CityState cityState = (CityState) o;
        return Objects.equals(cep, cityState.cep);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cep);
    }

    @Override
    public String toString() {
        return "cidade="+ BrasilAPI.cep(cep).getCity() + ", " + "estado=" + BrasilAPI.cep(cep).getState();
    }
}
