package vetor;

import java.util.Scanner;

public class q10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("escreva uma frase");
		String frase=" ";
		frase=entrada.nextLine();
		final int TAM=frase.length();
		char [] vetor=new char[TAM];
		
		for(int i=0;i<TAM;i++) {
			vetor[i]=frase.charAt(i);
		}
		for(int i=0;i<TAM;i++) {
			System.out.print(vetor[i]);
		}
	}

}
