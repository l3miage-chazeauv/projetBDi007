package fr.uga.miage.m1.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name="etape")
public class Etape {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_etape", nullable = false)
    private Long idEtape;

    @Column(name="prix_etape", nullable = false)
    private float prixEtape;

    @Column(name="duree_depuis_depart", nullable = false)
    private int dureeDepuisDepart;

    @ManyToOne
    @JoinColumn(name = "id_lieu", referencedColumnName = "id_lieu", insertable = false, updatable = false)
    private Lieu idLieu;

    @ManyToOne
    @JoinColumn(name = "id_covoiturage", referencedColumnName = "id_covoiturage", insertable = false, updatable = false)
    private Covoiturage idCovoiturage;

    @OneToMany(mappedBy = "idEtape")
    private List<PanierEtape> panierEtapes;
    
}
