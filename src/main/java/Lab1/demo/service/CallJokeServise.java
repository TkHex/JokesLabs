package Lab1.demo.service;

import Lab1.demo.model.JokeCall;

import java.util.List;
import java.util.Optional;

public interface CallJokeServise {


    void addCallJoke(JokeCall jokeCall);

    List<JokeCall> getAllCallJokes();

    Optional<JokeCall> getCallJokeById(Long id);

    Optional<JokeCall> putCallJokeById(Long id, JokeCall updatedCallJoke);

    void deleteCallJokeById(Long id);
}
