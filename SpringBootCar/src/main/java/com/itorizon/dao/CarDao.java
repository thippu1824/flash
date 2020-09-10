package com.itorizon.dao;

import java.util.List;

import com.itorizon.model.Car;

public interface CarDao {

	public List<Car> getCars();

	public void save(Car car);

	public Car findById(int carId);

	public void deleteById(int carId);

	public List<Car> findByColor(String color);

	public List<Car> findByDop(String dateofpurchase);

	public List<Car> findByPrice(String price);

	public List<Car> findByModel(String model);



	




}
