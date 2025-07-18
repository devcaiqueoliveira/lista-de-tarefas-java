# Gerenciador de Tarefas CLI

Um projeto de console simples, escrito em Java puro, para gerenciar uma lista de tarefas (To-Do list). Este projeto foi desenvolvido como um exercício de aprendizado, com foco em boas práticas de programação, princípios de design como a Separação de Camadas e o Princípio da Responsabilidade Única (SOLID), sem o uso de frameworks ou bancos de dados externos.

## ✨ Principais Funcionalidades

- **Adicionar Tarefas:** Crie novas tarefas com nome, descrição e prazo.
- **Listar Todas as Tarefas:** Visualize todas as tarefas cadastradas, incluindo seu status (concluída ou pendente).
- **Buscar Tarefa por Nome:** Encontre os detalhes de uma tarefa específica.
- **Atualizar Tarefas:** Modifique a descrição e o prazo de uma tarefa existente.
- **Marcar como Concluída:** Altere o status de uma tarefa para "concluída".
- **Remover Tarefas:** Exclua tarefas da lista.
- **Persistência em Memória:** Todos os dados são armazenados em memória e são perdidos quando o programa é encerrado.

## 📂 Estrutura do Projeto

O código foi organizado em uma arquitetura de 3 camadas para garantir a separação de responsabilidades:
- **`core`**: Contém as classes que representam os dados fundamentais do sistema.
- **`cache`**: Responsável por armazenar, buscar e manipular a coleção de dados. Atua como nosso "Repositório".
- **`manager`**: Orquestra as operações, aplica as regras de negócio e faz a ponte entre a interface do usuário e a camada de dados.
- **`Main.java`**: Responsável por exibir o menu, coletar a entrada do usuário e chamar os métodos apropriados do `TaskManager`.

## 🛠️ Tecnologias Utilizadas

- **Java (21)**
- **Lombok:** Para reduzir código boilerplate (getters, setters, etc.).

## 📋 Como Usar

Ao executar a aplicação, um menu interativo será exibido no console. Digite o número da opção desejada e pressione `Enter` para executar a ação correspondente.

## 🛣️ Próximos Passos (Roadmap)

- [ ] **Validação de Entrada Robusta:** Implementar tratamento de exceções para entradas inválidas do usuário (ex: digitar texto onde se espera um número).
- [ ] **Persistência em Arquivo:** Salvar as tarefas em um arquivo (JSON ou CSV) para que os dados não sejam perdidos ao fechar o programa.
