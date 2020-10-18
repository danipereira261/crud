package com.example.demo.controller;


import com.example.demo.modelo.ClienteModel;
import com.example.demo.repositorio.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/v1/daniele")
public class TesteController {


    @Autowired
    ClienteRepository repository;

    @GetMapping
    public String get()  {
        return "Hello Word";
    }


    @GetMapping("/teste2")
    public int calculo (int numeroUm, int numeroDois){
        return numeroUm + numeroDois;

    }

    @GetMapping("/teste3")
    public ClienteModel buscarPorCpf(Long id){

        Optional<ClienteModel> clienteModel = repository.findById(id);
        return clienteModel.get();
    }
}
