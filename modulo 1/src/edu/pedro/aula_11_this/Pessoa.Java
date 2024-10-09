package edu.pedro.aula_11_this;

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public void mostrarInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }
}

