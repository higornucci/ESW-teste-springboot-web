package com.example.testingweb.produto;

public class ValorInvalidoException extends Exception {
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Nao eh possivel adicionar produtos com valores negativos.";
	}
}
