package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.coderslab.model.Tasks;
import pl.coderslab.model.Timer;

import java.util.Optional;


public interface TimerRepository extends JpaRepository<Timer, Long> {


}
