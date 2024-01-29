/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.test.note.repository;

import com.test.note.modele.Prof;
import com.test.note.modele.Test;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author fofana
 */
public interface ProfRepository extends JpaRepository<Prof,Long>{
    
}
