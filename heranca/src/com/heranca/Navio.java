package com.heranca;

public abstract class Navio {
    private int id;
    private String nome;
    private int quantidadePoroes;
    private double capacidadeCarga;
    private String disponibiliade;


    public Navio(int id, String nome, int quantidadePoroes, double capacidadeCarga) {
        super();
        this.id = id;
        this.nome = nome;
        this.quantidadePoroes = quantidadePoroes;
        this.capacidadeCarga = capacidadeCarga;
        this.disponibiliade = "Vazio";
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadePoroes() {
        return quantidadePoroes;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public String getDisponibiliade() {
        return disponibiliade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadePoroes(int quantidadePoroes) {
        this.quantidadePoroes = quantidadePoroes;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public void setDisponibiliade(String disponibiliade) {
        this.disponibiliade = disponibiliade;
    }

    public void inicarCarregamento(){
        this.disponibiliade = "Carregando";

    }

    public void bloquearCarregamento(){
        this.disponibiliade = "Lotado";

    }




}
