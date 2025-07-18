package manager;

import cache.TaskCache;
import core.Task;

import java.time.LocalDate;
import java.util.Collection;

public class TaskManager {
    private TaskManager() {
    }

    public static void addTask(Task taskToAdd) {
        if (taskToAdd == null || taskToAdd.getName() == null || taskToAdd.getName().isBlank()) {
            System.out.println("A tarefa ou seu nome não podem ser nulos ou estarem vazios.");
            return;
        }
        if (TaskCache.taskNameExists(taskToAdd.getName())) {
            System.out.println("Já existe uma tarefa com o nome '" + taskToAdd.getName() + "'.");
            return;
        }
        TaskCache.addTask(taskToAdd);
        System.out.println("Tarefa '" + taskToAdd.getName() + "' adicionada com sucesso!");
    }

    public static void removeTask(String taskToRemove) {
        if (taskToRemove == null) {
            System.out.println("A tarefa ou seu nome não podem ser nulos ou estarem vazios.");
            return;
        }
        if (!(TaskCache.taskNameExists(taskToRemove))) {
            System.out.println("Não existe uma tarefa com o nome '" + taskToRemove + "'.");
            return;
        }
        TaskCache.removeTask(taskToRemove);
        System.out.println("Tarefa '" + taskToRemove + "' foi removida da lista de tarefas");
    }

    public static void updateTask(String taskName, String newDescription, LocalDate newDeadLine) {
        if (!(TaskCache.taskNameExists(taskName))) {
            System.out.println("Não existe uma tarefa com o nome '" + taskName + "'.");
            return;
        }
        Task taskToUpdate = TaskCache.getTaskByName(taskName);
        if (newDescription != null && !newDescription.isBlank()) {
            taskToUpdate.setDescription(newDescription);
            System.out.println("Descrição da tarefa '" + taskName + "' atualizada.");
        }
        if (newDeadLine != null) {
            taskToUpdate.setDeadLine(newDeadLine);
            System.out.println("Data limite da tarefa '" + taskName + "' atualizada");
        }
        if ((newDescription == null || newDescription.isBlank() && newDeadLine == null)) {
            System.out.println("Nenhuma informação nova foi fornecida para atualização");
        }
    }

    public static void listAllTasks() {
        Collection<Task> allTasks = TaskCache.getAllTasks();
        if (allTasks.isEmpty()) {
            System.out.println("Nenhuma tarefa encontrada.");
            return;
        }
        System.out.println("------ Suas Tarefas ------");
        int i = 1;


        for (Task task : allTasks) {
            System.out.println(i + ". " + task.getName());
            System.out.println("   Descrição: " + task.getDescription());
            String status = task.isCompleted() ? "[x]" : "[ ]";
            System.out.println(status + " Prazo: " + task.getDeadLine());
            i++;
        }

    }

    public static void findTaskByName(String taskName) {
        if (!(TaskCache.taskNameExists(taskName))) {
            System.out.println("Não existe uma tarefa com o nome '" + taskName + "'.");
            return;
        }
        Task taskByName = TaskCache.getTaskByName(taskName);
        System.out.println("Tarefa encontrada, confira as informações sobre ela abaixo:");
        System.out.println("Nome: " + taskName);
        System.out.println("Prazo Final: " + taskByName.getDeadLine());
        System.out.println("Descrição: " + taskByName.getDescription());
    }

    public static void markTaskAsCompleted(String taskName) {
        if (!(TaskCache.taskNameExists(taskName))) {
            System.out.println("Não existe uma tarefa com o nome '" + taskName + "'.");
            return;
        }
        Task taskByName = TaskCache.getTaskByName(taskName);
        taskByName.setCompleted(true);
        System.out.println("O status atual da sua tarefa '" + taskName + "' foi atualizado para -> Concluído.");
    }
}