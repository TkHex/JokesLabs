package Lab1.demo.service;

import Lab1.demo.model.JokeModel;
import Lab1.demo.repository.JokeModelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class JokeModelServiceImpl implements JokeModelService {

    private final JokeModelRepository jokeModelRepository;

    @Override
    public void addJoke(JokeModel joke) {
        jokeModelRepository.save(joke);
    }

    @Override
    public List<JokeModel> getAllJokes() {
        return jokeModelRepository.findAll();
    }

    @Override
    public Optional<JokeModel> getJokeById(Long id) {
        return jokeModelRepository.findById(id);
    }

    @Override
    public Optional<JokeModel> putJokeById(Long id, JokeModel updatedJoke) {
        Optional<JokeModel> existingJoke = jokeModelRepository.findById(id);
        if (existingJoke.isPresent()) {
            JokeModel jokeToUpdate = existingJoke.get();
            jokeToUpdate.setTextJoke(updatedJoke.getTextJoke());
            jokeModelRepository.save(jokeToUpdate);
        }
        return existingJoke;
    }

    @Override
    public void deleteJokeById(Long id) {
        jokeModelRepository.deleteById(id);
    }
}
