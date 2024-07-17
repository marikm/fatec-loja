package edu.fatec.loja.modelo;

public class Endereco {
    private final String cidade;
    private final String rua;
    private final String numeroCasa;

    public Endereco(String cidade, String rua, String numeroCasa) {
        if (cidade == null || cidade.isEmpty()) {
            throw new IllegalArgumentException("Por favor, digite o nome da cidade");
        }
        if (rua == null || rua.isEmpty()) {
            throw new IllegalArgumentException("Por favor, digite o nome da rua");
        }
        if (numeroCasa == null || numeroCasa.isEmpty()) {
            throw new IllegalArgumentException("Por favor, digite o numero da casa");
        }

        this.cidade = cidade;
        this.rua = rua;
        this.numeroCasa = numeroCasa;
    }

    public String getCidade() {
        return cidade;
    }

    public String getRua() {
        return rua;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cidade='" + cidade + '\'' +
                ", rua='" + rua + '\'' +
                ", numeroCasa='" + numeroCasa + '\'' +
                '}';
    }

}











