package br.com.stackx.projectWeb.controller;


@ControllerAdvice	
public class StackXExceptionController {
	
		public ModelAndView trataException(HttpServletRequest request, Exception exception) throws Exception {
			
			System.out.println("Entrou no StackXController");
			
			ModelAndView modelAndView = new ModelAndView();
			
			modelAndView.addObject("exception", exception);
			modelAndView.setView("error/500");
			return modelAndView;
		
		}
}
