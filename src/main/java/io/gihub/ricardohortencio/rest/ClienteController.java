package io.gihub.ricardohortencio.rest;

import io.gihub.ricardohortencio.model.entity.Cliente;
import io.gihub.ricardohortencio.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {


    private final ClienteRepository repository;

    @Autowired
    public ClienteController(ClienteRepository repository){
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente salvar(@RequestBody Cliente cliente){
        return repository.save(cliente);
    }
    @GetMapping("{id}")
    public Cliente acharClientePorID(@PathVariable("id") Integer id){
    return repository
            .findById(id).orElseThrow(()
            ->new ResponseStatusException(HttpStatus.NOT_FOUND));
    }


}
