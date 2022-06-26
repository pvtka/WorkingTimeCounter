package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.model.Users;


public interface UsersRepository extends JpaRepository<Users, Long> {
}
