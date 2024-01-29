/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.note.service;

import com.test.note.modele.AnneeScolaire;
import com.test.note.repository.AnneeScolaireRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author fofana
 */
@Service
@AllArgsConstructor
public class AnneeScolaireServiceImpl implements AnneeScolaireService{
    private final AnneeScolaireRepository testRepository;


    @Override
    public AnneeScolaire creer(AnneeScolaire test) {
        return testRepository.save(test);
    }

    @Override
    public List<AnneeScolaire> lire() {
         return testRepository.findAll();
    }
    
    @Override
    public AnneeScolaire lireId(Long id) {
         return testRepository.findById(id).orElse(null);
    }

    @Override
    public AnneeScolaire modifier(Long id, AnneeScolaire test) {
        return testRepository.findById(id).map(
        (t) -> {
                t.setLibelle(test.getLibelle());
                t.setEtat(test.getEtat());
                return testRepository.save(t);
            }).orElseThrow(()-> new RuntimeException("AnneeScolaire non trouvé"));
    }

    @Override
    public String supprimer(Long id) {
        testRepository.deleteById(id);
        return "AnneeScolaire Supprimé!";
    }
}
