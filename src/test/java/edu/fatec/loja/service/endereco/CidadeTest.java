package edu.fatec.loja.service.endereco;

import edu.fatec.loja.excecoes.EnderecoException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CidadeTest {

    @Test
    void testandoExcecoes() {
        assertEquals("Valor do nome ou estado da cidade nulo ou vazio", assertThrows(EnderecoException.class, () -> new Cidade("", "")).getMessage());
        assertEquals("Valor do nome ou estado da cidade nulo ou vazio", assertThrows(EnderecoException.class, () -> new Cidade("    ", "    ")).getMessage());
    }

    @Test
    void getEstado() throws EnderecoException {
        assertEquals("MG", new Cidade("sao gotardo", "MG").getEstado());
    }

    @Test
    void getNome() throws EnderecoException {
        assertEquals("sao gotardo", new Cidade("sao gotardo", "MG").getNome());
    }

    @Test
    void testToString() throws EnderecoException {
        assertEquals("aracatuba, UF = SP", new Cidade("aracatuba", "SP").toString());
    }
}