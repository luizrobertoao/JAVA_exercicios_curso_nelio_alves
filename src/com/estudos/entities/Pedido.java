package com.estudos.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private LocalDateTime momento;
    private StatusPedidoEnum status;
    private Cliente cliente;
    private List<ItemPedido> itensPedido = new ArrayList<>();

    public Pedido() {
    }

    public Pedido(LocalDateTime momento, StatusPedidoEnum status, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }

    public LocalDateTime getMomento() {
        return momento;
    }

    public void setMomento(LocalDateTime momento) {
        this.momento = momento;
    }

    public StatusPedidoEnum getStatus() {
        return status;
    }

    public void setStatus(StatusPedidoEnum status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getItensPedido() {
        return itensPedido;
    }


    public void adicionarItem(ItemPedido item) {
        itensPedido.add(item);
    }

    public void removerItem(ItemPedido item) {
        itensPedido.remove(item);
    }

    public BigDecimal totalPedido() {

        final BigDecimal[] valorTotalPedido = {BigDecimal.ZERO};

        itensPedido.forEach(i -> {
            valorTotalPedido[0] = valorTotalPedido[0].add(i.subTotal(i));
        });
        return valorTotalPedido[0];
    }
}
