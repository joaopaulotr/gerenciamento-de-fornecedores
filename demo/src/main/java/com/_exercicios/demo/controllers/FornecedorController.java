package com._exercicios.demo.controllers;


import com._exercicios.demo.models.FornecedorModel;
import com._exercicios.demo.services.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/tarefas")
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;

    @PostMapping
    public FornecedorModel criarForecedor(@RequestBody FornecedorModel fornecedorModel){
        return fornecedorService.criarFornecedor(fornecedorModel);
    }

    @GetMapping
    public List<FornecedorModel> buscarTodosFornecedores(){return fornecedorService.buscarTodosFornecedores();}

    @GetMapping("/{id}")
    public FornecedorModel buscarPorId(@PathVariable Long id){return fornecedorService.buscarPorId(id);}

    @DeleteMapping("/{id}")
    public void deletarFornecedor(@PathVariable Long id){fornecedorService.deletarFornecedor(id);}
}
