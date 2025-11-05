package com.supermercado;

public class Pedido {
    private int numeroPedido;
    private CarrinhoDeCompras carrinho;
    private Cliente cliente;
    
    public int getNumeroPedido() {
        return this.numeroPedido;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return this.cliente;
    }
    
    public double calcularTotal() {
        return carrinho.calcularTotal();
    }
    
    public CarrinhoDeCompras getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(CarrinhoDeCompras carrinho) {
        this.carrinho = carrinho;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }    
    
    
}

