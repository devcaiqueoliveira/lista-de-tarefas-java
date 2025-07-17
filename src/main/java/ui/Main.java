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
        System.out.println("2 - Adicionar uma nova tarefa");
        System.out.println("3 - Remover uma tarefa existente");
        System.out.println("Digite o nome da tarefa:");
        String nameTask = sc.nextLine();
        TaskCache.removeTask(nameTask);

        System.out.println("4 - Alterar o status de uma tarefa");
        System.out.println("5 - Sair do programa");

        System.out.println("Digite o nome da tarefa: ");
        String name = sc.nextLine();
        System.out.println("Digite a descrição da tarefa: ");
        String description = sc.nextLine();
        System.out.println("Informe a data/prazo final da tarefa: ");
        LocalDate deadLine = LocalDate.parse(sc.nextLine());
        Task task = new Task(name, description, deadLine);


        sc.close();
    }

}