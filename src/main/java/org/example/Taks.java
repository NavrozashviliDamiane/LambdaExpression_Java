package org.example;

public class Taks {
    private String name;
    private String category;
    private boolean completed;

    public Taks(String name, String category, boolean completed) {
        this.name = name;
        this.category = category;
        this.completed = completed;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", completed=" + completed +
                '}';
    }



}
