/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.test.note.service;

import com.test.note.modele.Note;
import java.util.List;

/**
 *
 * @author fofana
 */
public interface NoteService {
    Note creer(Note test);
    
    List<Note> lire();
    
    
    Note lireId(Long id);
    
    Note modifier(Long id,Note test);
    
    String supprimer(Long id);
}
