package co.com.sofka.mentoring35.controller;

import java.util.Collections;
import java.util.Date;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.sofka.mentoring35.model.Random;
import co.com.sofka.mentoring35.model.RequestDTO;
import co.com.sofka.mentoring35.repository.RandomRepository;
import co.com.sofka.mentoring35.service.RandomService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/r")
public class RandomController {

   @Autowired
    private RandomService randomService;


    @PostMapping("")
    public Mono<Random> post(@RequestBody RequestDTO request) {
      return randomService.post(request);
    }

    @GetMapping("")
    public Flux<Random> get() {
        return randomService.get();
    }
}
