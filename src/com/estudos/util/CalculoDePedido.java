package com.estudos.util;

import com.estudos.entities.Pedido;

import java.math.BigDecimal;

public class CalculoDePedido {
    public static final Double iof = 0.06;

    public static BigDecimal calculaTotalPedido(Pedido pedido) {
        return pedido.moeda.cotacaoEmReal.multiply((calculaIof(pedido.quantidade).add(BigDecimal.valueOf(pedido.quantidade))));
    }

    public static BigDecimal calculaIof(Double quantidade) {
        return BigDecimal.valueOf(quantidade * iof);

    }
}
