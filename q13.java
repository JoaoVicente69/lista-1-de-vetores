package vetor;

import java.util.Scanner;

public class q13 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
          final int TAM=5;
          int[]altura=new int[TAM];
          double[] peso=new double [TAM];
          int maiorA = 0,menorA = 0,aux=TAM,mediaa=0;
          double maiorP = 0,menorP = 0, mediap=0;
		
          for(int i=0;i<TAM;i++) {
        	System.out.println("Informe a altura da "+(i+1)+"º pessoa");
        	altura[i]=entrada.nextInt();
        	System.out.println("Informe o peso da "+(i+1)+"º pessoa");
        	peso[i]=entrada.nextDouble();
        	
        	if(i==0) {
        	maiorA=altura[i];
        	menorA=altura[i];
        	maiorP=peso[i];
        	menorP=peso[i];
        	}

			if(altura[i] > maiorA){ 
				maiorA = altura[i];
			}
			if(altura[i] < menorA){ 
				menorA = altura[i];
			}
			if(peso[i] > maiorP){ 
				maiorP = peso[i];
			}
			if(peso[i] < menorP){ 
				menorP = peso[i];
			}
         if(i==0) { mediaa=altura[i]=maiorA;
          mediap=mediap+peso[i];
          }
      	int aux2 = TAM;
          for(int i1=0;i1<TAM;i1++) {
        	  aux=TAM-1;
        	  System.out.println("A altura da "+(aux2-1)+"º pessoa "+ altura[aux]);
          	System.out.println("O peso da "+(aux2-1)+"º pessoa "+ peso[aux]);
          	aux2 =aux2-1;

          }
          mediaa=mediaa/5;
          mediap=mediap/5;
          
          System.out.println("maior altura "+maiorA+ " menor altura " + menorA);
          System.out.println("maior peso"+maiorP+ " menor peso " + menorP);
          for(int i1=0;i1<TAM;i1++) {
        	  if(altura[i1]>mediaa) {
        		  System.out.println(altura[i1]+" altura acima da media");
        		  
        	  }else { System.out.println(altura[i1]+" altura abaixo da media");
        	  }
          }
          for(int i1=0;i1<TAM;i1++) {
        	  if(peso[i1]>mediap) {
        		  System.out.println(peso[i1]+" peso acima da media");
        		  
        	  }else { System.out.println(peso[i1]+" peso abaixo da media");
        	  }
          }
		
			
		entrada.close();	

	}

	}
}
