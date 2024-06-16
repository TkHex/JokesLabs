package Lab1.demo.repository;

import Lab1.demo.model.JokeCall;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JokeCallRepository extends JpaRepository<JokeCall, Long> {

}
