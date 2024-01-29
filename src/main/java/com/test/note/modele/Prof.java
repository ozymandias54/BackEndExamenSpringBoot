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
import java.util.Date;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author fofana
 */
@Entity
@Table(name="prof")
@Getter
@Setter
@NoArgsConstructor
public class Prof {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProf;
    @Column(length = 25)
    private String nom;
    @Column(length = 45)
    private String prenom;
    @Column(length = 25)
    private String specialite;
    @Column(length = 25)
    private String username;
    @Column(length = 25)
    private String password;
}
