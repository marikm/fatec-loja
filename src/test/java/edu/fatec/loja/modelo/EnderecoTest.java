package edu.fatec.loja.modelo;

import edu.fatec.loja.excecoes.EnderecoException;
import edu.fatec.loja.service.endereco.Cidade;
import edu.fatec.loja.service.endereco.NumeroCasa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnderecoTest {

    @Test
    public void validandoSaidaDasExcecoes(){
        assertEquals("Valor do nome ou estado da cidade nulo ou vazio", assertThrows(EnderecoException.class, () -> new Endereco(new Cidade("", "MG"), "A", new NumeroCasa("270"))).getMessage());
        assertEquals("Valor do campo rua nulo ou vazio", assertThrows(EnderecoException.class, () -> new Endereco( new Cidade("Araçatuba", "SP"), "", new NumeroCasa("500"))).getMessage());
        assertEquals("Valor do campo numero da casa nulo ou vazio", assertThrows(EnderecoException.class, () -> new Endereco( new Cidade("Araçatuba", "SP"), "A", new NumeroCasa(""))).getMessage());
    }

    @SuppressWarnings("EmptyMethod")
    @Test
    public void verificaGettersEstaoCorretos() throws EnderecoException {
        Endereco enderecoTeste = new Endereco(new Cidade("Aracatuba", "SP"), "A", new NumeroCasa("270"));
        assertEquals(new Cidade("Aracatuba", "SP").toString(), enderecoTeste.getCidade().toString());
        assertEquals("A", enderecoTeste.getRua());
        assertEquals(new NumeroCasa("270").toString(), enderecoTeste.getNumeroCasa().toString());

    }

    @Test
    public void testToString() throws EnderecoException {
        final Endereco endereco = new Endereco(new Cidade("Araçatuba", "SP"), "A", new NumeroCasa("270"));
        assertEquals("Endereco{cidade=Araçatuba, UF = SP, rua='A', numeroCasa=270}", endereco.toString());
    }
}