package Entities;

import java.time.LocalDate;

public class TaskOBJ {

    private String task;
    private LocalDate tempo;
    private ENUM priority;

    
    public TaskOBJ(String task, LocalDate tempo, ENUM priority) {
        this.task = task;
        this.tempo = tempo;
        this.priority = priority;
    }


    public String getTask() {
        return task;
    }


    public void setTask(String task) {
        this.task = task;
    }


    public LocalDate getTempo() {
        return tempo;
    }


    public void setTempo(LocalDate tempo) {
        this.tempo = tempo;
    }


    public ENUM getPriority() {
        return priority;
    }


    public void setPriority(ENUM priority) {
        this.priority = priority;
    }


    @Override
    public String toString() {
        return "TaskOBJ [Tarefa" + getTask() + "\nData: " + getTempo() + "\nPrioridade: " + getPriority()
                + "]";
    }

    
    
}
