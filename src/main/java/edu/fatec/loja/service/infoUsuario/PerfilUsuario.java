package edu.fatec.loja.service.infoUsuario;

import edu.fatec.loja.excecoes.InfoUsuarioException;

public class PerfilUsuario {

    private final String vendedorOuCliente;

    public PerfilUsuario(String vendedorOuCliente) throws InfoUsuarioException {
        if (!validarPerfil(vendedorOuCliente)) {
            throw new InfoUsuarioException("Perfil de usuario invalido");
        }
        this.vendedorOuCliente = vendedorOuCliente;
    }

    private boolean validarPerfil(String vendedorOuCliente) {
        return vendedorOuCliente.equals("vendedor" )|| vendedorOuCliente.equals("cliente");
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
