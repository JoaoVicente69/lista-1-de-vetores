package vetor;

import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class q9 {

	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random soteio = new Random();
	 char[] alfabeto= {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
	 char[] vogal= {'a','e','i','o','u'};
	int letra=0;
	
	System.out.println("Quantos caracter tem sua senha");
		int TAM=entrada.nextInt(); 
		char[]senha=new char[TAM];
     			
		
	for(int i=0;i<TAM;i++) {
		letra=soteio.nextInt(21);
		senha[(i*2)]=alfabeto[letra];
	}for(int i=0;i<TAM;i++) {
		letra=soteio.nextInt(5);
		senha[(i*2)+1]=alfabeto[letra];
		
	}			
	
	
	for(int i=0;i<TAM;i++) {
	System.out.print(senha[i]); 
	}
     			
		}
	}

	


