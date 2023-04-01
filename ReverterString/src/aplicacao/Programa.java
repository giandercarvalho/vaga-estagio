package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String original = sc.nextLine();
		String inversa ="";
		
		for (int i = original.length() - 1; i >= 0; i--) {
			inversa += original.charAt(i);
		}
		
		System.out.println(inversa);
		
		sc.close();
	}

}
