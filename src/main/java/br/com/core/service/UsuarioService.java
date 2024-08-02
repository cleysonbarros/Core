package br.com.core.service;


import br.com.core.model.Usuario;
import br.com.core.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> listarUsuario() {
        return usuarioRepository.findAll();
    }

    public Usuario usuarioPorId(Long id){
       Optional<Usuario> obj = usuarioRepository.findById(id);
       return obj.get();
    }
}
