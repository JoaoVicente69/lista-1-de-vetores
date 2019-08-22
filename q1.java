package vetor;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		System.out.println("digite numeros ");
		Scanner entrada = new Scanner(System.in);
		final int TAM =5;
		int vetor[] = new int[TAM];
	for (int i =0; i<TAM;i++) {
		vetor[i]=entrada.nextInt();
	}
	for (int i =0; i<TAM;i++) {
		System.out.println(vetor[i]);
	}
	}

}
