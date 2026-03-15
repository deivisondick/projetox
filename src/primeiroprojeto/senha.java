package pack1;

import java.util.Scanner;

public class senha {
	
	public static void main (String[] args) {
		
		    Scanner teclado = new Scanner(System.in);
		
		         System.out.println("digite uma senha");
		         String senha = teclado.nextLine();
	
		 	senhavalida(senha);
		 	teclado.close();
		 	
	}
		private static void senhavalida(String senha) {
			
			int contacaracter = senha.length();
			boolean temmaiuscula = false;
		
		
			if(contacaracter < 8) {
				System.out.println("senha invalida!menos de 8 digitos.");}
			
	            		else if(contacaracter > 8) {
				          System.out.println("senha invalida! mais de 8 digitos.");}
			
			                    else {	
				                for(int i = 0; i < senha.length(); i++){
			                    if(Character.isUpperCase(senha.charAt(i))) {
		                    	temmaiuscula = true;
	                        	break;
				}
			}	
				    if (temmaiuscula) {
		        	System.out.println("a senha tem letra maiuscula e 8 digitos, SENHA VALIDA!");
		        	}
	            	else {
			     	System.out.println("a senha não tem letra maiuscula");
		           }
			}
		}
}

				 
		
