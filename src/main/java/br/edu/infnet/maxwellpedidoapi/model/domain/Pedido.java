package br.edu.infnet.maxwellpedidoapi.model.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
    private String numerodoPedido;
    private LocalDateTime dataPedido;
    private List<ItemPedido> itens;
    private StatusPedido status; //avaliar
    private String competidor; //cliente

    public Pedido(){
        this.dataPedido = LocalDateTime.now();
        this.status = StatusPedido.PENDENTE;
    }

    public String getCompetidor() {
        return competidor;
    }

    public void setCompetidor(String competidor) {
        this.competidor = competidor;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public String getNumerodoPedido() {
        return numerodoPedido;
    }

    public void setNumerodoPedido(String numerodoPedido) {
        this.numerodoPedido = numerodoPedido;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }
}
