package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Animal;

public class App {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.cadastro();
        animal.adicionarAnimal(animal);
        animal.mostrarAnimais();
    }

}
