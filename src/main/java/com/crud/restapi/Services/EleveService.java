package com.crud.restapi.Services;

import com.crud.restapi.models.Eleve;
import com.crud.restapi.repositories.EleveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EleveService {

    @Autowired
    EleveRepository eleveRepository;

    public List<Eleve> getEleves() {
        List<Eleve> eleves = new ArrayList<Eleve>();
        eleveRepository.findAll().forEach(eleve -> eleves.add(eleve));
        return eleves;
    }
    public Eleve getEleveById(long id) {
        return eleveRepository.findById(id).get();
    }

    public void saveEleve(Eleve eleve) {
        eleveRepository.save(eleve);
    }

    public void deleteEleveById(long id) {
        eleveRepository.deleteById(id);
    }

    public void updateEleve(Eleve eleve, long id) {
        eleveRepository.save(eleve);
    }
}
