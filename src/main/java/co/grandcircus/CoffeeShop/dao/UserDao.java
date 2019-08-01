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
import co.grandcircus.CoffeeShop.entity.User;

@Repository
@Transactional
public class UserDao {
	
	@PersistenceContext
	EntityManager em;
	
	public User findById(Long id){
		return em.find(User.class,id);
	}
	
	public void create(User user) {
		em.persist(user);
	}
	
	public void update(User user) {
		em.merge(user);
	}
	
	public void delete(Long id) {
		User user = em.getReference(User.class, id);
		em.remove(user);
	}
	
	public List<User> findAll(){
		List<User> users = em.createQuery("FROM User", User.class)
		.getResultList();
		return users;
	}
//	@Repository
//	public class UserDao {
//		
//		@Autowired
//		private JdbcTemplate jdbcTemplate;
//		
//		public List<User> findAll() {
//			// BeanPropertyRowMapper uses the rows from the SQL result create
//			// new Room objects and fill in the values by calling the setters.
//			// Use .query for SQL SELECT statements.
//			return jdbcTemplate.query("SELECT * FROM Users", new BeanPropertyRowMapper<>(User.class));
//		}

}
