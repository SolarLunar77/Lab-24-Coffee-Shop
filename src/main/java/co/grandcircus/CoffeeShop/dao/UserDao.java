package co.grandcircus.CoffeeShop.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.grandcircus.CoffeeShop.entity.User;


	
	@Repository
	public class UserDao {
		
		@Autowired
		private JdbcTemplate jdbcTemplate;
		
		public List<User> findAll() {
			// BeanPropertyRowMapper uses the rows from the SQL result create
			// new Room objects and fill in the values by calling the setters.
			// Use .query for SQL SELECT statements.
			return jdbcTemplate.query("SELECT * FROM Users", new BeanPropertyRowMapper<>(User.class));
		}

}
