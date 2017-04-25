/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.SupMag.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.SupMag.modelo.ProdutoMag;

/**
 *
 * @author gregorio
 */
public class ProdutoDAO {
    @PersistenceContext
    private EntityManager em;
    
    @Transactional
    public void salvar(ProdutoMag produto){
        em.persist(produto);
    }

    public List<ProdutoMag> buscarTodos() {
        TypedQuery<ProdutoMag> query = em.
                createQuery("select c from Usuario c", ProdutoMag.class);
        return query.getResultList();
    }
}
