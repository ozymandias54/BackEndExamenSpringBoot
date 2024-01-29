/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.note.controller;

import com.test.note.modele.Prof;
import com.test.note.service.ProfService;
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
@RequestMapping("/prof")
@AllArgsConstructor
public class ProfController {
    private final ProfService testService;



    @PostMapping("/create")
    public Prof create(@RequestBody Prof test){
        return testService.creer(test);
    }
    
    @GetMapping("/read")
    public List<Prof> read(){
        return testService.lire();
    }
    
    @GetMapping("/read/{id}")
    public Prof readId(@PathVariable Long id){
        return testService.lireId(id);
    }
    
    @PutMapping("/update/{id}")
    public Prof update(@PathVariable Long id,@RequestBody Prof test){
        return testService.modifier(id, test);
    }
    
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return testService.supprimer(id);
    }
}
