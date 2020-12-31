package com.crud.restapi.repositories;

import com.crud.restapi.models.Eleve;
import org.springframework.data.repository.CrudRepository;

public interface EleveRepository  extends CrudRepository<Eleve, Long> {
}
