package com.example.forecast.controller;

import com.example.forecast.model.Location;
import com.example.forecast.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocationController {
    @Autowired
    LocationService locationService;
    @RequestMapping("/getLocationList")
        public List<Location> getLocationList(){
        return locationService.getAll();
    }
    @RequestMapping("/getLocationById/{Id}")
    public Location getLoctionById(@PathVariable("id")int id){
        return locationService.getById(id);
    }
    }


