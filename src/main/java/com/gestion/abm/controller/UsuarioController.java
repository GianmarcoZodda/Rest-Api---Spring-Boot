/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestion.abm.controller;

import com.gestion.abm.models.Usuario;
import com.gestion.abm.services.IUsuarioService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Usuario
 */
@RequestMapping("/usuarios")
@RestController //@ResponseBody implicito en cada metodo, devuelve datos en lugar de vistas (como lo haria en una web app)
@Validated
public class UsuarioController {
    
    @Autowired
    private IUsuarioService usuarioService;
    
    @PostMapping("/crear")
    public void saveUsuario(@Valid @RequestBody Usuario usuario){
        this.usuarioService.saveUsuario(usuario);
    }
    
    @GetMapping("/listar")
    public List<Usuario> getUsuarios(){
        return this.usuarioService.getUsuarios();
    }
    
    @GetMapping("/obtener/{id}")
    public Usuario detailsUsuario(@PathVariable Long id){
        return this.usuarioService.findUsuario(id);
    }
    
    @DeleteMapping("/borrar/{id}")
    public void deleteUsuario(@PathVariable Long id){
        this.usuarioService.deleteUsuario(id);
    }
    
    @PutMapping("/editar/{id}")
    public void editUsuario(@PathVariable Long id, @Valid @RequestBody Usuario usuario){
        //obtengo el usuario
      if (usuarioService.findUsuario(id) != null) {
          //si no esta, tiro un error (aparece en el jspn)
        throw new RuntimeException("Usuario no encontrado con ID: " + id);
    }
    usuario.setId(id); // le seteo el id que me vino por parametro
    usuarioService.saveUsuario(usuario); // uso el metodo del servicio para guardarlo
    }
    
}
