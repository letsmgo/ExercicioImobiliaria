package com.br.zup;

public class Morador extends Pessoa {
    //Atributos específicos da classe Morador
    private String telefone;
    private double renda;

    //Método construtor, contendo o super que é o construtor da superClasse
    public Morador(String nome, String cpf, String telefone, double renda) {
        super(nome, cpf);
        this.telefone = telefone;
        this.renda = renda;
    }

    //Getters and Setters
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    //toString da classe contendo o super que pega os atributos da superclasse
    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append(super.toString());
        dados.append("Número de contato: " + telefone);
        dados.append("Renda mensal: R$" + renda);

        return dados.toString();
    }
}
