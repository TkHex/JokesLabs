package Lab1.demo.repository;

import Lab1.demo.model.JokeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JokeModelRepository extends JpaRepository<JokeModel, Long> {


}
