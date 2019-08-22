package vetor;

import java.util.Scanner;

public class q11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		 String vetor =" ";
		  String [] vetor_data = new String [3];
		 
           System.out.print("Informe uma data , EX 20/07/2000: ");
           vetor=entrada.next();
		
		while(vetor.length()!=10) {
			 System.out.print("Informe uma data , EX 20/07/2000: ");
	           vetor=entrada.next();
		}
		vetor_data[0]=vetor.substring(0,2);
		System.out.print(vetor_data[0]+"/");
		vetor_data[1]=vetor.substring(3,5);
		System.out.print(vetor_data[1]+"/");
		vetor_data[2]=vetor.substring(6,10);
		System.out.print(vetor_data[2]);
			
		entrada.close();	
		}
          
		

	}


