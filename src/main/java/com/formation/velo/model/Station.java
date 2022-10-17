package com.formation.velo.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity

@Table(name = "stations")
public class Station {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Double lattitude;

    private Double longitude;

    private String status;

    private String address;

    private Integer bikeStands;

    private Integer availableBikes;

    private Integer availableBikeStands;

    private String recordId;




}
