package br.com.stackx.projectWeb.dao;

import java.sql.Connection;

import org.apache.commons.dbcp.BasicDataSource;

import br.com.stackx.projectWeb.exception.StackXException;


public class DAO {

	private static org.apache.tomcat.dbcp.dbcp2.BasicDataSource basicDataSource = null;
	
	public static void init() {
		
		basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		basicDataSource.setUsername("Root");
		basicDataSource.setPassword("12345");
		basicDataSource.setUrl("jdbc:mysql://localhost:3386/projectWeb");

		basicDataSource.setInitialSize(3);
		basicDataSource.setDefaultAutoCommit(false);
		basicDataSource.setDefaultTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
		
		basicDataSource.setValidationQuery("SELECT CURRENT_TIMESTAMP");		
		
	}
	
	public static Connection getConnection() throws StackXException {
		try {
			return basicDataSource.getConnection();
		} 	
		catch(Exception exception) {
			
			throw new StackXException("Error ao obter conexão", exception);
			
		}
		finally {
			
		}
	}
	
	public static void close() {
		try {
			basicDataSource.close();
		}
		catch(Exception exception) {
			
		}
	}
}
