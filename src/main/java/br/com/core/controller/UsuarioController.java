package br.com.core.controller;


import br.com.core.model.Usuario;
import br.com.core.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<Usuario>> listarUsuario() {
        List<Usuario> listarUsuarios = usuarioService.listarUsuario();
        return new ResponseEntity<List<Usuario>>(listarUsuarios, HttpStatus.OK);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> usuarioPorId(@PathVariable Long id) {
        Usuario listar = usuarioService.usuarioPorId(id);
        return ResponseEntity.ok().body(listar);
    }
}
