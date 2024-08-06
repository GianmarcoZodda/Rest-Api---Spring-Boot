/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gestion.abm.services;

import com.gestion.abm.models.Usuario;
import java.util.List;


/**
 *
 * @author Usuario
 */
public interface IUsuarioService {
    
    
    public void saveUsuario(Usuario usuario);
    
    public List<Usuario> getUsuarios();
    
    public void deleteUsuario(Long id);
    
    public void editUsuario(Long id, Usuario usuario);
    
    public Usuario findUsuario(Long id);
}
