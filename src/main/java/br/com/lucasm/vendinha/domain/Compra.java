package br.com.lucasm.vendinha.domain;

import java.math.BigDecimal;
import java.util.Random;

public class Compra {
	
	private Produto produto;
	private Cliente cliente;
	private Integer qtd;
	private BigDecimal total;
	private BigDecimal valorUnit;
	private Random id;
	
	public Compra(Cliente c, Produto p, Integer qtd) {
		this.produto = p;
		this.cliente = c;
		this.qtd = qtd;
		this.valorUnit = p.getValor();
		this.total = p.getValor().multiply(BigDecimal.valueOf(this.qtd)); 
		this.id = new Random();
	}

	public Random getId() {
		return id;
	}

	public BigDecimal getValorUnit() {
		return valorUnit;
	}

	public Produto getProduto() {
		return produto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Integer getQtd() {
		return qtd;
	}

	public BigDecimal getTotal() {
		return total;
	}
}
