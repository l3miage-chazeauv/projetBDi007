package fr.uga.miage.m1.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder
@Schema(name = "DepartementDTO", description = "DepartementDTO description")
public class DepartementDTO {

    public DepartementDTO(
        int idDepartement,
        String numDepartement,
        String nomDepartement,
        String nomregion
    ) {
        this.idDepartement = idDepartement;
        this.numDepartement = numDepartement;
        this.nomDepartement = nomDepartement;
        this.nomregion = nomregion;

    }
    
    private int idDepartement;

    private String numDepartement;

    private String nomDepartement;

    private String nomregion;

}