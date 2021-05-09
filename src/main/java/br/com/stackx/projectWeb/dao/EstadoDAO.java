package br.com.stackx.projectWeb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.stackx.projectWeb.exception.StackXException;

public class EstadoDAO extends Estado
{
	public void insert() throws StackXException {
		try {
			Connection connection = DAO.getConnection();
			
			PreparedStatement preparedStatement = connection.prepareStatement("insert int estado(nome, sigla, codigiIbge) values (?, ?, ?)");
			preparedStatement.setString(1, nome);
			preparedStatement.setString(2, sigla);
			preparedStatement.setInt(3, codigoIbge);
			preparedStatement.executeUpdate();
			
			preparedStatement.close();
			connection.commit();
			connection.close();
			
		}
		catch(Exception exception) {
			throws new StackXException("Error de insert ", exception);
		}
		finally {
			
		}
		
	}
	public void update() throws StackXException {
		try {
			Connection connection = DAO.getConnection();
			
			PreparedStatement preparedStatement = connection.prepareStatement("UPDATE Estado " + 
			" SET nome = ?, " +
			" sigla = ?"+	
			" codigoIBGE = ?"+		
			"WHERE idEstado = ?");
			
			preparedStatement.setString(1, nome);
			preparedStatement.setString(2, sigla);
			preparedStatement.setInt(3, codigoIBGE);
			preparedStatement.setInt(4,  idEstado);
			
			preparedStatement.executeUpdate();
			preparedStatement.close();
			connection.commit();
			connection.close();
		}
		catch(Exception exception){
			throws new StackXException("Error de update ", exception);
		}
		finally {
			
		}
	}
	public void delete() throws StackXException {
		try {
			Connection connection = DAO.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM Estado WHERE idEstado = ?");
			
			preparedStatement.setInt(1, idEstado);
			preparedStatement.executeUpdate();
			preparedStatement.close();
			
			connection.commit();
			connection.close();
		}
		catch(Exception exception) {
			throws new StackXException("Erro de dalete ", exception);
		}
	}
	public void select() {
		try {
			
			Connection connection = DAO.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("SELECT nome, sigla, codigoIBGE FROM Estado WHERE idEstado = ?");
			
			preparedStatement.setInt(1,  idEstado);
			ResultSet resultado = preparedStatement.executeQuery();
			
			while(resultado.next()) {
				
				nome = resultado.getString(1);	
				sigla = resultado.getString(2);
				codigoIBGE = resultado.getInt(3);
				
			}
			resultado.close();
			preparedStatement.close();
			connection.commit();
			connection.close();
						
		}
		catch(Exception exception) {
			
		}
	}
	public List<Estado> selectAll() throws StackXException
	{
		try
		{
			Connection connection = new DAO.getConnection();
			
			PreparedStatement preparedStatement = connection.prepareStatement("SELECT nome, sigla, codigoIBGE FROM Estado WHERE idEstado = ?");
			
			ArrayList<Estado> arrayListRetorno = new ArrayList<Estado>();
			
			while(ResultSet.next())
			{
				Estado estado = new Estado();
				estado.setIdEstado(resultSet.getInt(1));
				estado.setNome(resultSet.getString(2));
				estado.setSigla(resultSet.getString(3));
				estado.setCodigoIBGE(resultSet.getInt(4));
				
				arrayListRetorno.add(estado);
			}
			
		}
	}

}
