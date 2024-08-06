/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestion.abm.services;

import com.gestion.abm.models.Usuario;
import com.gestion.abm.repository.IUsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    private IUsuarioRepository usuariosRepository;

    @Override
    public void saveUsuario(Usuario usuario) {
        this.usuariosRepository.save(usuario);
    }

    @Override
    public List<Usuario> getUsuarios() {
        return this.usuariosRepository.findAll();
    }

    @Override
    public void deleteUsuario(Long id) {
       this.usuariosRepository.deleteById(id);
    }

    @Override
    public void editUsuario(Long id, Usuario usuario) {
        this.saveUsuario(usuario);
    }

    @Override
    public Usuario findUsuario(Long id) {
       return this.usuariosRepository.findById(id).orElse(null);
    }
    
    

}
