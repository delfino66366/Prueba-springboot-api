package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Usuario;
import com.example.demo.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

   
    @GetMapping
    public List<Usuario> listar() {
        return service.obtenerTodos();
    }

    
    @PostMapping
    public Usuario crear(@RequestBody Usuario usuario) {
        return service.guardar(usuario);
    }

  
    @GetMapping("/{id}")
    public Usuario obtener(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

   
    @PutMapping("/{id}")
    public Usuario actualizar(@PathVariable Long id, @RequestBody Usuario usuario) {
        usuario.setId(id);
        return service.guardar(usuario);
    }

    
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}