public interface MessageTemplate {

    public static void showHello() {
        System.out.println("----------------------------------------");
        System.out.println("    Bem-Vindo a sua Lista de Tarefas    ");
        System.out.println("----------------------------------------");
    }

    public static void showMenu() {
        System.out.println("----------------------------------------");
        System.out.println("        O que você deseja fazer?        ");
        System.out.println("----------------------------------------");
        System.out.println("1 - Listar suas tarefas atuais");
        System.out.println("2 - Buscar uma tarefa");
        System.out.println("3 - Adicionar uma nova tarefa");
        System.out.println("4 - Remover uma tarefa existente");
        System.out.println("5 - Atualizar uma tarefa");
        System.out.println("6 - Marcar tarefa como concluida");
        System.out.println("7 - Sair do programa");
        System.out.println("Digite uma opção: ");
    }
}
