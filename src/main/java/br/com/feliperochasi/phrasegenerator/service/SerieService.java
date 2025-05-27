package br.com.feliperochasi.phrasegenerator.service;

import br.com.feliperochasi.phrasegenerator.dto.SerieDTO;
import br.com.feliperochasi.phrasegenerator.model.Serie;
import br.com.feliperochasi.phrasegenerator.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SerieService {
    @Autowired
    private SerieRepository repository;

    public SerieDTO getPhrase() {
        return convertData(repository.getPhraseFromDatabase());
    }

    private SerieDTO convertData(Serie serie) {
        return new SerieDTO(serie.getTitle(), serie.getPhrase(), serie.getCharacter(), serie.getPoster());
    }
}
