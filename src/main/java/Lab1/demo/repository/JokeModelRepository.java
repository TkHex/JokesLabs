package Lab1.demo.repository;

import Lab1.demo.model.JokeModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JokeModelRepository extends JpaRepository<JokeModel, Long> {

    @Query("SELECT j FROM joke j ORDER BY RANDOM() LIMIT 1")
    JokeModel findRandomJoke();
    Page<JokeModel> findTop5ByOrderByJokeCallDesc(Pageable pageable);
}
