package pl.coderslab.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import pl.coderslab.model.Tasks;
import pl.coderslab.repository.TasksRepository;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class JpaTasksService implements TasksService{
    private final TasksRepository tasksRepository;

    public JpaTasksService(TasksRepository tasksRepository) {
        this.tasksRepository = tasksRepository;
    }



    @Override
    public List<Tasks> getTask() {
        return tasksRepository.findAll();
    }


    @Override
    public void addTask(Tasks task) {
        tasksRepository.save(task);
    }

    @Override
    public Optional<Tasks> get(Long id) {
        return tasksRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        tasksRepository.deleteById(id);
    }

    @Override
    public void update(Tasks task) {
        tasksRepository.save(task);
    }


}
