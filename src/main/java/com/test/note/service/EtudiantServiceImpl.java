/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.note.service;

import com.test.note.modele.Etudiant;
import com.test.note.repository.EtudiantRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author fofana
 */
@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements EtudiantService{
    private final EtudiantRepository testRepository;


    @Override
    public Etudiant creer(Etudiant test) {
        return testRepository.save(test);
    }

    @Override
    public List<Etudiant> lire() {
         return testRepository.findAll();
    }
    
    @Override
    public Etudiant lireId(Long id) {
         return testRepository.findById(id).orElse(null);
    }

    @Override
    public Etudiant modifier(Long id, Etudiant test) {
        return testRepository.findById(id).map(
        (t) -> {
                t.setNom(test.getNom());
                t.setPrenom(test.getPrenom());
                return testRepository.save(t);
            }).orElseThrow(()-> new RuntimeException("Etudiant non trouvé"));
    }

    @Override
    public String supprimer(Long id) {
        testRepository.deleteById(id);
        return "Etudiant Supprimé!";
    }
}
