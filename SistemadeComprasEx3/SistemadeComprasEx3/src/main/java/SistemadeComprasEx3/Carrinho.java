package SistemadeComprasEx3;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> produtos;

    Carrinho(){
        this.produtos = new ArrayList<>();
    }

    void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    double getTotal(){
        double total = 0;
        for(Produto produto : this.produtos){
            total += produto.getSubTotal();
        }
        return total;
    }

    void listarProdutos(){
        for(Produto produto : this.produtos){
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Descrição do Produto: " + produto.getDescricao());
            System.out.println("Valor Unit: R$ " + produto.getPreco());
            System.out.println("Qtd: " + produto.getQuantidade());
            System.out.println("Sub-total: R$" + produto.getSubTotal());
            System.out.println("---------------------------------------");
        }
        System.out.println("Total: R$" + this.getTotal());
    }
}

