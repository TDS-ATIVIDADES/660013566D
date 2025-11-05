package supermercado;

public class Supermercado {

    public static void main(String[] args) {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        Produto produto1 = new Produto("Arroz", 1, 3.99);
        carrinho.adicionarProduto(produto1);
        
        Produto produto2 = new Produto("Filé de frango sassami", 2, 21.99);
        carrinho.adicionarProduto(produto2);
        
        carrinho.calcularTotal();

        Pedido pedido = new Pedido();
        pedido.setNumeroPedido(1);
        pedido.setCarrinho(carrinho);
        pedido.fecharPedido();

    }
}