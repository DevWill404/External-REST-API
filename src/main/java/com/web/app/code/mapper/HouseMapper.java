package com.web.app.code.mapper;

import com.web.app.code.dto.HousesDTO;
import com.web.app.code.response.ApplicationResponse;
import com.web.app.code.response.CurrentLordResponse;
import com.web.app.code.response.HousesResponse;

public class HouseMapper {
    public static HousesResponse getHouseResponse(HousesDTO housesDTO){
        return new HousesResponse(housesDTO.getUrl(), housesDTO.getName(), housesDTO.getRegion(), housesDTO.getCurrentLord());
    }
    public static ApplicationResponse getApplicationResponse(HousesResponse housesResponse, CurrentLordResponse currentLordResponse){
        return new ApplicationResponse(housesResponse.getUrl(), housesResponse.getName(), housesResponse.getRegion(), currentLordResponse);
    }
}
