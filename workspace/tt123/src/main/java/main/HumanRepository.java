package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

public class HumanRepository {
	
	private final static String url = "jdbc:postgresql://192.168.41.128/students";
	private Properties props = new Properties();
	private Connection conn;
	private String sql;

	public HumanRepository() throws SQLException {

		props.setProperty("user","aurel");
		props.setProperty("password","privet");
		props.setProperty("ssl","false");
		conn = DriverManager.getConnection(url, props);
	}
	
	public void save(Human human) throws SQLException{
		
		Statement st = conn.createStatement();
		//insert
		sql = "insert into public.people(full_name, email) values('"
				+ human.getFullName() + "', '" + human.getEmail() + "');";
		st.executeUpdate(sql);
	}
	public void delete(String email) throws SQLException {
		
		Statement st = conn.createStatement();
		//insert
		sql = "delete from public.people where email = '" + email + "';";
		st.executeUpdate(sql);
	}
	public void update(Human human) throws SQLException{
		
		Statement st = conn.createStatement();
		//insert
		sql = "update public.people set email = '" + human.getEmail() 
			+ "' where full_name = '" + human.getFullName() + "';";
		st.executeUpdate(sql);
	}
	public ArrayList<Human> showAll() throws SQLException{
		ArrayList<Human> people = new ArrayList<Human>();
		Statement st = conn.createStatement();
		sql = "select * from public.people;";
		ResultSet result = st.executeQuery(sql);
		
		while(result.next()) {
			people.add(new Human(result.getString("full_name"),result.getString("email")));
		}
		
		return people;
	}
}
