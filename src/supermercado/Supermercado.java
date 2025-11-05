package supermercado;

public class Supermercado {

    public static void main(String[] args) {

        CarrinhoDeCompras c = new CarrinhoDeCompras();
        c.adicionarProduto("Arroz", 1, 3.99);
        c.adicionarProduto("Filé de frango sassami", 2, 21.99);
        c.calcularTotal();

        Pedido p = new Pedido();
        p.setNumeroPedido(1);
        p.setCarrinho(c);
        p.fecharPedido();

    }
}