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
@Table(name = "module")
@Getter
@Setter
@NoArgsConstructor
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idModule;
    @Column(length = 35)
    private String libelle;
    @Column
    private int idProf;
}
