package com.web.app.code.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.web.app.code.dto.HousesDTO;
import com.web.app.code.mapper.HouseMapper;
import com.web.app.code.response.ApplicationResponse;
import com.web.app.code.response.HousesResponse;
import com.web.app.code.response.Response;
import com.web.app.code.route.Routes;
import com.web.app.code.service.CurrentLordService;
import com.web.app.code.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service("HouseService")
public class HouseServiceImpl implements HouseService {

    private final CurrentLordService _CurrentLordService;

    @Autowired
    public HouseServiceImpl(CurrentLordService _CurrentLordService) {
        this._CurrentLordService = _CurrentLordService;
    }

    @Override
    public Response listAllHouses() {
        Response oResponse;
        try{
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<List> response = restTemplate.getForEntity(Routes.HOUSES_URI, List.class);
            ObjectMapper mapper = new ObjectMapper();
            List<HousesResponse> houses = Stream.of(mapper.convertValue(response.getBody(), HousesDTO[].class)).map(HouseMapper::getHouseResponse).toList();
            List<ApplicationResponse> housesMap = houses.stream().map(app -> HouseMapper.getApplicationResponse(app, _CurrentLordService.findCurrentLord(app.getCurrentLord()))).collect(Collectors.toList());
            oResponse = new Response(new Date(),"Succesfully", HttpStatus.OK.value(), housesMap);
        }catch (Exception e){
            oResponse = new Response(new Date(), e.getMessage(), HttpStatus.BAD_REQUEST.value(),null);
        }
        return oResponse;
    }
}
