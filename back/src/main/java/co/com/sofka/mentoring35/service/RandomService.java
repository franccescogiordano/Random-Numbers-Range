package co.com.sofka.mentoring35.service;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.com.sofka.mentoring35.model.Random;
import co.com.sofka.mentoring35.repository.RandomRepository;
import reactor.core.publisher.Mono;
import java.util.Collections;
import java.util.stream.Collectors;
import co.com.sofka.mentoring35.model.RequestDTO;

import reactor.core.publisher.Flux;

import java.util.stream.Stream;
@Service
public class RandomService {

    private   RandomRepository randomRepository;

    @Autowired
    public RandomService(RandomRepository randomRepository) {
        this.randomRepository = randomRepository;
    }
  public Mono<Random> post(RequestDTO request){
    return Mono.just(new Random()).map(entity -> {
        entity.setDate(new Date());
        entity.setOrginalList(request.getList());
        return entity;
    }).map(entity -> {
        var list = Stream.of(request.getList().split(","))
            .map(p -> p.trim())
            .collect(Collectors.toList());
        Collections.shuffle(list);
        var randomList = list.stream().collect(Collectors.joining(","));
        entity.setRandomList(randomList);
        return entity;
    }).flatMap(randomRepository::save);
      
  }
 

  public Flux<Random> get() {
      return  randomRepository.findAll();
  }
}
