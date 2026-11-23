package com.dt2.gtaVI.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String marca;
    private String imagem;
    private String descricao;
    private String tipo;

    public Veiculo(int id, String nome, String marca, String imagem, String descricao, String tipo) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.imagem = imagem;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public Veiculo(String nome, String marca, String imagem, String descricao, String tipo) {
        this.nome = nome;
        this.marca = marca;
        this.imagem = imagem;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public Veiculo(){}

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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}