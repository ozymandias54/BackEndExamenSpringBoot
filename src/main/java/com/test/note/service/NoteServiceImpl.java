/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.note.service;

import com.test.note.modele.Note;
import com.test.note.repository.NoteRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author fofana
 */
@Service
@AllArgsConstructor
public class NoteServiceImpl implements NoteService{
    private final NoteRepository testRepository;


    @Override
    public Note creer(Note test) {
        return testRepository.save(test);
    }

    @Override
    public List<Note> lire() {
         return testRepository.findAll();
    }
    
    
    @Override
    public Note lireId(Long id) {
         return testRepository.findById(id).orElse(null);
    }

    @Override
    public Note modifier(Long id, Note test) {
        return testRepository.findById(id).map(
        (t) -> {
                t.setNom(test.getNom());
                t.setPrenom(test.getPrenom());
                t.setNote1(test.getNote1());
                t.setNote2(test.getNote2());
                t.setExamen(test.getExamen());
                t.setIdModule(test.getIdModule());
                t.setIdEtudiant(test.getIdEtudiant());
                t.setIdAnnee(test.getIdAnnee());
                return testRepository.save(t);
            }).orElseThrow(()-> new RuntimeException("Note non trouvé"));
    }

    @Override
    public String supprimer(Long id) {
        testRepository.deleteById(id);
        return "Note Supprimé!";
    }
}
