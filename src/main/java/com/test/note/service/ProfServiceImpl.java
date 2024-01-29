/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.note.service;

import com.test.note.modele.Prof;
import com.test.note.repository.ProfRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author fofana
 */
@Service
@AllArgsConstructor
public class ProfServiceImpl implements ProfService{
    private final ProfRepository testRepository;


    @Override
    public Prof creer(Prof test) {
        return testRepository.save(test);
    }

    @Override
    public List<Prof> lire() {
         return testRepository.findAll();
    }
    
    @Override
    public Prof lireId(Long id) {
         return testRepository.findById(id).orElse(null);
    }

    @Override
    public Prof modifier(Long id, Prof test) {
        return testRepository.findById(id).map(
        (t) -> {
                t.setNom(test.getNom());
                t.setPrenom(test.getPrenom());
                t.setSpecialite(test.getSpecialite());
                t.setUsername(test.getUsername());
                t.setPassword(test.getPassword());
                return testRepository.save(t);
            }).orElseThrow(()-> new RuntimeException("Prof non trouvé"));
    }

    @Override
    public String supprimer(Long id) {
        testRepository.deleteById(id);
        return "Prof Supprimé!";
    }
}
