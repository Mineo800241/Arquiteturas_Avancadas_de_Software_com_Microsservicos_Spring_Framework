package br.edu.infnet.maxwellpedidoapi.model.domain;

import java.math.BigDecimal;

public class ItemPedido {
    private int quantidade;
    private Produto produto;
    private Comida comida;
    private Bebida bebida;
    private SemComida sempedidocomida;
    private SemBebida sempedidobebida;

    // Calcular o valor do produto x quantidade
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

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public SemComida getSempedidocomida() {
        return sempedidocomida;
    }

    public void setSempedidocomida(SemComida sempedidocomida) {
        this.sempedidocomida = sempedidocomida;
    }

    public SemBebida getSempedidobebida() {
        return sempedidobebida;
    }

    public void setSempedidobebida(SemBebida sempedidobebida) {
        this.sempedidobebida = sempedidobebida;
    }
}
