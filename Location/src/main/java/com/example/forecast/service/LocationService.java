package com.example.forecast.service;

import com.example.forecast.model.Location;
import com.example.forecast.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {
    @Autowired
    LocationRepository locationRepository;


    public List<Location> getAll(){
        return locationRepository.findAll();
    }
    public Location  getById(int id) {
        return locationRepository.findById(id);
    }


    public Location  getByName(String locationName) {
        return locationRepository.findByName(locationName);
    }

    public Location createLocation(Location location) {
        return locationRepository.save(location);
    }

    public Location updateLocation(Location location) {
        Location location2=locationRepository.findById(location.getId());
        if(location2!=null)
            return locationRepository.save(location2);
        else {
            return new Location(location.getId(), "given location is not available", null, null, 0, 0, null, 0, null);
        }
    }

    public String deleteLocation(int id) {
        Location location=locationRepository.findById(id);
        locationRepository.delete(location);
        return "location deleted successfully";
    }



}


