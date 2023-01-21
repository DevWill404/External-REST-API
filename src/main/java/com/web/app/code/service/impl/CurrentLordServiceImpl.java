package com.web.app.code.service.impl;


import com.web.app.code.dto.CurrentLordDTO;
import com.web.app.code.mapper.CurrentLordMapper;
import com.web.app.code.response.CurrentLordResponse;
import com.web.app.code.service.CurrentLordService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("CurrentLordService")
public class CurrentLordServiceImpl implements CurrentLordService {
    @Override
    public CurrentLordResponse findCurrentLord(String uri) {
        if(uri.isEmpty()){
            return null;
        }
        RestTemplate restTemplate = new RestTemplate();
        CurrentLordDTO response =  restTemplate.getForObject(uri, CurrentLordDTO.class);
        if(response == null){
            return null;
        }
        return CurrentLordMapper.CurrentLordResponse(response);
    }
}
