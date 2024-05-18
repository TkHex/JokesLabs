package Lab1.demo.controller;

import Lab1.demo.model.JokeModel;
import Lab1.demo.service.JokeModelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/joke")
@RequiredArgsConstructor
public class JokeController {

    private final JokeModelService jokeModelService;

    @PostMapping
    ResponseEntity<Void> addJoke(@RequestBody JokeModel joke){
        jokeModelService.addJoke(joke);
        return ResponseEntity.ok().build();

    }


    @GetMapping
    ResponseEntity<List<JokeModel>> getAllJoke(){
        return ResponseEntity.ok(jokeModelService.getAllJokes());

    }


    @GetMapping("/{id}")
    ResponseEntity<JokeModel> getJokeById(@PathVariable Long id){
        Optional<JokeModel> jokeOptional = jokeModelService.getJokeById(id);
        return jokeOptional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    ResponseEntity<JokeModel> updateJokeById(@PathVariable Long id, @RequestBody JokeModel updatedJoke) {
        Optional<JokeModel> updatedJokeOptional = jokeModelService.putJokeById(id, updatedJoke);
        return updatedJokeOptional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteJokeById(@PathVariable Long id){
        jokeModelService.deleteJokeById(id);
        return ResponseEntity.ok().build();
    }
}