package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.model.Projects;

public interface ProjectsRepository extends JpaRepository <Projects, Long>{

}
