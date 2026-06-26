package br.com.sentencegenerator.controller;

import br.com.sentencegenerator.dto.FraseDTO;
import br.com.sentencegenerator.repository.FraseRepository;
import br.com.sentencegenerator.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series")
public class FraseController {

    @Autowired
    private FraseService service;

    @GetMapping("/frases")
    public FraseDTO obterFrasesDeSeries(){
        return service.obterFrase();
    }

}
