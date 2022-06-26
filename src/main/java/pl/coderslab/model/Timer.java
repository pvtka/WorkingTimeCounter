package pl.coderslab.model;


import javax.persistence.*;
import javax.validation.constraints.Min;
import java.sql.Time;
import java.sql.Timestamp;


@Entity
@Table(name = "time")
public class Timer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Min(value = 0)
    private Long hours;


    @OneToOne
    @JoinColumn
    private Tasks tasks;


    public Timer() {
    }


    public Timer(Long hours, Tasks tasks) {
        this.hours = hours;
        this.tasks = tasks;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHours() {
        return hours;
    }

    public void setHours(Long hours) {
        this.hours = hours;
    }

    public Tasks getTasks() {
        return tasks;
    }

    public void setTasks(Tasks tasks) {
        this.tasks = tasks;
    }



}

