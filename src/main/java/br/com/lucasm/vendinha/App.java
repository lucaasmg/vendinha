package br.com.lucasm.vendinha;

import java.math.BigDecimal;

import br.com.lucasm.vendinha.domain.Cliente;
import br.com.lucasm.vendinha.domain.Compra;
import br.com.lucasm.vendinha.domain.Produto;

public class App {

    public static void main(String[] args) {
    	Produto p1 = new Produto("cenoura", BigDecimal.valueOf(0.5));
    	Produto p2 = new Produto("casa", BigDecimal.valueOf(1500.35));
    	Produto p3 = new Produto("carro", BigDecimal.valueOf(8790.25));
    	
    	Cliente carlos = new Cliente("Carlos");
    	
    	Compra compra = carlos.comprar(p2, 5);
    	
    	System.out.println("Cliente...: " + compra.getCliente().getNome());
    	System.out.println("Produto...: " + compra.getProduto().getNome());
    	System.out.println("Qtd.......: " + compra.getQtd());
    	System.out.println("Valor.....: " + compra.getValorUnit());
    	System.out.println("Total.....: " + compra.getTotal());
    }
}
