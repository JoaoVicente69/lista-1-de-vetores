package vetor;

import java.util.Scanner;

public class q6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	final int TAM=10;
	 int x = 0,y=0; 
     int []lido= new int [TAM];
     int []par = new int [TAM];
     int []impar = new int [TAM];

     System.out.println("digite 20 números para o vetor ");
     for(int i=0; i<TAM;i++){
     lido[i]= entrada.nextInt();	
     	
     	if (lido[i] % 2 ==0 ) {
        par[i]= lido [i];
        x=x+1;
     	}
     		else {
     			impar[i]= lido [i]; 
     			y=y+1;
     			}

     }
     	System.out.println("números lidos: " );
     		for (int i=0; i<TAM; i++){
     		System.out.println (lido[i]);
     		}
     			System.out.println("números pares: ");
     				for (int i=0; i<TAM; i++) {
     				if(par[i]!=0) {
     				System.out.println (par[i]);
     				} 
     				}
    
     					System.out.println("ímpares: ");
     					for (int i=0; i<TAM; i++){
     						if(impar[i]!=0) {
     						System.out.println(impar[i]);
     						} 
     					}
}
}




