/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.test.note.service;

import com.test.note.modele.Prof;
import java.util.List;

/**
 *
 * @author fofana
 */
public interface ProfService {
    Prof creer(Prof test);
    
    List<Prof> lire();
    
    Prof lireId(Long id);
    
    Prof modifier(Long id,Prof test);
    
    String supprimer(Long id);
}
