package br.com.sentencegenerator.service;


import br.com.sentencegenerator.dto.FraseDTO;
import br.com.sentencegenerator.model.Frase;
import br.com.sentencegenerator.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FraseService {

    @Autowired
    private FraseRepository repository;




    private FraseDTO converteDados(Frase frase){
        return new FraseDTO(frase.getSerie(),
                frase.getFrase(),
                frase.getPersonagem(),
                frase.getPoster());
    }

    public FraseDTO obterFrase() {
        return converteDados(repository.buscarFraseAleatoria());
    }
}
