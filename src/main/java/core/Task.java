package core;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
@Getter
@Setter

public class Task {
    private String name;
    private String description;
    private LocalDate deadLine;
    private boolean isCompleted;

    public Task(String name, String description, LocalDate deadLine){
        this.name = name;
        this.description = description;
        this.deadLine = deadLine;
        this.isCompleted = false;
    }
}
