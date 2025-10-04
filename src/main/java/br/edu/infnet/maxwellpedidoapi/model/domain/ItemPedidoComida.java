package br.edu.infnet.maxwellpedidoapi.model.domain;

import java.math.BigDecimal;

public class ItemPedidoComida {
    private int quantidade;
    private Comida comida;

    // Calcular o valor do produto x quantidade
    public BigDecimal calcularSubTotalComida(){
        return null; //quantidade x valor do produto
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }
}
