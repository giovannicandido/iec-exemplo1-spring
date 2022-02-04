package pro.gsilva.exemplo1.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pro.gsilva.exemplo1.model.Pessoa;
import pro.gsilva.exemplo1.service.PessoaService;

@RestController
@RequestMapping(value = "/api/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService service;

    @PostMapping
    public ResponseEntity<?> post(@RequestBody Pessoa pessoa) {
        int id = service.create(pessoa);
        return ResponseEntity.created(URI.create("http://localhost:8080/api/pessoa/" + id)).build();
    }

    @GetMapping
    public ResponseEntity<List<Pessoa>> getPessoas() {
        return ResponseEntity.ok(service.findAll());
    }
    
}
