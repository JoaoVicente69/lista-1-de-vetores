package vetor;

import java.util.Scanner;

public class q16 {

	public static void main(String[] args) {
	
		System.out.println("digite quntos numeros você digitara ");
		Scanner entrada = new Scanner(System.in);
		final int TAM =entrada.nextInt();
		int vetor[] = new int[TAM];
		int aux=0;
		for (int i =0; i<TAM;i++) {
			System.out.println("digite o "+(i+1)+"° numero(apnas numeros entre 0 e 20");
			aux=entrada.nextInt();
			while ((aux<=-1)||(aux>=21)) {
				System.out.println("numero invalido \n digite novamente");	
				aux=entrada.nextInt();
			}
			vetor[i]=aux;
		}
		for (int i =0; i<TAM;i++) {
			System.out.print(vetor[i]+":");
			for(int k=0;k<vetor[i];k++) {
				System.out.print("#");
				
			}
			System.out.println();

		}

	}
 
}
