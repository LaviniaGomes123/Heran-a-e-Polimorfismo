package Exercicio1;

public class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public Animal(){
    }

    public void fazerSom(){
        System.out.println("Som generico de animal: ");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
