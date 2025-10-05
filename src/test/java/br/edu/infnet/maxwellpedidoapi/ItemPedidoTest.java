package br.edu.infnet.maxwellpedidoapi;

import br.edu.infnet.maxwellpedidoapi.model.domain.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemPedidoTest {


    private Produto produto;
    private Produto produto1;

    @BeforeEach
    void setup() {

    }

    @Test
    @DisplayName("Deve realizar o calculo do subtotal para o item do pedido valido")
    void deveCalcularSubTotal_quandoItemPedidoValido(){
        produto = new Produto("3",NomeProduto.HAMBURGER,TipoProduto.COMIDA,new BigDecimal("10.00"));
        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setProduto(produto);
        itemPedido.setQuantidade(1);

        BigDecimal valorEsperado = new BigDecimal("10.00");

        BigDecimal subTotalCalculado = itemPedido.calcularSubTotal();

        assertEquals(valorEsperado,subTotalCalculado, "O subtotal esperado é 10.00");
    }

    @Test
    @DisplayName("Deve retornar zero quando a quantidade for zero")
    void deveRetornarZero_quandoQuantidadeForZero(){

        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setQuantidade(0);

        BigDecimal valorEsperado = BigDecimal.ZERO;

        BigDecimal subTotalCalculado = itemPedido.calcularSubTotal();

        assertEquals(valorEsperado,subTotalCalculado,"O subtotal deve ser Zero quando a quantidade for Zero");
    }

    @Test
    @DisplayName("Deve retornar zero quando a quantidade for negativa")
    void deveRetornarZero_quandoQuantidadeForNegativa(){

        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setQuantidade(-1);

        BigDecimal valorEsperado = BigDecimal.ZERO;
//        BigDecimal valorEsperado = new BigDecimal("7.50");

        //Quando: chamar o metodo calcularSubtotal
        BigDecimal subTotalCalculado = itemPedido.calcularSubTotal();

        //Entao: resultado do subTotal sera valor esperado
        assertEquals(valorEsperado,subTotalCalculado, "O subtotal deve ser 0 quando a quantidade for negativa");
    }

    @Test
    @DisplayName("Deve retornar zero quando a quantidade for maior que 1")
    void deveRetornarZero_quandoQuantidadeForMaiorqueUm(){

        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setQuantidade(2);

        BigDecimal valorEsperado = BigDecimal.ZERO;

        BigDecimal subTotalCalculado = itemPedido.calcularSubTotal();

        assertEquals(valorEsperado,subTotalCalculado,"O subtotal deve ser Zero quando a quantidade for Maior que Zero");
    }

    @Test
    @DisplayName("Deve retornar zero quando produto estiver nulo")
    void deveRetornarZero_quandoProdutoNulo(){
        produto = new Produto("1",null,TipoProduto.COMIDA, new BigDecimal("2") );
        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setProduto(produto);
        itemPedido.setQuantidade(4);

        BigDecimal valorEsperado = BigDecimal.ZERO;

        //Quando: chamar o metodo calcularSubtotal
        BigDecimal subTotalCalculado = itemPedido.calcularSubTotal();

        //Entao: reusultado do subTotal sera valor esperado
        assertEquals(valorEsperado,subTotalCalculado, "O subtotal para Comida deve ser 0 quando a quantidade deve ser nulo");
    }


    @Test
    @DisplayName("Deve retornar zero quando o valor do produto estiver nulo")
    void deveRetornarZero_quandoValoProdutoNulo(){
        //Dado: um item de pedido com produto e quantidade válidos:
        produto = new Produto("1",NomeProduto.ACAI,TipoProduto.COMIDA,null );

        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setProduto(produto);
        itemPedido.setQuantidade(4);

        BigDecimal valorEsperado = BigDecimal.ZERO;

        BigDecimal subTotalCalculado = itemPedido.calcularSubTotal();

        assertEquals(valorEsperado,subTotalCalculado, "O subtotal deve ser 0 quando o valor da Comida nulo");
    }


    @Test
    @DisplayName("Deve retornar zero quandoComidaSim_BebidaNao")
    void deveRetornarZero_quandoComidaSim_BebidaNao(){

        produto = new Produto("1",NomeProduto.ACAI,TipoProduto.COMIDA,new BigDecimal("10.00"));
        produto1 = new Produto("3",NomeProduto.SEMBEBIDA,TipoProduto.SEMBEBIDA,new BigDecimal("10.00"));

        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setQuantidade(1);
        itemPedido.setProduto(produto);
        itemPedido.setProduto(produto1);

        BigDecimal valorEsperado = BigDecimal.ZERO;

        BigDecimal subTotalCalculado = itemPedido.calcularSubTotal();

        assertEquals(valorEsperado,subTotalCalculado, "Voce tem direito a uma bebida cortesia");
    }

    @Test
    @DisplayName("Deve retornar zero quandoComidaNao_BebidaSim")
    void deveRetornarZero_quandoComidaNao_BebidaSim(){

        produto = new Produto("1",NomeProduto.AGUA,TipoProduto.BEBIDA,new BigDecimal("10.00"));
        produto1 = new Produto("2",NomeProduto.SEMCOMIDA,TipoProduto.SEMCOMIDA,BigDecimal.ZERO);


        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setQuantidade(1);
        itemPedido.setProduto(produto);
        itemPedido.setProduto(produto1);

        BigDecimal valorEsperado = BigDecimal.ZERO;

        BigDecimal subTotalCalculado = itemPedido.calcularSubTotal();

        assertEquals(valorEsperado,subTotalCalculado, "Voce tem direito a uma comida cortesia");
    }

}
