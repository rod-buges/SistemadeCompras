package SistemadeComprasEx3;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private String descricao;

    Produto(String nome, double preco, int quantidade, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.descricao = descricao;
    }

    String getNome() {
        return this.nome;
    }

    double getPreco() {
        return this.preco;
    }

    int getQuantidade() {
        return this.quantidade;
    }

    String getDescricao() {
        return this.descricao;
    }

    double getSubTotal(){
        return preco*quantidade;
    }
}


