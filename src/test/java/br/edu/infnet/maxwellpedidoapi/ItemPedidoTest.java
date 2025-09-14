package br.edu.infnet.maxwellpedidoapi;

import br.edu.infnet.maxwellpedidoapi.model.domain.ItemPedido;
import br.edu.infnet.maxwellpedidoapi.model.domain.Produto;
import br.edu.infnet.maxwellpedidoapi.model.domain.tipoProduto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemPedidoTest {

//    private ItemPedido itemTeste;
//
//    public ItemPedidoTest(ItemPedido item) {
//        this.itemTeste = item;
//    }
    private Produto produto;

    @BeforeEach
    void setup() {

    }

    @Test
    @DisplayName("Deve retornar zero quando a quantidade for negativa")
        //void deveCalcularSubTotal_quandoItemPedidoValido()
    void deveRetornarZero_quandoQuantidadeForNegativa(){
        //Dado: um item de pedido com produto e quantidade válidos:
        produto = new Produto("1","ACAI",null);

        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setProduto(produto);
        itemPedido.setQuantidade(-1);
//        itemPedido.setProduto(produto);
        itemPedido.setQuantidade(0);
//        itemPedido.setQuantidade(3);

        BigDecimal valorEsperado = BigDecimal.ZERO;
//        BigDecimal valorEsperado = new BigDecimal("7.50");

        //Quando: chamar o método calcularSubtotal
        BigDecimal subTotalCalculado = itemPedido.calcularSubTotal();

        //Entao: reusultado do subTotal sera valor esperado
        assertEquals(valorEsperado,subTotalCalculado, "O subtotal deve ser 0 quando a quantidade for negativa");
    }

    @Test
    @DisplayName("Deve retornar zero quando o produto estiver nulo")
    //void deveCalcularSubTotal_quandoItemPedidoValido()
    void deveRetornarZero_quandoProdutoNulo(){
        //Dado: um item de pedido com produto e quantidade válidos:
//        produto = new Produto("1","ACAI",new BigDecimal("2.50"));

        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setProduto(null);
        itemPedido.setQuantidade(4);
//        itemPedido.setProduto(produto);
        itemPedido.setQuantidade(0);
//        itemPedido.setQuantidade(3);

       BigDecimal valorEsperado = BigDecimal.ZERO;
//        BigDecimal valorEsperado = new BigDecimal("7.50");

        //Quando: chamar o método calcularSubtotal
        BigDecimal subTotalCalculado = itemPedido.calcularSubTotal();

        //Entao: reusultado do subTotal sera valor esperado
        assertEquals(valorEsperado,subTotalCalculado, "O subtotal deve ser 0 quando a quantidade deve ser nulo");
    }

    @Test
    @DisplayName("Deve retornar zero quando o valor do produto estiver nulo")
        //void deveCalcularSubTotal_quandoItemPedidoValido()
    void deveRetornarZero_quandoValorProdutoNulo(){
        //Dado: um item de pedido com produto e quantidade válidos:
        produto = new Produto("1","ACAI",null);

        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setProduto(produto);
        itemPedido.setQuantidade(4);
//        itemPedido.setProduto(produto);
        itemPedido.setQuantidade(0);
//        itemPedido.setQuantidade(3);

        BigDecimal valorEsperado = BigDecimal.ZERO;
//        BigDecimal valorEsperado = new BigDecimal("7.50");

        //Quando: chamar o método calcularSubtotal
        BigDecimal subTotalCalculado = itemPedido.calcularSubTotal();

        //Entao: reusultado do subTotal sera valor esperado
        assertEquals(valorEsperado,subTotalCalculado, "O subtotal deve ser 0 quando a quantidade deve ser nulo");
    }

}
