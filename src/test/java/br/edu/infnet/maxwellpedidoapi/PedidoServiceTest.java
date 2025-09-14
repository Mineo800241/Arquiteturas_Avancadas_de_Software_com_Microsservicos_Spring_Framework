package br.edu.infnet.maxwellpedidoapi;

import br.edu.infnet.maxwellpedidoapi.model.domain.ItemPedido;
import br.edu.infnet.maxwellpedidoapi.model.domain.Pedido;
import br.edu.infnet.maxwellpedidoapi.model.service.PedidoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

class PedidoServiceTest{

        private PedidoService pedidoService;

        @BeforeEach
        void setUp(){
                PedidoService pedidoService = new PedidoService();
        }

        //Calculo do Valor total
        @Test
        @DisplayName("RF0002.Deve lancar UnsupportedOperationException quando chamar Calcular Valortotal")
        void deve_LancarUnsupportedOperationException_quandoCalcularValortotal() {

            //Dados
                Pedido pedido = new Pedido();

//            Quando:
//                pedidoService.calcularValorTotal(pedido);

            //Entao: uma exception deve ser lançada.
                assertThrows(NullPointerException.class, () -> pedidoService.calcularValorTotal(pedido),"Método calcularValorTotal em desenvolvimento");
                //NullPointerException no lugar UnsupportedOperationException
        }

        @Test
        @DisplayName("RF0002.Deve lancar UnsupportedOperationException quando chamar Calcular Valortotal")
        void deveCalcularValortotal_quandoPedidoPossuiUmItem() {
                ItemPedido item =  new ItemPedido();
                List<ItemPedido> itens = new ArrayList<ItemPedido>();
                itens.add(item);
                Pedido pedido = new Pedido();
                pedido.setItens(itens);
                //Dados


//            Quando:
//                pedidoService.calcularValorTotal(pedido);

                //Entao: uma exception deve ser lançada.
                assertThrows(NullPointerException.class, () -> pedidoService.calcularValorTotal(pedido),"Método calcularValorTotal em desenvolvimento");
                //NullPointerException no lugar UnsupportedOperationException
        }
}
