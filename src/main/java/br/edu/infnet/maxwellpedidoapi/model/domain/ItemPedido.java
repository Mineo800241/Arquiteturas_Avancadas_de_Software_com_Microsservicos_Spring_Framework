package br.edu.infnet.maxwellpedidoapi.model.domain;

import java.math.BigDecimal;

public class ItemPedido {
    private int quantidade;
    private Produto produto;

    public BigDecimal calcularSubTotal(){
        return null; //quantidade x valor do produto
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
