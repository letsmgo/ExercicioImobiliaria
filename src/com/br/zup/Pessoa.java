package com.br.zup;

public class Pessoa {
    //Atributos da superClasse Pessoa, que são comuns para Morador e Funcionario
    private String nome;
    private String cpf;

    //Método construtor
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //toString

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("Nome: " + nome);
        dados.append("CPF: " + cpf);

        return dados.toString();
    }
}
