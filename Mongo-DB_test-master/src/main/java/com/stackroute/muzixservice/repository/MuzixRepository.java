package com.stackroute.muzixservice.repository;


import com.stackroute.muzixservice.domain.Muzix;
import org.springframework.data.mongodb.repository.MongoRepository;


import java.util.List;

public interface MuzixRepository extends MongoRepository<Muzix,Integer>{

}
