package com.api.packingcontrol.services;

import com.api.packingcontrol.repositories.ParkingSpotRepository;
import org.springframework.stereotype.Service;

@Service
public class ParkingSpotService {

     final ParkingSpotRepository parkingSpotRepository;

     public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
         this.parkingSpotRepository = parkingSpotRepository;
     }
}
