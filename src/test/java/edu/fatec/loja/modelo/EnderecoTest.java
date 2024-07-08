package edu.fatec.loja.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnderecoTest {

    final Endereco endereco = new Endereco("Araçatuba", "A", "270");

    @Test
    public void verificaGettersEstaoCorretos(){
        assertEquals("Araçatuba", endereco.getCidade());
        assertEquals("A", endereco.getRua());
        assertEquals("270", endereco.getNumeroCasa());

        assertThrows(IllegalArgumentException.class, () -> new Endereco("", "", ""));
        assertThrows(IllegalArgumentException.class, () -> new Endereco("São Gotardo", "", "30"));
        assertThrows(IllegalArgumentException.class, () -> new Endereco("São Gotardo", "A", ""));

    }


    @Test
    public void testToString() {
        assertEquals("Endereco{cidade='Araçatuba', rua='A', numeroCasa='270'}", endereco.toString());
    }
}