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

@RestController
@RequestMapping("/pedido")
public class PedidoController {
    
    @Autowired
    private PedidoService pedidoService;


    @GetMapping
    public ResponseEntity<List<Pedido>> listarPedido() {
        List<Pedido> PedidoLista = pedidoService.listarPedido();
        return new ResponseEntity<List<Pedido>>(PedidoLista, HttpStatus.OK);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> pedidoPorId(@PathVariable Long id) {
        Pedido pedidoId = pedidoService.pedidoPorId(id);
        return ResponseEntity.ok().body(pedidoId);
    }

}
