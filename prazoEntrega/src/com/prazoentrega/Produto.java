package com.prazoentrega;

import java.util.LinkedHashSet;

public class Produto {

	private int id;
	private String titulo;
	private double pesoKg;

	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public double getPesoKg() {
		return pesoKg;
	}

	public Produto(int id, String titulo, double pesoKg) {
		this.id = id;
		this.titulo = titulo;
		this.pesoKg = pesoKg;
	}

	public Produto() {
	}

	public String checkout(LinkedHashSet<Produto> cestaCurso, String origem, String destino) {
		Frete frete = new Frete();
		StringBuilder builder = new StringBuilder();
		Double valor = 20 * getPesoCesta(cestaCurso);
		builder.append(valor.longValue()).append(" ").append(frete.prazoDestino(origem, destino));
		return builder.toString();
	}

	private double getPesoCesta(LinkedHashSet<Produto> cestaCurso) {
		double pesoCesta = 0;
		for (Produto produto : cestaCurso) {
			pesoCesta += produto.getPesoKg();
		}
		return pesoCesta;
	}

}
