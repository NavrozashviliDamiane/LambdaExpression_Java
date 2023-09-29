package org.example;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        TaskManager taskManager = new TaskManager();

        taskManager.addTask(new Taks("Study", "Education", false));
        taskManager.addTask(new Taks("Clean the house", "Home", true));
        taskManager.addTask(new Taks("Write report", "Work", false));


        List<Taks> completedTasks = taskManager.filterTasks(taks -> taks.isCompleted());

        System.out.println("Completed Tasks:");
        for (Taks task : completedTasks) {
            System.out.println(task);
        }

    }
    }
