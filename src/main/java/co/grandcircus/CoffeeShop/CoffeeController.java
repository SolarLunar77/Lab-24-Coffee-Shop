package co.grandcircus.CoffeeShop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.CoffeeShop.dao.ProductDao;
import co.grandcircus.CoffeeShop.dao.UserDao;
import co.grandcircus.CoffeeShop.entity.Product;
import co.grandcircus.CoffeeShop.entity.User;


@Controller
public class CoffeeController {
	
	
@Autowired
private ProductDao dao;

@Autowired
private UserDao userDao;


@RequestMapping("/")
public ModelAndView list() {
	List<Product> listOfProducts = dao.findAll();
	//return new ModelAndView("index", "products", listOfProducts);
	
	//value must match name of JSP
	ModelAndView mav = new ModelAndView("index");
	
	//key(list) - value(List of Products), pair
	mav.addObject("Products", listOfProducts);
	return mav;
	}

@RequestMapping("/registration-form")
public ModelAndView Registration() {
	return new ModelAndView("registration-form");	
	}

@PostMapping("/registration-form")
public ModelAndView printResults(User name) {
	userDao.create(name);
	ModelAndView mv = new ModelAndView("confirmation");
	mv.addObject("user",name);
	return mv;
}



@RequestMapping("/admin")
public ModelAndView admin() {
	
	List<Product> listOfProducts = dao.findAll();
	
	ModelAndView mav = new ModelAndView("admin");
	
	mav.addObject("Products", listOfProducts);
	return mav;
	
	}

@RequestMapping("/add")
public ModelAndView add() {
	return new ModelAndView("AddItem");
	
}
	

}
