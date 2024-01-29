/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.test.note.service;

import com.test.note.modele.Test;
import java.util.List;

/**
 *
 * @author FOFANA BASSIROU
 */
public interface TestService {
    
    Test creer(Test test);
    
    List<Test> lire();
    
    Test lireId(Long id);
    
    Test modifier(Long id,Test test);
    
    String supprimer(Long id);
}
