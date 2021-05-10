package br.com.stackx.projectWeb.controller;

import br.com.stackx.projectWeb.exception.StackXException;

@Controller
public class EstadoController {
	

	@RequestMapping(value = "/CadastroEstado", method = RequestMethod.GET)
	public ModelAndView cadastroEstado(@ModelAttribute("SpringWeb") Estado estado) {
		
		if(estado.getIdEstado() != 0) {
			
			EstadoDAO estadoDAO = new EstadoDAO();
			estadoDAO.setIdEstado(estado.getIdEstado());
			estadoDAO.select();
			
			estado = estadoDAO;
			
		}
		
		return new ModelAndView("cadastroEstado", "command", new Estado());
	}
	
	@RequestMapping(value = "/addEstado", method = RequestMethod.POST);
	
	public String addEstado(@ModelAttribute("SpringWeb") Estado estado, BidingResult result, ModelMap model, HttpsServletRequest request) {
		
		try {
			
			if(result.hasErrors() || result.hasFieldErrors) {
				return cadastroEstado(estado, model);
			}
			
			System.out.println("Nome ", estado.getNome());
			System.out.println("Sigla ", estado.getSigla());
			System.out.println("Codigo IBGE ", estado.getCodigoIBGE());
			
			
			model.AddAttribute("idEstado", estado.getIdEstado());
			model.AddAttribute("nome", estado.getNome());
			model.AddAttribute("sigla", estado.getSigla());
			model.AddAttribute("codigoIBGE", estado.getCodigoIBGE());
			
			DAO.init();
			
			EstadoDAO estadoDAO = new EstadoDAO();
			
			EstadoDAO.setNome(estado.getNome());
			EstadoDAO.setSigla(estado.getSigla());
			EstadoDAO.setCodigoIBGE(estado.getCodigoIBGE());
			Estado.insert();
			
			if(estado.getIdEstado() == 0) {
				
				estadoDAO.insert();
				
			}
			else {
				
				estado.setIdEstado(estado.getIdEstado());
				estado.update();
				
			}
			
			return "exibeEstado";
		}
		catch(Exception e) {
			e.printStackTrace();
		}		
		return new ModelAndView("exibeEstado" "command", estado);
		
		@RequestMapping(value = "/ListaEstado", method = RequestMethod.GET);
		public String listEstado(@RequestParam(required = false)  String nomeEstadoParam, @ModelAttribute("SpringWeb") Estado estado, ModelMap model, HttpServletRequest) 
		{
			try 
			{
				DAO.init();
				
				EstadoDAO estadoDAO = new EstadoDAO;
				List<estado> listEstados = estadoDAO.selectAll();
				
				model.addAttribute("estados", listaEstados);
				
				return "ListaEstado";
			}
			catch(StackXException stackXException)
			{
				stackXException.getException().printStackTrace();
			}
			return null;
		}
	}
}

