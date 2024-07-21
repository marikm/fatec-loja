package edu.fatec.loja.modelo;

import edu.fatec.loja.excecoes.EnderecoException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnderecoTest {

    final Endereco endereco = new Endereco("Araçatuba", "A", "270");

    EnderecoTest() throws EnderecoException { // nao entendi isso aqui
    }

    @Test
    public void validandoSaidaDasExcecoes(){
        assertEquals("Valor do campo cidade nulo ou vazio", assertThrows(EnderecoException.class, () -> new Endereco("", "A", "324")).getMessage());
        assertEquals("Valor do campo rua nulo ou vazio", assertThrows(EnderecoException.class, () -> new Endereco("São Gotardo", "", "30")).getMessage());
        assertEquals("Valor do campo numero da casa nulo ou vazio", assertThrows(EnderecoException.class, () -> new Endereco("São Gotardo", "A", "")).getMessage());

    }

    @Test
    public void verificaGettersEstaoCorretos(){
        assertEquals("Araçatuba", endereco.getCidade());
        assertEquals("A", endereco.getRua());
        assertEquals("270", endereco.getNumeroCasa());
    }

    @Test
    public void testToString() {
        assertEquals("Endereco{cidade='Araçatuba', rua='A', numeroCasa='270'}", endereco.toString());
    }
}