package Prova1;

import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		Scanner entrance = new Scanner(System.in);
		
		int opcao = 1;
		String frase;
		int contarVogais = 0;
		int contarConsoantes = 0;
		int totalPalavras = 0;
		int contarFrase = 0;
		float verificador = 0;
		int contarPalavra = 0;
		
		System.out.println("Digite a frase: ");
		frase = entrance.nextLine();
		
		perguntarAoUsuário:
		
		
		while(opcao < 5) {
			System.out.println("Selecione uma opcao: \n"
					+ "(1) Número de frases \n"
					+ "(2) Número de Palavras \n"
					+ "(3) Número de Vogais \n"
					+ "(4) Número de Consoantes  \n"
					+ "(5) Sair  \n");
			
			opcao = entrance.nextInt();
		
			switch(opcao) {
			case 1:
				frase.toLowerCase();
		        
		        for (int i = 0; i < frase.length(); i++){
		            char c = frase.charAt(i);
		            if (c == '.' || c == '!' || c == '?')
		                contarFrase++;
		        }
		        
		        System.out.println("Total de frase é " + contarFrase);
				
		   	break;
		   	
			case 2: 
				frase.toLowerCase();
		        
		        for (int i = 0; i < frase.length(); i++){
		            char c = frase.charAt(i);
		            if (c == ' ')
		            	contarPalavra++;
		        }
		        contarPalavra = contarPalavra + 1;
		        
		        System.out.println("Total de palavras é " + contarPalavra);
		        
		        continue perguntarAoUsuário;
			
			case 3: 
				frase.toLowerCase();
		        
		        for (int i = 0; i < frase.length(); i++){
		            char c = frase.charAt(i);
		            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
		                contarVogais++;
		        }
		        
		        System.out.println("Total de vogais é " + contarVogais);
		        
		        continue perguntarAoUsuário;
			
			case 4:
				frase.toLowerCase();
		        
		        for (int i = 0; i < frase.length(); i++){
		            char c = frase.charAt(i);
		            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
		                contarVogais++;
		        }
		        
		        contarConsoantes = frase.length() - contarVogais;
		        
		        System.out.println("Total de consoantes é " + contarVogais);
				
		        continue perguntarAoUsuário;
			
			case 5: 
				verificador = -1;
			break;
			}
		}

	}

}
