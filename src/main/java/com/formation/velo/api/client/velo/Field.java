package com.formation.velo.api.client.velo;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Field {
    @SerializedName("available_bike_stands")
    private int availableBikeStands;

    @SerializedName("available_bikes")
    private int availableBikes;

    @SerializedName("bike_stands")
    private int bikeStands;

    private int number;
    private String name;
    private String address;
    private String status;
    private double[] position;
}
