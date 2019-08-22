package vetor;

import java.util.Scanner;

public class q15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		final int TAM=10;
		int[]a=new int[TAM];
		double[]b=new double[TAM];
		double media=0;
		int cont=0;
	
	for(int i=0;i<TAM;i++) {
		System.out.println("iforme a idade "+(i+1)+"º aluno");
		a[i]=entrada.nextInt();
		System.out.println("iforme a altura "+(i+1)+"º aluno");
		b[i]=entrada.nextDouble();
		
		media=media+b[i];
	}
    media=media/TAM;
	for(int i=0;i<TAM;i++) {
		if((a[i]>13)&&(b[i]<media)) {
			cont=cont+1;
		}
	}
	System.out.println(cont);
    entrada.close();
	}
}
