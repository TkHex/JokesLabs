package Lab1.demo.service;

import Lab1.demo.model.JokeCall;
import Lab1.demo.model.JokeModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface JokeModelService {

    Page<JokeModel> getTop5Jokes(Pageable pageable);  // Топ 5 шуток
    Page<JokeModel> getAllJokes(Pageable pageable); // Вызов всех

    void addJoke(JokeModel jokeModel); // Добавить

    Optional<JokeModel> getJokeById(Long id); // По id вызвать

    Optional<JokeModel> putJokeById(Long id, JokeModel updatedJoke); // Изменить

    void deleteJokeById(Long id); // Удалить
    JokeModel getRandomJoke(); // Рандомную выдать
}
