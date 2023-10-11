package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Animal {

    Scanner scanner = new Scanner(System.in);

    String nome;
    String especie;
    String sexo;
    double id;
    int idade;

    LocalDate localDate = LocalDate.now();
    LocalDateTime localDateTime  = LocalDateTime.now();
    List <Animal> listaDeAnimais = new ArrayList<>();

    public void cadastro(){
        System.out.println("//----------------------------------------//");
        System.out.println("Informe a espécie: ");
        especie = scanner.nextLine();
        System.out.println("Informe o nome: ");
        nome = scanner.nextLine();
        System.out.println("Informe o sexo [1- feminino 2- masculino: ");
        sexo = scanner.nextLine();
        System.out.println("Informe a idade: ");
        idade = scanner.nextInt();
        System.out.println("Informe o id: ");
        id = scanner.nextDouble();
    }

    public void adicionarAnimal(Animal animal) {
        listaDeAnimais.add(animal);
    }

    public void mostrarAnimais () {
        if (!listaDeAnimais.isEmpty()) {
            for (Animal animal : listaDeAnimais) {
                System.out.println("****************************************");
                System.out.println("O nome do animal: " + animal.nome);
                System.out.println("O sexo do animal: " + animal.sexo);
                System.out.println("A idade do animal: " + animal.idade);
                System.out.println("A espécie do animal: " + animal.especie);
                System.out.println("****************************************");
            }
        } else {
            System.out.println("ERRO: Não há nenhum animal cadastrado!!");
        }
    }


    }

