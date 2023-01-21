package com.web.app.code.dto;

import lombok.Data;

import java.util.List;

@Data
public class CurrentLordDTO {
    private String url;
    private String name;
    private String gender;
    private String culture;
    private String born;
    private String died;
    private List<String> titles;
    private List<String> aliases;
    private String father;
    private String mother;
    private String spouse;
    private List<String> allegiances;
    private List<String> books;
    private List<Object> povBooks;
    private List<String> tvSeries;
    private List<String> playedBy;
}
