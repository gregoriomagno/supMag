/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.SupMag.modelo;

/**
 *
 * @author gregorio
 */
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.SupMag.dao.ProdutoDAO;

@Named(value = "cadastroProdutoBean")
@RequestScoped
public class CadastroProduto {
    ProdutoMag produto = new ProdutoMag();
    @Inject
    ProdutoDAO ProdutoDAO;
    public void adicionar() {
        ProdutoDAO.salvar(produto);
        ProdutoMag produto = new ProdutoMag(); 
    }

    public ProdutoMag getProdutoMag() {
        return produto;

    }
}
