package br.com.stackx.projectWeb.teste;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import br.com.stackx.projectWeb.model.Estado;

public class TesteException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		File meuArquivo = null;
		
		try {

			String minhaString = null;
			System.out.println(minhaString);;
			
			minhaString.trim();
			
			System.out.println("Terminou");
			
			
			Estado meuEstado = null;
			
			System.out.println(meuEstado.getNome());
			
			
			
			System.out.println(fis.available());
			fis.close();
		}
		catch(FileNotFoundException fileNotFoundException) {
			
			fileNotFoundException.printStackTrace();
			
		}
		catch(IOException ioException) {
			
			ioException.printStackTrace();
			
		}
		catch(Exception exception) {
			
			exception.printStackTrace();
			
		}
		finally{
			
			System.out.println("Executando o Finally");
			
			try {
				
				fis.close();
				
			}
			catch(Exception exception) {
				
			    exception.printStackTrace();
			    
			}
		}
	}

}
