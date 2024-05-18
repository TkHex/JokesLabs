package Lab1.demo.service;

import Lab1.demo.model.JokeModel;

import java.util.List;
import java.util.Optional;

public interface JokeModelService {

    void addJoke(JokeModel joke);

    List<JokeModel> getAllJokes();

    Optional<JokeModel> getJokeById(Long id);

    Optional<JokeModel> putJokeById(Long id, JokeModel updatedJoke);

    void deleteJokeById(Long id);
}
