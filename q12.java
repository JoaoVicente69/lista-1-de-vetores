package vetor;

import java.util.Scanner;

public class q12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
          System.out.print("quantas palavaras? ");
          final int TAM=entrada.nextInt();
         
          String [] joa= new String[TAM];
          System.out.print("informe as plavras separando com ; ");
         
          String palavra=entrada.next();
		
          for(int i=0;i<TAM;i++) {
        	  joa=palavra.split(";");
		}
          for(int i=0;i<TAM;i++) {
        	  System.out.println(joa[i]);
          }
		
			
		entrada.close();	

	}

}
