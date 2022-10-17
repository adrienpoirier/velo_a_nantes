package com.formation.velo.api.client.pump;

import com.fasterxml.jackson.annotation.*;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.time.OffsetDateTime;
import java.util.Date;
@Getter
public class Fields {
    private String ville;
    private String pop;
    @SerializedName("reg_name")
    private String regName;
    @SerializedName("com_arm_code")
    private String comArmCode;
    @SerializedName("dep_name")
    private String depName;
    @SerializedName("prix_nom")
    private String prixNom;
    @SerializedName("com_code")
    private String comCode;
    @SerializedName("epci_name")
    private String epciName;
    private String depCode;
    @SerializedName("prix_id")
    private String prixID;
    @SerializedName("services_service")
    private String servicesService;
    private String horairesAutomate24_24;
    private String comArmName;
    @SerializedName("prix_maj")
    private Date prixMaj;
    @SerializedName("id")
    private String pumpId;
    @SerializedName("reg_code")
    private String regCode;
    private String adresse;
    private double[] geom;
    @SerializedName("epci_code")
    private String epciCode;
    private String cp;
    @SerializedName("prix_valeur")
    private double prixValeur;
    @SerializedName("com_name")
    private String comName;
}
