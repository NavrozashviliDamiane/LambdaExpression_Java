package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TaskManager {
    private List<Taks> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Taks task) {
        tasks.add(task);
    }

    public List<Taks> filterTasks(Predicate<Taks> filter) {
        List<Taks> filteredTasks = new ArrayList<>();
        for (Taks task : tasks) {
            if (filter.test(task)) {
                filteredTasks.add(task);
            }
        }
        return filteredTasks;
    }
}
