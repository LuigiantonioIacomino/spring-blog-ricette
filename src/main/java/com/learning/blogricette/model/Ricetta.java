package com.learning.blogricette.model;

import java.util.List;

public class Ricetta {
    private String title;
    private List<String> ingredienti;
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

    public List<String> getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(List<String> ingredienti) {
        this.ingredienti = ingredienti;
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
}
