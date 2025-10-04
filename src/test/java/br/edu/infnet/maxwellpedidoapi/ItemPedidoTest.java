package br.edu.infnet.maxwellpedidoapi;

import br.edu.infnet.maxwellpedidoapi.model.domain.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemPedidoTest {

    private Produto produto;
    private Comida comida;
    private Bebida bebida;
    private SemComida sempedidocomida;
    private SemBebida sempedidobebida;

    @BeforeEach
    void setup() {

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
    @DisplayName("Deve retornar zero quando a Comida estiver nulo")
    //void deveCalcularSubTotal_quandoItemPedidoValido()
    void deveRetornarZero_quandoProdutoComidaNulo(){

        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setComida(null);
        itemPedido.setQuantidade(4);
//        itemPedido.setProduto(produto);
//        itemPedido.setQuantidade(3);

       BigDecimal valorEsperado = BigDecimal.ZERO;
//        BigDecimal valorEsperado = new BigDecimal("7.50");

        //Quando: chamar o metodo calcularSubtotal
        BigDecimal subTotalCalculado = itemPedido.calcularSubTotal();

        //Entao: reusultado do subTotal sera valor esperado
        assertEquals(valorEsperado,subTotalCalculado, "O subtotal para Comida deve ser 0 quando a quantidade deve ser nulo");
    }

    @Test
    @DisplayName("Deve retornar zero quando a Bebida estiver nulo")
        //void deveCalcularSubTotal_quandoItemPedidoValido()
    void deveRetornarZero_quandoProdutoBebidaNulo(){

        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setBebida(null);
        itemPedido.setQuantidade(4);
//        itemPedido.setProduto(produto);
//        itemPedido.setQuantidade(3);

        BigDecimal valorEsperado = BigDecimal.ZERO;
//        BigDecimal valorEsperado = new BigDecimal("7.50");

        //Quando: chamar o metodo calcularSubtotal
        BigDecimal subTotalCalculado = itemPedido.calcularSubTotal();

        //Entao: reusultado do subTotal sera valor esperado
        assertEquals(valorEsperado,subTotalCalculado, "O subtotal para Bebida deve ser 0 quando a quantidade deve ser nulo");
    }


    @Test
    @DisplayName("Deve retornar zero quando o valor da Comida estiver nulo")
        //void deveCalcularSubTotal_quandoItemPedidoValido()
    void deveRetornarZero_quandoValorComidaNulo(){
        //Dado: um item de pedido com produto e quantidade válidos:
        comida = new Comida("1","ACAI",null);

        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setComida(comida);
        itemPedido.setQuantidade(4);

        BigDecimal valorEsperado = BigDecimal.ZERO;

        BigDecimal subTotalCalculado = itemPedido.calcularSubTotal();

        assertEquals(valorEsperado,subTotalCalculado, "O subtotal deve ser 0 quando o valor da Comida nulo");
    }

    @Test
    @DisplayName("Deve retornar zero quando o valor da Bebiba estiver nulo")
        //void deveCalcularSubTotal_quandoItemPedidoValido()
    void deveRetornarZero_quandoValorBebidaNulo(){
        //Dado: um item de pedido com produto e quantidade válidos:
        bebida = new Bebida("1","AGUA",null);


        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setBebida(bebida);
        itemPedido.setQuantidade(4);

        BigDecimal valorEsperado = BigDecimal.ZERO;

        //Quando: chamar o metodo calcularSubtotal
        BigDecimal subTotalCalculado = itemPedido.calcularSubTotal();

        //Entao: reusultado do subTotal sera valor esperado
        assertEquals(valorEsperado,subTotalCalculado, "O subtotal deve ser 0 quando o valor da Bebida for nulo");
    }

    @Test
    @DisplayName("Deve retornar zero quando sem Comida")

    void deveRetornarZero_quandoSemComida(){

        sempedidocomida = new SemComida("SEMESCOLHER");


        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setSempedidocomida(sempedidocomida);
        itemPedido.setComida(comida);


        BigDecimal valorEsperado = BigDecimal.ZERO;

        BigDecimal subTotalCalculado = itemPedido.calcularSubTotal();

        assertEquals(valorEsperado,subTotalCalculado, "Sem Comida");
    }



    @Test
    @DisplayName("Deve retornar zero quandoComidaNao_BebidaSim")
    void deveRetornarZero_quandoComidaNao_BebidaSim(){

        bebida = new Bebida("1","AGUA",BigDecimal.ONE);
        sempedidocomida = new SemComida("sem_comida");


        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setSempedidocomida(sempedidocomida);
        itemPedido.setBebida(bebida);



        BigDecimal valorEsperado = BigDecimal.ZERO;

        BigDecimal subTotalCalculado = itemPedido.calcularSubTotal();

        assertEquals(valorEsperado,subTotalCalculado, "Voce tem direito a uma comida cortesia");
    }




}
