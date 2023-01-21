package com.web.app.code.dto;

import lombok.Data;

import java.util.List;

@Data
public class HousesDTO {
    private String url;
    private String name;
    private String region;
    private String coatOfArms;
    private String words;
    private List<String> titles;
    private List<String> seats;
    private String currentLord;
    private String heir;
    private String overlord;
    private String founded;
    private String founder;
    private String diedOut;
    private List<String> ancestralWeapons;
    private List<Object> cadetBranches;
    private List<Object> swornMembers;
}

