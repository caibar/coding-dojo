package com.prazoentrega;

public class Frete {

	public String prazoDestino(String origem, String destino) {
		String prazo;
		try {
			EstadoBrasileiro estadoOrigem = EstadoBrasileiro.valueOf(origem.toUpperCase());
			EstadoBrasileiro estadoDestino = EstadoBrasileiro.valueOf(destino.toUpperCase());
			prazo = estadoOrigem.equals(estadoDestino) ? "Entrega em 5 dias" : "Entrega em 15 dias";
		} catch (IllegalArgumentException ex) {
			prazo = "Estado inv�lido";
		} catch (NullPointerException ex) {
			prazo = "Estado inv�lido";
		}
		return prazo;
	}

}
