package vetor;
import java.util.Scanner;

public class q2 {
		public static void main(String[] args) {
			System.out.println("digite numeros ");
			Scanner entrada = new Scanner(System.in);
			final int TAM =10;
			
			int vetor[] = new int[TAM];
		for (int i =0; i<TAM;i++) {
			vetor[i]=entrada.nextInt();
		}
		
		int inverso=TAM-1;
		for(int i=inverso;i>=0;i--){
			System.out.println(vetor[i]);
			}
		System.out.println("\n");
		for (int k =0; k<TAM;k++) {
			System.out.println(vetor[k]);
			
		}
		
		}

	}


