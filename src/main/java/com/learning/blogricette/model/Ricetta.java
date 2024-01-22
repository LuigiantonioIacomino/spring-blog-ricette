package com.learning.blogricette.model;

import jakarta.persistence.*;


@Entity
@Table(name = "ricette")
public class Ricetta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String ingredienti;
    private String foto;
    private int tempoDiPreparazione;
    private int numeroDiPorzioni;
    private String testoDellaRicetta;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getTempoDiPreparazione() {
        return tempoDiPreparazione;
    }

    public void setTempoDiPreparazione(int tempoDiPreparazione) {
        this.tempoDiPreparazione = tempoDiPreparazione;
    }

    public int getNumeroDiPorzioni() {
        return numeroDiPorzioni;
    }

    public void setNumeroDiPorzioni(int numeroDiPorzioni) {
        this.numeroDiPorzioni = numeroDiPorzioni;
    }

    public String getTestoDellaRicetta() {
        return testoDellaRicetta;
    }

    public void setTestoDellaRicetta(String testoDellaRicetta) {
        this.testoDellaRicetta = testoDellaRicetta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(String ingredienti) {
        this.ingredienti = ingredienti;
    }
}
