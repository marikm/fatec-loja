package edu.fatec.loja.service;

public class PerfilUsuario {

    private final String vendedorOuCliente;

    public PerfilUsuario(String vendedorOuCliente) {
        if (vendedorOuCliente == null || !validarPerfil(vendedorOuCliente)) {
            throw new IllegalArgumentException("Perfil de usuario invalido");
        }
        this.vendedorOuCliente = vendedorOuCliente;
    }

    private boolean validarPerfil(String vendedorOuCliente){
        if(vendedorOuCliente == "vendedor" || vendedorOuCliente == "cliente"){
            return true;
        }
        return false;
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
