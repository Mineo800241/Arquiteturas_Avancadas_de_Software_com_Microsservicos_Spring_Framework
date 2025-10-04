package br.edu.infnet.maxwellpedidoapi.model.domain;

public class SemBebida {
    private String sempedidoBebida;

    public SemBebida(String sempedido_Bebida) {
        this.sempedidoBebida = sempedidoBebida;
    }

    public String getSempedidoBebida() {
        return sempedidoBebida;
    }

    public void setSempedidoBebida(String sempedidoBebida) {
        this.sempedidoBebida = sempedidoBebida;
    }
}
