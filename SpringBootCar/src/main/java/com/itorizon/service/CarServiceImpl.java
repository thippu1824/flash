package com.itorizon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itorizon.dao.CarDao;
import com.itorizon.model.Car;

@Service
public class CarServiceImpl implements CarService {
	
	@Autowired
	private CarDao carDao;

	@Override
	@Transactional
	public List<Car> getCars() {
		return carDao.getCars();
	}

	@Override
	@Transactional
	public void save(Car car) {
		carDao.save(car);
		
	}

	@Override
	@Transactional
	public Car findById(int carId) {
		
		return carDao.findById(carId);
	}

	@Override
	@Transactional
	public void deleteById(int carId) {
	carDao.deleteById(carId);
		
	}

	@Override
	@Transactional
	public List<Car> findByColor(String color) {
		
		return carDao.findByColor(color);
	}

	@Override
	@Transactional
	public List<Car> findByDop(String dateofpurchase) {
		
		return carDao.findByDop(dateofpurchase);
	}

	@Override
	@Transactional
	public List<Car> findByPrice(String price) {
		// TODO Auto-generated method stub
		return carDao.findByPrice(price);
	}

	@Override
	@Transactional
	public List<Car> findByModel(String model) {
		// TODO Auto-generated method stub
		return carDao.findByModel(model);
	}

	



	


	





}
