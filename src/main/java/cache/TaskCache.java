package cache;

import core.Task;
import java.util.HashMap;
import java.util.Map;

public class TaskCache {
    private static Map<String, Task> taskList = new HashMap<>();

    public static void addTask(Task task) {
        taskList.put(task.getName(), task);
    }
    public static void removeTask(String task) {
        taskList.remove(task);
    }
    public static void listAllTasks(Task task) {
        taskList.get(task.getName());
    }
}