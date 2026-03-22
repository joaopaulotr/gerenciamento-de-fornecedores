package com._exercicios.demo.services;


import com._exercicios.demo.models.FornecedorModel;
import com._exercicios.demo.repositories.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public FornecedorModel criarFornecedor(FornecedorModel fornecedorModel){return fornecedorRepository.save(fornecedorModel);}

    public List<FornecedorModel> buscarTodosFornecedores(){return fornecedorRepository.findAll();}

    public FornecedorModel buscarPorId(Long idInformado){
        java.util.Optional<FornecedorModel> fornecedorOptional = fornecedorRepository.findById(idInformado);
        if(fornecedorOptional.isPresent()){
            return fornecedorOptional.get();
        }else{
            throw new RuntimeException("Fornecedor não encontrado com o ID:"+idInformado);
        }
    }
}
