package br.com.core.service;

import br.com.core.model.Pedido;
import br.com.core.model.Usuario;
import br.com.core.repository.PedidoRepository;
import br.com.core.service.exception.DatabaseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> listarPedido(){
        return pedidoRepository.findAll();
    }

    public Pedido usuarioPorId(Long id){
        Optional<Pedido> obj = pedidoRepository.findById(id);
        return obj.get();
    }

}
