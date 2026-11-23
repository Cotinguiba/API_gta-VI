package com.dt2.gtaVI.controller;

import com.dt2.gtaVI.entities.Armas;
import com.dt2.gtaVI.repository.ArmasRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/armas")
public class ArmaController {

    private final ArmasRepository repository;
    public ArmaController(ArmasRepository repository){
        this.repository = repository;
    }

    @PostMapping
    public String criarArma(@RequestBody Armas armas){
        try {
            repository.save(armas);
            return "Salvo com sucesso";
        }catch (Exception e){
            return "Dados incorretos";
        }
    }

    @GetMapping
    public List<Armas> mostrar(){
        return repository.findAll();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id){
        repository.findById(id);
    }

    @GetMapping("/{id}")
    public void buscarId (@PathVariable int id){
        repository.findById(id);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable int id, @RequestBody Armas a){

        Armas arma = repository.getReferenceById(id);
        arma.setNome(a.getNome());
        arma.setFabricante(a.getFabricante());
        arma.setDescricao(a.getDescricao());
        arma.setImagem(a.getImagem());
    }

}
