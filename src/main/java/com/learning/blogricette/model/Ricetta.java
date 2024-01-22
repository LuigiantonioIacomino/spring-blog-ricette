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
    private int tempo_preparazione;
    private int numero_porzioni;
    private String testo;

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

    public int getTempo_preparazione() {
        return tempo_preparazione;
    }

    public void setTempo_preparazione(int tempo_preparazione) {
        this.tempo_preparazione = tempo_preparazione;
    }

    public int getNumero_porzioni() {
        return numero_porzioni;
    }

    public void setNumero_porzioni(int numero_porzioni) {
        this.numero_porzioni = numero_porzioni;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
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
