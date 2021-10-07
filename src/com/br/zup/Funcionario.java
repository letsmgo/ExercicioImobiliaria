package com.br.zup;

public class Funcionario extends Pessoa {
    //Atributos individuais (específicos) da classe funcionário
    private String ctps;

    //Método construtor, contendo o super que é o construtor da superClasse
    public Funcionario(String nome, String cpf, String ctps) {
        super(nome, cpf);
        this.ctps = ctps;
    }

    //Getters and Setters somente do atributo específico da classe Funcionario
    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    //toString da classe contendo o super que pega os atributos da superclasse
    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append(super.toString());
        dados.append("Número da CTPS: " + ctps);

        return dados.toString();
    }
}
