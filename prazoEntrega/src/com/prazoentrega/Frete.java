package com.prazoentrega;

public class Frete {

	public String prazoDestino(String origem, String destino) {
		String prazo;
		try {
			EstadoBrasileiro estadoOrigem = EstadoBrasileiro.valueOf(origem.toUpperCase());
			EstadoBrasileiro estadoDestino = EstadoBrasileiro.valueOf(destino.toUpperCase());
			prazo = estadoOrigem.equals(estadoDestino) ? "Entrega em 5 dias" : "Entrega em 15 dias";
		} catch (IllegalArgumentException ex) {
			prazo = "Estado inválido";
		} catch (NullPointerException ex) {
			prazo = "Estado inválido";
		}
		return prazo;
	}

}
