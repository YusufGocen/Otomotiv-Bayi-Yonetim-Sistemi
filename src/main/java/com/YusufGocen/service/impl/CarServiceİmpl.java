package com.YusufGocen.service.impl;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.YusufGocen.dto.DtoCar;
import com.YusufGocen.dto.DtoCarIU;
import com.YusufGocen.model.Car;
import com.YusufGocen.repository.CarRepository;
import com.YusufGocen.service.ICarService;

@Service
public class CarServiceİmpl implements ICarService{

	@Autowired
	private CarRepository carRepository;
	
	private Car createCar(DtoCarIU dtoCarIU) {
		
		Car car=new Car();
		car.setCreateTime(new Date());
		
		BeanUtils.copyProperties(dtoCarIU, car);
		
		return car;
	}
 	
	@Override
	public DtoCar saveCar(DtoCarIU dtoCarIU) {
		
		DtoCar dtoCar=new DtoCar();
		
		Car savedCar = carRepository.save(createCar(dtoCarIU));
		
		BeanUtils.copyProperties(savedCar, dtoCar);
		
		return dtoCar;
	}

}
