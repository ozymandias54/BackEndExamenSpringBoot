/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.test.note.service;

import com.test.note.modele.Etudiant;
import java.util.List;

/**
 *
 * @author fofana
 */
public interface EtudiantService {
    Etudiant creer(Etudiant test);
    
    List<Etudiant> lire();
    
    Etudiant lireId(Long id);
    
    Etudiant modifier(Long id,Etudiant test);
    
    String supprimer(Long id);
}
