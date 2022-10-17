package com.formation.velo.api.client;

import com.formation.velo.api.OpenData;
import retrofit2.Call;
import retrofit2.http.GET;

public interface OpenDataNantesClient {
    @GET("/api/records/1.0/search/?dataset=244400404_stations-velos-libre-service-nantes-metropole-disponibilites&q=&facet=banking&facet=bonus&rows=126&facet=status&facet=contract_name")
    Call<OpenData> getRecord();

}
