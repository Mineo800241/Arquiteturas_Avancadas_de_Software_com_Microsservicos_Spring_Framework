package br.edu.infnet.maxwellpedidoapi.model.domain;

import java.math.BigDecimal;

public class Produto {

    // criar o id
    private String codigo;
    private NomeProduto nomeproduto;
    private TipoProduto tipoProduto;
    private BigDecimal valor;

    public Produto(String codigo, NomeProduto nomeproduto, TipoProduto tipoProduto, BigDecimal valor) {
        this.codigo = codigo;
        this.nomeproduto = nomeproduto;
        this.tipoProduto = tipoProduto;
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public TipoProduto getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(TipoProduto tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public NomeProduto getNomeproduto() {
        return nomeproduto;
    }

    public void setNomeproduto(NomeProduto nomeproduto) {
        this.nomeproduto = nomeproduto;
    }
}

