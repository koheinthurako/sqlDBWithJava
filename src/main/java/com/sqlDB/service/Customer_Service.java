package com.sqlDB.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import com.sqlDB.Entity.Customer;

public interface Customer_Service {

	public List<Customer> get(Connection con) throws SQLException;
	public Customer getById(Connection con, int id) throws SQLException;
	public Customer add(Connection con, Customer c) throws SQLException;
	public boolean deleteByName(Connection con, String name) throws SQLException;
	
}
