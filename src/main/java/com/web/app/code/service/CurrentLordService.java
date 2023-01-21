package com.web.app.code.service;

import com.web.app.code.dto.CurrentLordDTO;
import com.web.app.code.response.CurrentLordResponse;

public interface CurrentLordService {
    CurrentLordResponse findCurrentLord(String uri);
}
