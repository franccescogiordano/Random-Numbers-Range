package co.com.sofka.mentoring35.service;

import java.util.Date;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.sofka.mentoring35.model.Number;
import co.com.sofka.mentoring35.model.NumbersDTO;
import co.com.sofka.mentoring35.repository.NumberRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class NumberService {


    private   NumberRepository numberRepository;

    @Autowired
    public NumberService(NumberRepository numberRepository) {
        this.numberRepository = numberRepository;
    }
    public Mono<Number> post(NumbersDTO request) {

        Integer small = Integer.parseInt(request.getSmallnumber().toString());
        Integer columns =Integer.parseInt(request.getColumns().toString());
        Integer big = Integer.parseInt(request.getBignumber().toString());

        return Mono.just(new Number()).map(entity -> {
            entity.setDate(new Date());
            entity.setColumns(columns);
            entity.setSmallnumber(small);
            entity.setBignumer(big);
            return entity;

        }).map(entity -> {
            IntStream stream = IntStream.generate(() -> {
                return numerorandomEntreXY(request.getSmallnumber(), request.getBignumber());
            });
            int [] numberlist;
            numberlist= stream.limit(big - small+1).toArray();

           entity.setTodoarmado(numberlist);

            return entity;

        }).flatMap(numberRepository::save);

    }

    public int numerorandomEntreXY(int x, int y) {
        return (int) (Math.random() * (y - x + 1) + x);
    }

    public Flux<Number> get() {
        return  numberRepository.findAll();
    }
}

