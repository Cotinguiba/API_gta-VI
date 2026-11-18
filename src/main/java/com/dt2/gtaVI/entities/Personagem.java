package com.dt2.gtaVI.entities;

import jakarta.persistence.*;

@Entity //utilizado para criar uma tabela no mysql
public class Personagem {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //faz ele criar o id automaticamente
    private int id;
    private String nome;
    private String apelido;
    private String categoria;
    @Column(columnDefinition = "TEXT")
    private String imagem;
    private String descricao;

    public Personagem(String descricao, String imagem, String categoria, String apelido, String nome, int id) {
        this.descricao = descricao;
        this.imagem = imagem;
        this.categoria = categoria;
        this.apelido = apelido;
        this.nome = nome;
        this.id = id;
    }

    public Personagem(String nome, String apelido, String categoria, String imagem, String descricao) {
        this.nome = nome;
        this.apelido = apelido;
        this.categoria = categoria;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public Personagem(){
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

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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
}

