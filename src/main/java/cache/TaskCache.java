package cache;

import core.Task;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TaskCache {
    private TaskCache() {
    }

    private static final Map<String, Task> TASK_MAP = new HashMap<>();

    public static void addTask(Task taskToAdd) {
        TASK_MAP.put(taskToAdd.getName(), taskToAdd);
    }

    public static void removeTask(String taskToAdd) {
        TASK_MAP.remove(taskToAdd);
    }

    public static boolean taskNameExists(String taskName) {
        return TASK_MAP.containsKey(taskName);
    }

    public static Task getTaskByName(String taskName) {
        return TASK_MAP.get(taskName);
    }

    public static Collection<Task> getAllTasks() {
        return TASK_MAP.values();
    }
}