package br.com.stackx.projectWeb.exception;


public class StackXException extends Exception {

	private String mensagem;
	private Exception exception;
	
	public StackXException() {
		this(null, null);
	}
	
	
	public StackXException(String mensagem, Exception exception) {
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
