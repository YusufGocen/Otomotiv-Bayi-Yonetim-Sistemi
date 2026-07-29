package com.YusufGocen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.YusufGocen.model.GalleristCar;

@Repository
public interface GalleristCarRepository extends JpaRepository<GalleristCar, Long>{

}
