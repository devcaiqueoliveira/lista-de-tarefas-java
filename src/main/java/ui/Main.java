package ui;

import cache.TaskCache;
import core.Task;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------------------");
        System.out.println("    Bem-Vindo a sua Lista de Tarefas    ");
        System.out.println("----------------------------------------");

        System.out.println("----------------------------------------");
        System.out.println("        O que você deseja fazer?        ");
        System.out.println("----------------------------------------");
        System.out.println("1 - Listar suas tarefas atuais");
        System.out.println("2 - Buscar uma tarefa");
        System.out.println("3 - Adicionar uma nova tarefa");
        System.out.println("4 - Remover uma tarefa existente");
        System.out.println("5 - Atualizar uma tarefa");
        System.out.println("6 - Adicionar Status a uma tarefa");
        System.out.println("7 - Marcar tarefa como concluida");
        System.out.println("8 - Sair do programa");


        sc.close();
    }

}