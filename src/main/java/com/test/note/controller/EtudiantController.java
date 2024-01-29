/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.note.controller;

import com.test.note.modele.Etudiant;
import com.test.note.service.EtudiantService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author FOFANA BASSIROU
 */
@RestController
@RequestMapping("/etudiant")
@AllArgsConstructor
public class EtudiantController {
    private final EtudiantService testService;



    @PostMapping("/create")
    public Etudiant create(@RequestBody Etudiant test){
        return testService.creer(test);
    }
    
    @GetMapping("/read")
    public List<Etudiant> read(){
        return testService.lire();
    }
    
    @GetMapping("/read/{id}")
    public Etudiant readId(@PathVariable Long id){
        return testService.lireId(id);
    }
    
    @PutMapping("/update/{id}")
    public Etudiant update(@PathVariable Long id,@RequestBody Etudiant test){
        return testService.modifier(id, test);
    }
    
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return testService.supprimer(id);
    }
}
