package com.dt2.gtaVI.controller;

import com.dt2.gtaVI.entities.Veiculo;
import com.dt2.gtaVI.repository.VeiculoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/veiculos")
public class VeiculoController {

    private final VeiculoRepository repository;
    public VeiculoController(VeiculoRepository repository) {
        this.repository = repository;
    }
    @PostMapping
    public String criarVeiculo(@RequestBody Veiculo c){
        try {
            repository.save(c);
            return "Calvo com sucesso";
        } catch (Exception e) {
            return "Dados incorretos";
        }
    }
    @GetMapping
    public List<Veiculo> mostrar(){
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
    public  void atualizar(@PathVariable int id, @RequestBody Veiculo c){

        Veiculo veiculo = repository.getReferenceById(id);
        veiculo.setNome (c.getNome());
        veiculo.setMarca (c.getMarca());
        veiculo.setImagem (c.getImagem());
        veiculo.setDescricao (c.getDescricao());
        repository.save(veiculo);
    }
}
