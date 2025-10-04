package br.edu.infnet.maxwellpedidoapi.model.domain;

public class SemComida {
    private String sempedidoComida;


    public SemComida(String sempedido_Comida) {
        this.sempedidoComida = sempedidoComida;
    }

    public String getSempedidoComida() {
        return sempedidoComida;
    }

    public void setSempedidoComida(String sempedidoComida) {
        this.sempedidoComida = sempedidoComida;
    }
}
