package vetor;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		System.out.println("digite quntos numeros você digitara ");
		Scanner entrada = new Scanner(System.in);
		final int TAM =entrada.nextInt();
		int vetor[] = new int[TAM];
		int impar[]=new int[TAM];
		int par[]=new int[TAM];
		int abaixo[]=new int[TAM];
		int acima[]=new int[TAM];
		int media =0,soma=0,menor=0,maior=0,aux_impar=0,aux_par=0;
	
	for (int i =0; i<TAM;i++) {
		System.out.println("digite o "+(i+1)+"° numero");
		vetor[i]=entrada.nextInt();
		soma=vetor[i]+soma;
		if(i==0) {
			maior=vetor[i];
			menor=vetor[i];
		}else if(maior<vetor[i]) {
			maior=vetor[i];
		}else if (vetor[i]<menor){
			media=vetor[i];
		}
		if(vetor[i]%2==0) {
			par[i]=vetor[i];
			aux_par=aux_par+1;
		}else {
		impar[i]=vetor[i];
		aux_impar=aux_impar+1;}
		
	}
		//media//
		media=soma/TAM;
		
		//acima e abaixo da media//
		for (int i =0; i<TAM;i++) {
			if(vetor[i]>media) {
				acima[i]=vetor[i];
			}else {abaixo[i]=vetor[i];}	
		}
		System.out.println("a soma dos valores do vetor deu "+soma);
		System.out.println("a media dos valores do vetor deu "+media);
		System.out.println("o maior numero do vetor foi "+maior);
		System.out.println("o menor numero do vetor foi "+menor);
		System.out.println(" ");
		if (aux_par!=0) {
			System.out.print("Os numeros pares digitados foram:");
			for (int k =0; k<aux_par;k++) {
				System.out.print(par[k]+",");	
			}
		}else {System.out.println("nenhum numero par digitado");}
		
		System.out.println(" ");
		
		if (aux_impar!=0) {
			System.out.print("Os numeros impares digitados foram:");
			for (int k =0; k<aux_impar;k++) {
				System.out.print(impar[k]+",");	
			}
		}else {System.out.println("nenhum numero impar digitado");}
		
		System.out.println(" ");
		
		System.out.print("nmeros acima da media");
		for (int k =0; k<TAM;k++) {System.out.print(acima[k]+",");}
		
		System.out.println(" ");
		
		System.out.print("nmeros abaixo da media");
		for (int k =0; k<TAM;k++) {System.out.print(abaixo[k]+",");}
	}

}
