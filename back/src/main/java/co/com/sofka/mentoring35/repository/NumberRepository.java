package co.com.sofka.mentoring35.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import co.com.sofka.mentoring35.model.Number;
public interface NumberRepository  extends ReactiveCrudRepository<Number, String>{
    
}
