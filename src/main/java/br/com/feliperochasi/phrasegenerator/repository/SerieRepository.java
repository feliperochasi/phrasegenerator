package br.com.feliperochasi.phrasegenerator.repository;

import br.com.feliperochasi.phrasegenerator.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SerieRepository extends JpaRepository<Serie, Long> {
    @Query("SELECT s FROM Serie s order by function('RANDOM') LIMIT 1")
    Serie getPhraseFromDatabase();

}
