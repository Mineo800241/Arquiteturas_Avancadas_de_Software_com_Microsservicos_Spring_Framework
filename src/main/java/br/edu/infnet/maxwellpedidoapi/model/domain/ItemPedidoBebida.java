package br.edu.infnet.maxwellpedidoapi.model.domain;

import java.math.BigDecimal;

public class ItemPedidoBebida {
    private int quantidade;
    private Bebida bebida;
    //private SemBebida sembebida;

    // Calcular o valor do produto x quantidade
    public BigDecimal calcularSubTotalBebida(){
        return null; //quantidade x valor do produto
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }
}
