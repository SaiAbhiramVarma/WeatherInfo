package com.example.forecast.repository;
import com.example.forecast.model.Location;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LocationRepository extends MongoRepository<Location, Integer> {
    public List<Location> findAll();
    public Location findById(int id);
    public Location findByName(String locationName);

}
