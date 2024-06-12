package SistemadeComprasEx3;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Mouse Gamer", 60.00, 1, "Este é um mouse de alta performance projetado para Gamers.");
        Produto produto2 = new Produto("Controle para Console", 300.00, 2, " Este controle tem a maior taxa de precisão em games para console.");
        Produto produto3 = new Produto("Teclado Mecânico", 220.00, 1, "Este teclado oferece uma experiência de digitação superior com suas teclas mecânicas.");
        Produto produto4 = new Produto("Notebook Gamer", 5807.00, 1, " Este notebook é uns dos mais rápidos do mercado.");
        Produto produto5 = new Produto("Cadeira Gamer", 789.00, 1, "Esta cadeira possui o maior conforto para se experimentar enquanto joga o seu game favorito.");


        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto3);
        carrinho.adicionarProduto(produto4);
        carrinho.adicionarProduto(produto5);

        carrinho.listarProdutos();
    }
}