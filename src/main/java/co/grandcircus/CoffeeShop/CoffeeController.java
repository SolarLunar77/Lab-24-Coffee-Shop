package co.grandcircus.CoffeeShop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.CoffeeShop.dao.ProductDao;
import co.grandcircus.CoffeeShop.entity.Product;


@Controller
public class CoffeeController {
	
	
@Autowired
private ProductDao dao;


@RequestMapping("/")
public ModelAndView list() {
	List<Product> listOfProducts = dao.findAll();
	//return new ModelAndView("index", "products", listOfProducts);
	
	ModelAndView mav = new ModelAndView("index");
	mav.addObject("Products", listOfProducts);
	return mav;
}

@RequestMapping("/registration-form")
public ModelAndView Registration() {
	return new ModelAndView("registration-form");
	
	}

@RequestMapping("/confirmation")
public ModelAndView Confirmation() {
	return new ModelAndView("confirmation");
	
	}

}
