package com.prazoentrega.test;

import static org.junit.Assert.assertEquals;

import java.util.LinkedHashSet;

import org.junit.Test;

import com.prazoentrega.Produto;

public class ProdutoTest {
	@Test
	public void testCalculaFreteCursoLocalmente() {
		LinkedHashSet<Produto> cestaCurso = new LinkedHashSet<Produto>();
		cestaCurso.add(new Produto(0, "Guia do exame SCJP", 1));
		assertEquals("20 Entrega em 5 dias", new Produto().checkout(cestaCurso, "SP", "SP"));
	}

	@Test
	public void testCalculaFreteLocalDiferente() {
		LinkedHashSet<Produto> cestaCurso = new LinkedHashSet<Produto>();
		cestaCurso.add(new Produto(0, "Guia do exame SCJP", 1));
		cestaCurso.add(new Produto(1, "Dominando Hibernate", 2));
		assertEquals("60 Entrega em 15 dias", new Produto().checkout(cestaCurso, "BA", "SP"));
	}

	@Test
	public void testCaculaFreteMenosUmKg() {
		LinkedHashSet<Produto> cestaCurso = new LinkedHashSet<Produto>();
		cestaCurso.add(new Produto(0, "Guia do exame SCJP", 0.500));
		assertEquals("10 Entrega em 5 dias", new Produto().checkout(cestaCurso, "SP", "SP"));
	}

	@Test
	public void testCalculaMaisUmKg() {
		LinkedHashSet<Produto> cestaCurso = new LinkedHashSet<Produto>();

		cestaCurso.add(new Produto(0, "Guia do exame SCJP", 1));
		cestaCurso.add(new Produto(1, "Dominando Hibernate", 2));
		cestaCurso.add(new Produto(3, "TomCat Administrador", 1));
		cestaCurso.add(new Produto(4, "Core JSF 2.0", 1));
		cestaCurso.add(new Produto(5, "Certificação LPI", 1));
		assertEquals("120 Entrega em 5 dias", new Produto().checkout(cestaCurso, "RJ", "rj"));
	}
}
