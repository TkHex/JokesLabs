package Lab1.demo.controller;

import Lab1.demo.model.JokeCall;
import Lab1.demo.model.JokeModel;
import Lab1.demo.service.CallJokeServise;
import Lab1.demo.service.JokeModelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/call")
@RequiredArgsConstructor
public class JokeCallController {

    private final CallJokeServise callJokeServise;

    @PostMapping
    ResponseEntity<Void> addJoke(@RequestBody JokeCall jokeCall){
        callJokeServise.addCallJoke(jokeCall);
        return ResponseEntity.ok().build();

    }
}
