package br.com.lucasm.vendinha.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SplittableRandom;

public class ItemCompra {
	
	private Produto produto;
	private Integer qtd;
	private BigDecimal total;
	
	public ItemCompra(Produto p, Integer qtd) {
		this.produto = p;
		this.qtd = qtd;
		this.total = p.getValor().multiply(BigDecimal.valueOf(this.qtd)); 
	}

	public Produto getProduto() {
		return produto;
	}

	public Integer getQtd() {
		return qtd;
	}

	public BigDecimal getTotal() {
		return total;
	}
}
