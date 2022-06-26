package pl.coderslab.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import pl.coderslab.model.Projects;
import pl.coderslab.repository.ProjectsRepository;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class JpaProjectsService implements ProjectsService {

    private final ProjectsRepository projectsRepository;

    public JpaProjectsService(ProjectsRepository projectsRepository) {
        this.projectsRepository = projectsRepository;
    }


    @Override
    public List<Projects> getProject() {
        return projectsRepository.findAll();
    }

    @Override
    public void addProject(Projects project) {
        projectsRepository.save(project);
    }

    @Override
    public Optional<Projects> get(Long id) {
        return projectsRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        projectsRepository.deleteById(id);
    }

    @Override
    public void update(Projects project) {
        projectsRepository.save(project);
    }

}
