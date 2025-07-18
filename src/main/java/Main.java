import core.Task;
import manager.TaskManager;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MessageTemplate.showHello();

        while (true) {
            MessageTemplate.showMenu();
            String input = sc.nextLine();
            int option = 0;
            try {
                option = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número.");
                return;
            }

            switch (option) {
                case 1 -> {
                    TaskManager.listAllTasks();
                }
                case 2 -> {
                    System.out.println("Digite o nome da tarefa que deseja buscar: ");
                    String name = sc.nextLine();
                    TaskManager.findTaskByName(name);
                }
                case 3 -> {
                    System.out.println("Digite o nome da nova tarefa: ");
                    String name = sc.nextLine();
                    System.out.println("Digite a descrição da tarefa: ");
                    String description = sc.nextLine();
                    System.out.println("Digite a data prazo para a tarefa ser concluída (AAAA-MM-DD): ");
                    LocalDate deadLine = LocalDate.parse(sc.nextLine());
                    Task task = new Task(name, description, deadLine);
                    TaskManager.addTask(task);
                }
                case 4 -> {
                    System.out.println("Digite o nome da tarefa que deseja remover: ");
                    String name = sc.nextLine();
                    TaskManager.removeTask(name);
                }
                case 5 -> {
                    System.out.println("Digite o nome da tarefa que deseja atualizar: ");
                    String name = sc.nextLine();
                    System.out.println("Digite a nova descrição da tarefa: ");
                    String newDescription = sc.nextLine();
                    System.out.println("Digite o novo prazo para a tarefa ser finalizada: ");
                    LocalDate newDeadLine = LocalDate.parse(sc.nextLine());
                    TaskManager.updateTask(name, newDescription, newDeadLine);
                }
                case 6 -> {
                    System.out.println("Digite o nome da tarefa que você deseja marcar como concluída: ");
                    String name = sc.nextLine();
                    TaskManager.markTaskAsCompleted(name);

                }
                case 7 -> {
                    System.out.println("Finalizando programa...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }

    }
}