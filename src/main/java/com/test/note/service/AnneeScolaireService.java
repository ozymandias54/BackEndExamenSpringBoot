/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.test.note.service;

import com.test.note.modele.AnneeScolaire;
import java.util.List;

/**
 *
 * @author fofana
 */
public interface AnneeScolaireService {
    AnneeScolaire creer(AnneeScolaire test);
    
    List<AnneeScolaire> lire();
    
    AnneeScolaire lireId(Long id);
    
    AnneeScolaire modifier(Long id,AnneeScolaire test);
    
    String supprimer(Long id);
}
