package br.edu.infnet.maxwellpedidoapi.model.domain;

import java.math.BigDecimal;

public class Produto {
    // criar o id
    private String codigo;
    private String nomeProduto;
    private tipoProduto tipoProduto;
    private BigDecimal valor;

    public Produto(String number, String acai, BigDecimal bigDecimal) {
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.tipoProduto = tipoProduto;
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public tipoProduto getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(tipoProduto tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
}
