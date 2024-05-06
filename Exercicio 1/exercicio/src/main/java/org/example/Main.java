package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do usuário: ");
        String nome = scan.nextLine();
        if (nome.isEmpty()) {
            System.out.println("O nome não pode ser vazio");
            return;
        }
        usuario.setNome(nome);

        System.out.println("Digite o CPF do usuário: ");
        String cpf = scan.next();
        if (!validarCPF(cpf)) {
            System.out.println("CPF inválido");
            return;
        }
        usuario.setCpf(cpf);

        System.out.println("Digite a idade do usuário: ");
        int idade = scan.nextInt();
        if (idade < 0 || idade > 120) {
            System.out.println("Idade inválida");
            return;
        }
        usuario.setIdade(idade);

        System.out.println("Nome: " + usuario.getNome());
        System.out.println("CPF: " + usuario.getCpf());
        System.out.println("Idade: " + usuario.getIdade());
    }

    public static boolean validarCPF(String cpf) {
        return cpf.matches("\\d{11}");
    }
}
