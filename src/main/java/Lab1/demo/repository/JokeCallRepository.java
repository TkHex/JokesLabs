package Lab1.demo.repository;

import Lab1.demo.model.JokeCall;
import Lab1.demo.model.JokeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface JokeCallRepository extends JpaRepository<JokeCall, Long> {

}
