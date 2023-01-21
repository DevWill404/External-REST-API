package com.web.app.code.controller;

import com.web.app.code.response.Response;
import com.web.app.code.route.Routes;
import com.web.app.code.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(Routes.HOUSES)
public class HouseController {
    @Autowired
    private HouseService _houseService;

    @GetMapping
    public ResponseEntity<?> listOfAllHouses() {
        Response response = _houseService.listAllHouses();
        if(response.getData() == null){
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(response.getData(), HttpStatus.OK);
    }
}
