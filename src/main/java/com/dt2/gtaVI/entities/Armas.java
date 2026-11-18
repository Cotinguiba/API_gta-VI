package com.dt2.gtaVI.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Armas {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String fabricante;
    private String img;
    private String descricao;

    public Armas(int id, String nome, String fabricante, String img, String descricao) {
        this.id = id;
        this.nome = nome;
        this.fabricante = fabricante;
        this.img = img;
        this.descricao = descricao;
    }

    public Armas(String nome, String fabricante, String img, String descricao) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.img = img;
        this.descricao = descricao;
    }

    public Armas(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
