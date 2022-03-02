package br.com.monktec.meusgastos.controller;

import br.com.monktec.meusgastos.entity.Gasto;
import br.com.monktec.meusgastos.entity.GastoRequest;
import br.com.monktec.meusgastos.service.GastoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gasto")
public class GastoController {

    @Autowired
    private GastoService gastoService;

    @GetMapping
    public ResponseEntity<List<Gasto>> todos(){
        var gasto = gastoService.todos();

        return ResponseEntity.status(HttpStatus.CREATED).body(gasto);
    }

    @PostMapping
    public ResponseEntity<List<Gasto>> novoGasto(@RequestBody GastoRequest gastoRequest){
        var gasto = gastoService.novoGasto(gastoRequest);

        return ResponseEntity.status(HttpStatus.CREATED).body(gasto);
    }
}
