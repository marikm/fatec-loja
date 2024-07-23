package edu.fatec.loja.service.infoUsuario;

import edu.fatec.loja.excecoes.InfoUsuarioException;

public class PerfilUsuario {

    private final String vendedorOuCliente;

    public PerfilUsuario(String vendedorOuCliente) throws InfoUsuarioException {
        if(vendedorOuCliente.isBlank()){
            throw new InfoUsuarioException("Perfil de usuario nao informado");
        }
        if (!validarPerfil(vendedorOuCliente)) {
            throw new InfoUsuarioException("Perfil de usuario invalido, deve ser vendedor ou cliente");
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
