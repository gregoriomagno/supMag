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
import org.SupMag.modelo.Usuario;

/**
 *
 * @author gregorio
 */
public class UsuarioDAO {
    @PersistenceContext
    private EntityManager em;
    
    @Transactional
    public void salvar(Usuario usuario){
        em.persist(usuario);
    }

    public List<Usuario> buscarTodos() {
        TypedQuery<Usuario> query = em.
                createQuery("select c from Usuario c", Usuario.class);
        return query.getResultList();
    }

  
    
    
            
}
