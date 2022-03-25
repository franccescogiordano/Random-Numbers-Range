package co.com.sofka.mentoring35.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.sofka.mentoring35.model.NumbersDTO;
import co.com.sofka.mentoring35.service.NumberService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import co.com.sofka.mentoring35.model.Number;
@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/p")
public class NumberController {
    @Autowired
    private NumberService numberService;


    @PostMapping("")
    public Mono<Number> post(@RequestBody NumbersDTO request) {
      return numberService.post(request);
    }

    @GetMapping("")
    public Flux<Number> get() {
        return numberService.get();
    }
}
