package supermercado;

public class Pedido {
    private int numeroPedido;
    private CarrinhoDeCompras carrinho;
    private Cliente cliente;
    
    public int getNumeroPedido() {
        return this.numeroPedido;
    }

    public String getNomeCliente() {
        return this.cliente.getNome();
    }

    public String getCpfCliente() {
        return this.cliente.getCpf();
    }

    public String getEmailCliente() {
        return this.cliente.getEmail();
    }   

    public void fecharPedido() {
        System.out.println("Numero do pedido: " + numeroPedido);
        if(this.cliente != null) {
            System.out.println("Cliente: " + cliente.getNome());
        }
        System.out.println("Total do pedido: " + this.carrinho.calcularTotal());
        System.out.println("=====================================");
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

