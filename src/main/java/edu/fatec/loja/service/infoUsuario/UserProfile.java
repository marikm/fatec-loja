package edu.fatec.loja.service.infoUsuario;

import edu.fatec.loja.excecoes.InfoUserException;

public class UserProfile {

    private final String vendedorOuCliente;

    public UserProfile(String vendedorOuCliente) throws InfoUserException {
        if(vendedorOuCliente.isBlank()){
            throw new InfoUserException("Perfil de usuario nao informado");
        }
        if (!validarPerfil(vendedorOuCliente)) {
            throw new InfoUserException("Perfil de usuario invalido, deve ser vendedor ou cliente");
        }
        this.vendedorOuCliente = vendedorOuCliente;
    }

    public static boolean validarPerfil(String vendedorOuCliente) {
        return vendedorOuCliente.equals("vendedor" )|| vendedorOuCliente.equals("cliente");
    }

    public String getVendedorOuCliente() {
        return vendedorOuCliente;

    }

    @Override
    public String toString() {
        return vendedorOuCliente;
    }
}
