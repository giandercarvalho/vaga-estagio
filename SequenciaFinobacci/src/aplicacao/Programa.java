package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = 0, n2 = 1, n3 = 0, i;
		
		System.out.print("Digite um numero: ");
		i = sc.nextInt();
		
		while (i > n3) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
		
		if (i == 0) {
			System.out.println("O numero digitado está na sequencia Fibonacci.");
		}
		else if (i == n3) {
			System.out.println("O numero digitado está na sequencia Fibonacci.");
		}
		else {
			System.out.println("O numero digitado não está na sequencia Fibonacci.");
		}
		
		
		
		sc.close();

	}

}
