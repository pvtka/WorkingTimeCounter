package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.coderslab.model.Tasks;

import java.util.Optional;


public interface TasksRepository extends JpaRepository<Tasks, Long> {
    @Query(value= "SELECT c FROM Tasks c WHERE c.project.id = :id")
    Optional<Tasks> findByProjectId(@Param("id") Long id);

}
