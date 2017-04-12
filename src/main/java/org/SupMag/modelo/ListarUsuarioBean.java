/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.SupMag.modelo;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.SupMag.dao.UsuarioDAO;



/**
 *
 * @author gregorio
 */
    

@Named(value = "ListarUsuario")
@RequestScoped
public class ListarUsuarioBean {
    @Inject
    private UsuarioDAO dao;
    private List<Usuario> usuario;

    @PostConstruct
    private void init(){
        this.usuario = dao.buscarTodos();
    }
    
    public List<Usuario> getUsuario() {
        return usuario;
    }
    
}