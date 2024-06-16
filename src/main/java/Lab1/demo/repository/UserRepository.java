package Lab1.demo.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import Lab1.demo.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByUsername(String username);
}