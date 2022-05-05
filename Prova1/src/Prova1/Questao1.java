package Prova1;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner entrance = new Scanner(System.in);
		
		String corChave = "Azul"; 
		int contAzul = 0;
		int contVermelho = 0;
		int contVerde = 0;
		
		String[] pessoa = new String[10];
		
		for (int i = 1; i < 10; i++) {
			System.out.println("Digite a cor da chave:  ");
			corChave = entrance.nextLine().toLowerCase();
			
			pessoa[i] = corChave;
			
			if (corChave.equals("azul")) {
				System.out.println("Ir para a porta Azul.");
				contAzul = contAzul + 1;
			} else if (corChave.equals("vermelho")) {
				System.out.println("Ir para a porta Vermelha.");
				contVermelho = contVermelho + 1;
			} else if (corChave.equals("verde")) {
				System.out.println("Ir para a porta Verde.");
				contVerde = contVerde + 1;
			} else {
				System.out.println("Procure novamente.");
			}
		}
		
		System.out.println("Com a chave Azul tem" + contAzul);
		System.out.println("Com a chave Vermelha tem" + contVermelho);
		System.out.println("Com a chave Verde tem" + contVerde);

	}

}
