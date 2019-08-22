package vetor;

import java.util.Scanner;

public class q4 {
	public static void main(String[] args) {
		System.out.println("digite notas ");
		Scanner entrada = new Scanner(System.in);
		final int TAM =4;
		int media=0;
		
		int vetor[] = new int[TAM];
	for (int i =0; i<TAM;i++) {
		vetor[i]=entrada.nextInt();
		media=media+vetor[i];
	}
	media=media/TAM;
	System.out.println("media = "+media);
}
}