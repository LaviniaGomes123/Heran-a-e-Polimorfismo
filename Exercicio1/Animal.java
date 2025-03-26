package Exercicio1;

public class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void fazerSom(){
        System.out.println("Som generico de animal: "+ nome);
    }
}
