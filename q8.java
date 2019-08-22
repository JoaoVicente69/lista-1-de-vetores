package vetor;

import java.util.Scanner;

public class q8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		 int[] vetor = new int[5];
		 int mult=1,soma=0;
		for (int i = 0; i < 5; i++) {
            System.out.print("Informe o  " + (i + 1) + "º valor: ");
            vetor[i]=entrada.nextInt();
            mult=mult*vetor[i];
            soma=soma+vetor[i];
	}
		System.out.println(" a soma dos valores deu "+soma);
		System.out.println(" a multiplicação dos valores deu "+mult);
		for (int i = 0; i < 5; i++) {
			System.out.println(vetor[i]);
		}
	}

}
