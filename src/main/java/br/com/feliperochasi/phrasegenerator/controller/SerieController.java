package br.com.feliperochasi.phrasegenerator.controller;

import br.com.feliperochasi.phrasegenerator.dto.SerieDTO;
import br.com.feliperochasi.phrasegenerator.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series/frases")
public class SerieController {
    @Autowired
    private SerieService serieService;

    @GetMapping("")
    public SerieDTO getPhrase() {
        return serieService.getPhrase();
    }
}
