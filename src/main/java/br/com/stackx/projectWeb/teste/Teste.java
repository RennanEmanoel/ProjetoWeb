package br.com.stackx.projectWeb.teste;

public class Teste {

	public static void main(String[] args) {

		
		static {
			
			// Bolco muito utilizado para a inicialização de recursos			
			
		}
		
		
		TesteInstancia inst1 = new TesteInstancia();
		
		inst1.setNome("Daniel");
		inst1.setSobrenome("Teixeira");
		
		TesteInstancia inst2 = new TesteInstancia();
		
		inst2.setNome("Bartholomeu");
		inst2.setSobrenome("Groud");
		
		
		TesteInstancia inst3 = new TesteInstancia();
		
		inst3.setNome("Altair");
		inst3.setSobrenome("Chaveiro");
		
		System.out.println("Nome 1: "+ ints1.getNome());
		System.out.println("Nome 1: "+ ints1.getSobrenome());
		
		System.out.println("Nome 1: "+ ints2.getNome());
		System.out.println("Nome 1: "+ ints2.getSobrenome());
		
		System.out.println("Nome 1: "+ ints3.getNome());
		System.out.println("Nome 1: "+ ints3.getSobrenome());
	}

}
