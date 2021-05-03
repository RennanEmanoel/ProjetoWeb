package br.com.stackx.projectWeb.exception;


public class StackxException extends Exception {

	private String mensagem;
	private Exception exception;
	
	public StackxException() {
		this(null, null);
	}
	
	
	public StackxException(String mensagem, Exception exception) {
		super();
		this.mensagem = mensagem;
		this.exception = exception;
		
		StackXLogger.setMensagemError(mensagem);
		StackXLogger.setMensagemError(exception.toString());
	}
	
	
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public Exception getException() {
		return exception;
	}
	public void setException(Exception exception) {
		this.exception = exception;
	}
	
	
}
