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
 * @author FOFANA BASSIROU
 */
@Entity
@Table(name="test")
@Getter
@Setter
@NoArgsConstructor
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTest;
    @Column(length = 255)
    private String nom;
    @Column(length = 255)
    private String prenom;
    @Column(length = 255)
    private String profession;

}
