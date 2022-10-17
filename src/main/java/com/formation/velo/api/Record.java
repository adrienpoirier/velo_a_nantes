package com.formation.velo.api;

import com.formation.velo.api.client.velo.Field;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Record {
    @SerializedName("recordid")
    private String recordId;

    @SerializedName("fields")
    private Field field;


}
