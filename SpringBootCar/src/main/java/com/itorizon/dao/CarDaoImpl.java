package com.itorizon.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;




import com.itorizon.model.Car;

@Repository
public class CarDaoImpl implements CarDao {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Car> getCars() {
		Session session=entityManager.unwrap(Session.class);
		List<Car> cars=session.createQuery("from Car ",Car.class).getResultList();
		return cars;
	}

	@Override
	public void save(Car car) {
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(car);
		
	}

	@Override
	public Car findById(int carId) {
		Session session = entityManager.unwrap(Session.class);
		return session.get(Car.class, carId);
	}

	@Override
	public void deleteById(int carId) {
		Session session = entityManager.unwrap(Session.class);
		session.createQuery("delete from Car where id=:id").setParameter("id", carId).executeUpdate();
		
	}

	@Override
	public List<Car> findByColor(String color) {
		Session session = entityManager.unwrap(Session.class);
	      Query query = session.createQuery("FROM Car e WHERE e.color = :color");
	      query.setParameter("color", color);
	      List<Car> results = query.getResultList();
		System.out.println(results);
		return results;
	}

	@Override
	public List<Car> findByDop(String dateofpurchase) {
		Session session = entityManager.unwrap(Session.class);
	      Query query = session.createQuery("FROM Car e WHERE e.dateofpurchase = :dateofpurchase");
	      query.setParameter("dateofpurchase", dateofpurchase);
	      List<Car> results = query.getResultList();
		System.out.println(results);
		return results;
	}

	@Override
	public List<Car> findByPrice(String price) {
		Session session = entityManager.unwrap(Session.class);
	      Query query = session.createQuery("FROM Car e WHERE e.price = :price");
	      query.setParameter("price", price);
	      List<Car> results = query.getResultList();
		System.out.println(results);
		return results;
	}

	@Override
	public List<Car> findByModel(String model) {
		Session session = entityManager.unwrap(Session.class);
	      Query query = session.createQuery("FROM Car e WHERE e.model = :model");
	      query.setParameter("model", model);
	      List<Car> results = query.getResultList();
		System.out.println(results);
		return results;
	}



	



}
