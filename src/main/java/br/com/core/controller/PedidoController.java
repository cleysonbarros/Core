package br.com.core.controller;

import br.com.core.model.Pedido;
import br.com.core.model.Usuario;
import br.com.core.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/pedido")
@RequestMapping
public class PedidoController {
    
    @Autowired
    private PedidoService pedidoService;


    @GetMapping
    public ResponseEntity<List<Pedido>> listarUsuario() {
        List<Pedido> PedidoLista = pedidoService.listarPedido();
        return new ResponseEntity<List<Pedido>>(PedidoLista, HttpStatus.OK);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Pedido> findById(@PathVariable Long id) {
        Pedido obj = pedidoService.usuarioPorId(id);
        return ResponseEntity.ok().body(obj);
    }

}
