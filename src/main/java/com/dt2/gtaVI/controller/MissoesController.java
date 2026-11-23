package com.dt2.gtaVI.controller;

    import com.dt2.gtaVI.entities.Missoes;
import com.dt2.gtaVI.repository.MissoesRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/missoes")
public class MissoesController {

    private final MissoesRepository repository;
    public MissoesController(MissoesRepository repository){
        this.repository = repository;
    }

    @PostMapping
    public String criarMissao(@RequestBody Missoes m){
        try {
            repository.save(m);
            return "Calvo com sucesso";
        } catch (Exception e) {
            return "Dados incorretos";
        }
    }

    @GetMapping
    public List<Missoes> mostrar(){
        return repository.findAll();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id){
        repository.deleteById(id);
    }

    @GetMapping("/{id}")
    public void buscarId(@PathVariable int id){
        repository.findById(id);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable int id, @RequestBody Missoes m){

        Missoes missoes = repository.getReferenceById(id);
        missoes.setNome(m.getNome());
        missoes.setLocal(m.getLocal());
        missoes.setDificuldade(m.getDificuldade());
        missoes.setImagem(m.getImagem());
        missoes.setDescricao(m.getDescricao());
    }
}
