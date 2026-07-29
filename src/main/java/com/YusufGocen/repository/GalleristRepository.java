package com.YusufGocen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.YusufGocen.model.Gallerist;

@Repository
public interface GalleristRepository extends JpaRepository<Gallerist, Long>{

	
}
