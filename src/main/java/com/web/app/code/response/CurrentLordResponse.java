package com.web.app.code.response;

import lombok.Data;

@Data
public class CurrentLordResponse {
    String url;
    String name;
    String gender;

    public CurrentLordResponse(String url, String name, String gender) {
        this.url = url;
        this.name = name;
        this.gender = gender;
    }
}
