package br.com.stackx.projctweb.logger;



import org.apache.logging.log4j2.LoogManager;
import org.apache.logging.log4j2.Logger;
import org.apache.logging.log4j2.core.config.Configurator;

public class StackXLogger {

	private static Logger logger = null;
	
	static {
		
		Configurator.initialize("projectWeb", "C:\\Users\\PC\\Documents\\Rennan_Programação\\Java\\projWeb\\projctWeb\\src\\main\\webapp\\WEB-INF\\log4j2.xml")
		Logger = LogManager.getLogger();
		
		System.out.println("Logger Inicializado");
	}
	
	public static void setMensagemError(String mensagem) {	
		Logger.error(mensagem);
	}
	public static void setMensagemAlerta(String mensagem) {	
		Logger.error(mensagem);
	}

	public static void setMensagemInfo(String mensagem) {	
		Logger.error(mensagem);
	}

	
	/*Logger logger = null;
		
		static {
			
			Configurator.initialize("projectWeb", "C:\\Users\\PC\\Documents\\Rennan_Programação\\Java\\projWeb\\projctWeb\\src\\main\\webapp\\WEB-INF\\log4j2.xml")
			Logger = LogManager.getLogger();
			
			System.out.println("Logger Inicializado");
		}
		
		public static void setMensagemError() {	}*/
}
