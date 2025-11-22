package br.edu.atitus.api_sample;

import Bebidas.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BacowineConsoleApp {

    static List<Bebidas> estoque = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU BACOWINE ESTOQUE =====");
            System.out.println("1 - Cadastrar Bebida");
            System.out.println("2 - Listar Todas as Bebidas");
            System.out.println("3 - Exibir Total de Bebidas");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarBebida(sc);
                    break;
                case 2:
                    listarTodas();
                    break;
                case 3:
                    System.out.println("Total de bebidas cadastradas: " + Bebidas.getContador());
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }

    private static void cadastrarBebida(Scanner sc) {
        System.out.println("\nEscolha o tipo de bebida:");
        System.out.println("1 - Cerveja");
        System.out.println("2 - Destilado");
        System.out.println("3 - Espumante");
        System.out.println("4 - Vinho");
        System.out.println("5 - Sem Álcool");
        System.out.println("6 - Suco");
        System.out.println("7 - Água");
        System.out.println("8 - Refrigerante");
        System.out.print("Opção: ");
        int tipo = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome da bebida: ");
        String nome = sc.nextLine();

        System.out.print("Ano de fabricação: ");
        int ano = sc.nextInt();
        sc.nextLine();

        Bebidas nova = null;

        switch (tipo) {
            case 1: nova = new Cerveja(nome, ano); break;
            case 2: nova = new Destilado(nome, ano); break;
            case 3: nova = new Espumantes(nome, ano); break;
            case 4: nova = new Vinho(nome, ano); break;
            case 5: nova = new SemAlcool(nome, ano); break;
            case 6: nova = new Suco(nome, ano); break;
            case 7: nova = new Agua(nome, ano); break;
            case 8: nova = new Refrigerante(nome, ano); break;
            default:
                System.out.println("Tipo inválido.");
                return;
        };

        estoque.add(nova);
        System.out.println("✅ Bebida adicionada com sucesso!");
    }

    private static void listarTodas() {
        if (estoque.isEmpty()) {
            System.out.println("📭 Nenhuma bebida cadastrada.");
            return;
        }

        for (Bebidas b : estoque) {
            System.out.println("Tipo: " + b.getTipo() + " | Nome: " + b.getNome() + " | Ano: " + b.getAno());
            b.abrir();
            b.consumir();
            System.out.println("-------------------------------");
        }
    }
}
