package br.com.fiap.aula6app;

import java.io.Serializable;

/**
 * Created by jeff on 11/17/15.
 */
public class ProdutoBean implements Serializable {

    //Metodo Construtor Padrao
    public ProdutoBean() {}

    private String nome;
    private double preco;

    @Override
    public String toString() {
        return this.nome + " = " + this.preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
