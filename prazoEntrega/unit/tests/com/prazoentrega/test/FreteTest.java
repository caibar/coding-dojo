package com.prazoentrega.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.prazoentrega.Frete;

public class FreteTest {

	@Test
	public void testPrazoEntregaLocal() {
		assertEquals("Entrega em 5 dias", new Frete().prazoDestino("SP", "sp"));
	}

	@Test
	public void testPrazoEntregaForaEstado() {
		assertEquals("Entrega em 15 dias", new Frete().prazoDestino("BA", "SP"));
	}
	
	@Test
	public void testPrazoEntragaEstadoOrigemSemSigla(){
		assertEquals("Estado inválido", new Frete().prazoDestino("São Paulo", "SP"));
	}
	
	@Test
	public void testPrazoEntragaEstadoEmpty(){
		assertEquals("Estado inválido", new Frete().prazoDestino("", ""));
	}
	
	@Test
	public void testPrazoEntragaEstadoNull(){
		assertEquals("Estado inválido", new Frete().prazoDestino(null, null));
	}
	
	@Test
	public void testPrazoEntragaEstadoComNumero(){
		assertEquals("Estado inválido", new Frete().prazoDestino("234", "sc23"));
	}
	
	@Test
	public void testPrazoEntragaEstadoNaoBrasileiro(){
		assertEquals("Estado inválido", new Frete().prazoDestino("UU", "WW"));
	}

}
