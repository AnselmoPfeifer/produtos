package com.anselmopfeifer.controller;

/**
 * Created by anselmo on 22/08/16.
 */
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.anselmopfeifer.controller.Produto;

@ManagedBean
@SessionScoped
public class GestaoProdutosBean {

    private List<Produto> produtos;
    private Produto produto;

    public GestaoProdutosBean() {
        this.produtos = new ArrayList<Produto>();
        this.produto = new Produto();
    }

    public void incluir() {
        this.produtos.add(this.produto);
        this.produto = new Produto();
    }

    public Produto getProduto() {
        return produto;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

}