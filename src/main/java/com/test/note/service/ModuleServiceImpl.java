/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.note.service;

import com.test.note.modele.Module;
import com.test.note.repository.ModuleRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author fofana
 */
@Service
@AllArgsConstructor
public class ModuleServiceImpl implements ModuleService{
    private final ModuleRepository testRepository;


    @Override
    public Module creer(Module test) {
        return testRepository.save(test);
    }

    @Override
    public List<Module> lire() {
         return testRepository.findAll();
    }
    
    @Override
    public Module lireId(Long id) {
         return testRepository.findById(id).orElse(null);
    }

    @Override
    public Module modifier(Long id, Module test) {
        return testRepository.findById(id).map(
        (t) -> {
                t.setLibelle(test.getLibelle());
                t.setIdProf(test.getIdProf());
                return testRepository.save(t);
            }).orElseThrow(()-> new RuntimeException("Module non trouvé"));
    }

    @Override
    public String supprimer(Long id) {
        testRepository.deleteById(id);
        return "Module Supprimé!";
    }
}
