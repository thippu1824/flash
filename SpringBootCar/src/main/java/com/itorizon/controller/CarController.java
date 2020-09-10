package com.itorizon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.itorizon.model.Car;
import com.itorizon.service.CarService;

@Controller
@RequestMapping("/")
public class CarController {
	
	@Autowired
	private CarService carService;
	
	@RequestMapping("/")
	public String login() {
		return "header";
	}
	
	@RequestMapping("/list")
	public String listCars(Model model) {
		model.addAttribute("cars", carService.getCars());
		return "show";	
	}
	
	@RequestMapping("/showForm")
	public String showFormAdd(Model model) {
		model.addAttribute("car", new Car());
		return "add";
	}
	
	@RequestMapping("/addCar")
	public String addCar( @ModelAttribute("car") Car car) {
		carService.save(car);
		return  "redirect:/list";
	}
	
	@RequestMapping("/updateForm")
	public String updateForm(@RequestParam("CarId") String id, Model model) {
		int carId = Integer.parseInt(id);
		Car car = carService.findById(carId);
		// Kept the customer object inside a model for displaying the old data
		model.addAttribute("car", car);
		return "add";
	}
	
	@RequestMapping("/deleteForm")
	public String deleteForm(@RequestParam("CarId") String id, Model model) {
		int carId=Integer.parseInt(id);
		carService.deleteById(carId);
		return "redirect:/list";
	}

	@RequestMapping("/searchCar")
	public String searchCar(Model model) {
		model.addAttribute("car", new Car());
		return "search";
	}
	
	@RequestMapping("/searchColor")
	public String searchColor(@RequestParam("color") String color,Model model) {
		List<Car> result=carService.findByColor(color);
		System.out.println(result);
		model.addAttribute("cars", result);
		return "test";
	}
	
	@RequestMapping("/searchDop")
	public String searchDop(@RequestParam("dateofpurchase") String dateofpurchase,Model model) {
		List<Car> result=carService.findByDop(dateofpurchase);
		System.out.println(result);
		model.addAttribute("cars", result);
		return "test";
	}
	
	@RequestMapping("/searchPrice")
	public String searchPrice(@RequestParam("price") String price,Model model) {
		List<Car> result=carService.findByPrice(price);
		System.out.println(result);
		model.addAttribute("cars", result);
		return "test";
	}
	
	@RequestMapping("/searchModel")
	public String searchModel(@RequestParam("model") String model,Model model1) {
		List<Car> result=carService.findByModel(model);
		System.out.println(result);
		model1.addAttribute("cars", result);
		return "test";
	}
	
	
	
}
