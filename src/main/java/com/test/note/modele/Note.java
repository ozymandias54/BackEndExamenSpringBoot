/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.note.modele;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author fofana
 */
@Entity
@Table(name="note")
@Getter
@Setter
@NoArgsConstructor
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNote;
    @Column(length = 25)
    private String nom;
    @Column(length = 45)
    private String prenom;
    @Column
    private float note1;
    @Column
    private Float note2;
    @Column
    private Float examen;
    @Column
    private int idModule;
    @Column
    private int idEtudiant;
    @Column
    private int idAnnee;
}
