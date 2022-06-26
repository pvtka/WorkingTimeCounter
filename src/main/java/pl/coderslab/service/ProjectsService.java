package pl.coderslab.service;

import org.springframework.stereotype.Service;
import pl.coderslab.model.Projects;

import java.util.List;
import java.util.Optional;
@Service
public interface ProjectsService {
    List<Projects> getProject();
    void addProject(Projects project);
    Optional<Projects> get(Long id);
    void delete(Long id);
    void update(Projects project);
}
