package vetor;

import java.util.Scanner;

public class q5 {

		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			char[] vetor= new char[10];
			int count = 0;
			for(int i=0; i < vetor.length; i++){
				System.out.println("escreva algo");
				vetor[i]=entrada.next().charAt(0);
			}
			
			
			for(int i=0; i < vetor.length; i++){
				if((vetor[i] != 'a') && (vetor[i] != 'e') && (vetor[i] != 'i') &&
						(vetor[i] != 'o') && (vetor[i] != 'u')){
						count = count + 1;
						System.out.println(vetor[i]);
				}
			}
			
			System.out.print("Número de Consoantes: ");
			System.out.print(count);
			
		}
	

}
