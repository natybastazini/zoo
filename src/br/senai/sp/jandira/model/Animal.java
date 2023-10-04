package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Animal {

    Scanner scanner = new Scanner(System.in);

    String nome;
    String especie;
    String sexo;
    double id;
    int idade;

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



}

