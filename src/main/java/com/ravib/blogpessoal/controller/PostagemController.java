package com.ravib.blogpessoal.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ravib.blogpessoal.model.Postagem;
import com.ravib.blogpessoal.repository.PostagemRepository;

@RestController
@RequestMapping("/postagens")
public class PostagemController {
    
    @Autowired
    private PostagemRepository postagemRepository;
    
    @GetMapping
    public List<Postagem> getAll() {
        return postagemRepository.findAll();
    }
}