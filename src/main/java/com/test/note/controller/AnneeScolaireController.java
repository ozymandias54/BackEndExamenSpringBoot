/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.note.controller;

import com.test.note.modele.AnneeScolaire;
import com.test.note.service.AnneeScolaireService;
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
@RequestMapping("/annee")
@AllArgsConstructor
public class AnneeScolaireController {
    private final AnneeScolaireService testService;



    @PostMapping("/create")
    public AnneeScolaire create(@RequestBody AnneeScolaire test){
        return testService.creer(test);
    }
    
    @GetMapping("/read")
    public List<AnneeScolaire> read(){
        return testService.lire();
    }
    
    @GetMapping("/read/{id}")
    public AnneeScolaire readId(@PathVariable Long id){
        return testService.lireId(id);
    }
    
    @PutMapping("/update/{id}")
    public AnneeScolaire update(@PathVariable Long id,@RequestBody AnneeScolaire test){
        return testService.modifier(id, test);
    }
    
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return testService.supprimer(id);
    }
}
