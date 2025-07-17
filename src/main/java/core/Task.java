package core;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor

public class Task {
    private String name;
    private String description;
    private LocalDate deadLine;
}
