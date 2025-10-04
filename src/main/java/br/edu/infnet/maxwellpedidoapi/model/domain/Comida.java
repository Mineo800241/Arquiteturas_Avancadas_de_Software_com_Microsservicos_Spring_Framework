package br.edu.infnet.maxwellpedidoapi.model.domain;

import java.math.BigDecimal;

public class Comida {

    // criar o id
    private String codigo;
    private String nomeProduto;
    private TipoProduto tipoProduto;
    private BigDecimal valor;

    public Comida(String number, String acai, BigDecimal bigDecimal) {
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

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
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
}

