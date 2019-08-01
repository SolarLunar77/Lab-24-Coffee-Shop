package co.grandcircus.CoffeeShop.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.grandcircus.CoffeeShop.entity.Product;

@Repository
@Transactional
public class ProductDao {
	
	@PersistenceContext
	EntityManager em;
	
	public List<Product> findAll(){
		List<Product> products = em.createQuery("FROM Product", Product.class)
		.getResultList();
		return products;
	}
	
	//find specific Product with its unique ID
	public void create(Product product) {
		em.persist(product);
	}
	
	public void update(Product product) {
		em.merge(product);
	}
	
	public void delete(Long id) {
		Product item = em.getReference(Product.class, id);
		em.remove(item);
	}
	
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
//	
//	public List<Product> findAll() {
//		// BeanPropertyRowMapper uses the rows from the SQL result create
//		// new Room objects and fill in the values by calling the setters.
//		// Use .query for SQL SELECT statements.
//		return jdbcTemplate.query("SELECT * FROM Products", new BeanPropertyRowMapper<>(Product.class));
//	}
	

}
