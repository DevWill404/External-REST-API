package com.web.app.code.response;

import lombok.Data;

@Data
public class ApplicationResponse {
    String url;
    String name;
    String region;
    CurrentLordResponse currentLord;

    public ApplicationResponse(String url, String name, String region, CurrentLordResponse currentLord) {
        this.url = url;
        this.name = name;
        this.region = region;
        this.currentLord = currentLord;
    }
}
