package vetor;
import java.util.Scanner;
public class q7 {


	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        double vetor[][] = new double[10][1];
       int j=0;
       double a= 0,b=0,c=0,d=0,media=0;
        for (int i = 0; i < 10; i++) {
             System.out.print("Informe a nota " + (i + 1) + "º do aluno");
            a= entrada.nextDouble();
             b=entrada.nextDouble();
             c=entrada.nextDouble();
             d=entrada.nextDouble();
             media=(a+b+c+d)/4;

             vetor[i][j] = media;        }
        

        for (int i = 0; i < 10; i++) {
        	if(vetor[i][j] >=7.5)
            
                System.out.print("aluno "+(i+1)+" media " +vetor[i][j] + "\n");
            }
            System.out.println();
        }
    }

