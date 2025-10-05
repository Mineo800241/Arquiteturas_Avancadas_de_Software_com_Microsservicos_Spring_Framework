package br.edu.infnet.maxwellpedidoapi.model.domain;

import java.math.BigDecimal;

public class ItemPedido {
    private int quantidade;
    private Produto produto;

    // Calcular o valor do produto x quantidade
    public BigDecimal calcularSubTotal(){
        if (quantidade <= 0){
            return BigDecimal.ZERO;
        }

        if (quantidade > 1){
            return BigDecimal.ZERO;
        }

        if(produto.getNomeproduto() == null){
            return BigDecimal.ZERO;
        }

        if (produto.getValor()== null){
            return BigDecimal.ZERO;
        }

        if(produto.getNomeproduto() == NomeProduto.SEMCOMIDA){
            return BigDecimal.ZERO;
        }

        if (produto.getTipoProduto()==TipoProduto.SEMCOMIDA){
            return BigDecimal.ZERO;
        }

        if (produto.getNomeproduto() == NomeProduto.SEMBEBIDA){
            return BigDecimal.ZERO;
        }

        if(produto.getTipoProduto() == TipoProduto.SEMBEBIDA){
            return BigDecimal.ZERO;
        }

        return produto.getValor().multiply(new BigDecimal(quantidade));
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getComida() {
        return produto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
