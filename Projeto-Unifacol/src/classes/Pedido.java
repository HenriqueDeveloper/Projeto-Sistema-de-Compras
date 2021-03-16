package classes;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private int codigo;
	Cliente cliente;
	List<Produto> produto;

	public Pedido(int codigo, List<Produto> produto) {
		this.codigo = codigo;
		this.produto = produto;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

	public Pedido() {
		super();
	}

}
