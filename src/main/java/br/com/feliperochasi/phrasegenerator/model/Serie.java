package br.com.feliperochasi.phrasegenerator.model;

import jakarta.persistence.*;

@Entity
@Table(name = "phrases")
public class Serie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String phrase;
    private String character;
    private String title;
    private String poster;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "id=" + id +
                ", phrase='" + phrase + '\'' +
                ", character='" + character + '\'' +
                ", title='" + title + '\'' +
                ", poster='" + poster + '\'' +
                '}';
    }
}
