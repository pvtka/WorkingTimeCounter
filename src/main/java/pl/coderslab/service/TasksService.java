package pl.coderslab.service;

import pl.coderslab.model.Tasks;

import java.util.List;
import java.util.Optional;

public interface TasksService {
    List<Tasks> getTask();
    void addTask(Tasks task);
    Optional<Tasks> get(Long id);
    void delete(Long id);
    void update(Tasks task);

}
