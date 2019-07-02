package edu.cnm.deepdive.atthemovies.model.dao;

import edu.cnm.deepdive.atthemovies.model.entity.Actor;
import java.util.List;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

//TODO, big fat, declare any required query methods.
public interface ActorRepository extends CrudRepository<Actor, UUID> {

  List<Actor> getAllByOrderByName();

}
