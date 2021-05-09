package br.com.stackx.projectWeb.servlet;

import java.io.IOException;

import br.com.stackx.projectWeb.dao.DAO;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/GravaEstado")
public class GravaEstado extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public GravaEstado() {
       
    }

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Executando o init da classe GravaEstado");
		DAO.init();	
	}

	
	public void destroy() {
		System.out.println("Executando o destroy da classe GravaEstado");
		DAO.close();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Executando o doget da classe GravaEstado");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {	
			System.out.println("Executando o dopost da classe GravaEstado");
			doGet(request, response);
			
			String nome = request.getParameter("nome");
			String sigla = request.getParameter("sigla");
			String codigoIBGE = request.getParameter("codigoIBGE");
			
			EstadoDAO estadoDAO = new EstadoDAO();
			estadoDAO.setNome(nome);
			estadoDAO.setSigla(sigla);
			estadoDAO.setCodigoIBGE(Integer.parseInt(codigoIBGE));
			estadoDAO.insert();		
					
		}
		catch(StackXException stackXException) {
			stackXException.getException().printStackTrace();
		}
		
		response.sendRedirect("/projctWeb/EstadoCadastrado");
	}

}
