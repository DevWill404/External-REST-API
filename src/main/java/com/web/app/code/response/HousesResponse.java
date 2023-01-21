package com.web.app.code.response;

import lombok.Data;

@Data
public class HousesResponse {
    String url;
    String name;
    String region;
    String currentLord;

    public HousesResponse(String url, String name, String region, String currentLord) {
        this.url = url;
        this.name = name;
        this.region = region;
        this.currentLord = currentLord;
    }
}
