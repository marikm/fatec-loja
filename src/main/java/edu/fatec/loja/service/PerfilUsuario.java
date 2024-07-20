package edu.fatec.loja.service;

public class PerfilUsuario {

    private final String vendedorOuCliente;

    public PerfilUsuario(String vendedorOuCliente) {
        this.vendedorOuCliente = vendedorOuCliente;
    }

    public String getVendedorOuCliente() {
        return vendedorOuCliente;

    }

    @Override
    public String toString() {
        return "PerfilUsuario{" +
                "vendedorOuCliente='" + vendedorOuCliente + '\'' +
                '}';
    }
}
