package com.web.app.code.mapper;

import com.web.app.code.dto.CurrentLordDTO;
import com.web.app.code.response.CurrentLordResponse;


public class CurrentLordMapper {
    public static CurrentLordResponse CurrentLordResponse(CurrentLordDTO currentLordDTO){
        return new CurrentLordResponse(currentLordDTO.getUrl(), currentLordDTO.getName(), currentLordDTO.getGender());
    }
}
