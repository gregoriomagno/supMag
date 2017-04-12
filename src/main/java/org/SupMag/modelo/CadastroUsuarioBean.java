package org.SupMag.modelo;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.SupMag.dao.UsuarioDAO;

@Named(value = "cadastroUsuarioBean")
@RequestScoped
public class CadastroUsuarioBean {

    Usuario usuario = new Usuario();
    @Inject
    UsuarioDAO UsuarioDAO;
    public void adicionar() {
        UsuarioDAO.salvar(usuario);
        Usuario usuario = new Usuario(); 
    }

    public Usuario getUsuario() {
        return usuario;

    }

}
