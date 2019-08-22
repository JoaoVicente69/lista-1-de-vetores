package vetor;

import java.util.Scanner;

public class q14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		final int TAM=10;
		final int TAMB=20;
	

		int[]a=new int[TAM];
		int[]b=new int[TAM];
		int[]c=new int[TAMB];
		System.out.println("informe os digitos do 1° vetor");
		for(int i=0;i<TAM;i++) {
        	System.out.println("iforme o "+(i+1)+"º digito");
        	a[i]=entrada.nextInt();
		}
		System.out.println("informe os digitos do 2° vetor");
		for(int i=0;i<TAM;i++) {
        	System.out.println("iforme o "+(i+1)+"º digito");
        	b[i]=entrada.nextInt();
		}
		System.out.println("junção dos vetores");
		for(int i=0;i<TAM;i++) {
			c[i*2]=a[i];
		}			
		for(int i=0;i<TAM;i++) {
			c[(i*2)+1]=b[i];
		
		}
				for(int i=0;i<TAMB;i++) {
		        	System.out.print(c[i]+".");
				}
		entrada.close();
	}

}
