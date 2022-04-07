package com.api.packingcontrol.services;

import com.api.packingcontrol.models.ParkingSpotModel;
import com.api.packingcontrol.repositories.ParkingSpotRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ParkingSpotService {

     final ParkingSpotRepository parkingSpotRepository;

     public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
         this.parkingSpotRepository = parkingSpotRepository;
     }

     @Transactional
     public ParkingSpotModel save(ParkingSpotModel parkingSpotModel){
         return parkingSpotRepository.save(parkingSpotModel);
    }

//    public boolean existsByLicensePlateCar(String licensePlateCar) {
//         return parkingSpotRepository.existsByLicensePlateCar(licensePlateCar);
//    }
//
//    public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
//         return parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
//    }
//
//    public boolean existsByApartmentAndBlock(String apartment, String block) {
//         return parkingSpotRepository.existsByApartmentAndBlock(apartment, block);
//    }

    public Page<ParkingSpotModel> findAll(Pageable pageable) {
         return parkingSpotRepository.findAll(pageable);
    }

    public Optional<ParkingSpotModel> findById(UUID id) {
         return parkingSpotRepository.findById(id);
    }

    @Transactional
    public void delete(ParkingSpotModel parkingSpotModel) {
         parkingSpotRepository.delete(parkingSpotModel);
    }
}
