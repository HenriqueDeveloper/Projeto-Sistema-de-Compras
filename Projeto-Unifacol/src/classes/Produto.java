package classes;

import java.util.Scanner;

public class Produto {
	
	private String nome;
	private double preco;
	private double total;
	private int codCliente;
	private int qtd;

	public Produto(double total) {
		this.total = total;
	}

	public Produto() {
	}
	
	
	public int getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {

		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {

		this.preco = preco;
	}
}
