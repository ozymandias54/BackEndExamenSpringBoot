/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.test.note.service;

import com.test.note.modele.Module;
import java.util.List;

/**
 *
 * @author fofana
 */
public interface ModuleService {
    Module creer(Module test);
    
    List<Module> lire();
    
    Module lireId(Long id);
    
    Module modifier(Long id,Module test);
    
    String supprimer(Long id);
}
