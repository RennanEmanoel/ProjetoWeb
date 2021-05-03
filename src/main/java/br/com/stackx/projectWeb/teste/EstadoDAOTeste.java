package br.com.stackx.projectWeb.teste;

import br.com.stackx.projectWeb.dao.EstadoDAO;

public class EstadoDAOTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		
			DAO.init();
			
			EstadoDAO = meuEstado = new EstadoDAO();
			meuEstado.setNome("Santa Catarina");
			meuEstado.setSigla("SC");
			meuEstado.setCodigoIBGE(47);
			meuEstado.insert();
			
		}
		catch(Exception exception) {
			exception.printStackTrace();
		}
	}

}
