package fr.uga.miage.m1.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "departement")
public class Departement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_departement", nullable = false)
    private int idDepartement;

    @Column(name = "num_departement", nullable = false)
    private String numDepartement;

    @Column(name = "nom_departement", nullable = false)
    private String nomDepartement;

    @Column(name = "nom_region")
    private String nomRegion;

    @OneToMany(mappedBy = "idDepartement")
    private List<Commune> communes;

}