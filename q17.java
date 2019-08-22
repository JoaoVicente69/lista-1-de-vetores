package vetor;

import java.util.Scanner;


public class q17 {
	public static void main(String[] args) {
		final int TAM=10;
		String[] nome=new String[TAM];
		String[] sobrenome=new String[TAM];
		String[] telefone=new String[TAM];
		String[] celular=new String[TAM];
		String[] email=new String[TAM];
		String[] nascimento=new String[TAM];
		String texto=" ";
		int k =0,tamanho=0;
		boolean testook=true,niver=true,sair = true;;
		Scanner entrada = new Scanner(System.in);
		int num = 0;
		String aux=" ",aff=" ",auxniver=" ";
while (sair){
			
			System.out.println("Digite");
			System.out.println("1-Catastro");
			System.out.println("2- lista de contatos");
			System.out.println("3- procucar por nome");
			System.out.println("4- Mês do Aniversários");
			System.out.println("5- excluir");
			System.out.println("4- sair");
			num=entrada.nextInt();
			entrada.nextLine();
		switch (num) {
		case 1:
			System.out.println("Cadastro....");
			System.out.print("escreva o nome: ");
				nome[k]=entrada.nextLine();
				System.out.print("escreva o sobre nome: ");
				sobrenome[k]=entrada.nextLine();
			System.out.print("escreva o email: ");
				email[k]=entrada.nextLine();
			System.out.print("escreva o telefone: ");
				telefone[k]=entrada.nextLine();
			System.out.print("escreva seu celular: ");
				celular[k]=entrada.nextLine();
			System.out.print("escreva data de nascimento(EX 20/07/2000: ");
				nascimento[k]=entrada.nextLine();
				System.out.println();

				k=k+1;
			
			break;
		case 2:
			System.out.println("Lista de Contatos....");
			for(int i = 0; i<k; i++) {
			System.out.println("Catasdro numero "+(i+1));
			System.out.println("nome: "  + nome[i]+""+sobrenome[i]);
			System.out.println("email: " +email[i]);
			System.out.println("telefone: "+telefone[i]);	
			System.out.println("celular: "+celular[i]);
			System.out.println("data de nascimento: "+nascimento[i]);
			System.out.println();
			}
			break;
		case 3:
			while (testook) {
				System.out.println("Pesquisa por  nome....digite sair");
				System.out.println("informe o nome por qual pesquisara");
				texto=entrada.nextLine();
					   tamanho = k;
					   for(int i = 0; i < tamanho; i++) {
					      if((nome[i].equalsIgnoreCase(texto))) {
					    	  System.out.println("nome: "  + nome[i]+" "+sobrenome[i]);
					    	  System.out.println("email: " +email[i]);
								System.out.println("telefone: "+telefone[i]);	
								System.out.println("celular: "+celular[i]);
								System.out.println("data de nascimento: "+nascimento[i]);
								System.out.println();
								testook=false;
					    	  
					      }else if(sobrenome[i].equalsIgnoreCase(texto)) {
					    	  System.out.println("nome: "  + nome[i]+" "+sobrenome[i]);
					    	  System.out.println("email: " +email[i]);
								System.out.println("telefone: "+telefone[i]);	
								System.out.println("celular: "+celular[i]);
								System.out.println("data de nascimento: "+nascimento[i]);
								System.out.println();
								testook=false;
					    	  
					      }else if(i==tamanho)
					      {System.out.println("Nome nao encontrado"); testook=true;}
				
					   }
					   if("sair".equalsIgnoreCase(texto)) {
						   testook=false;
						}
			}
			break;
		case 4:
			while(niver) {
				System.out.println("Pesquisa por ata do Aniversários....");
				System.out.println("informe o data por qual pesquisara (AA/MM/AAAA)....digite sair para sair");
				aff=entrada.next();
				 if("sair".equalsIgnoreCase(aff)) {
					   niver=false;
				 }else {
				
				if(!"aff".equalsIgnoreCase(aff)){
				auxniver=((aff.substring(3,5)));
					   tamanho = k;
					   for(int i = 0; i < tamanho; i++) {  
						  aux=nascimento[i].substring(3,5);
					      if(aux.equalsIgnoreCase(auxniver)) {
					    	  	System.out.println("nome: "  + nome[i]+" "+sobrenome[i]);
					    	  	System.out.println("email: " +email[i]);
								System.out.println("telefone: "+telefone[i]);	
								System.out.println("celular: "+celular[i]);
								System.out.println("data de nascimento: "+nascimento[i]);
								System.out.println();
								testook=false;  
					      }
					      else if(i==tamanho)
					      {System.out.println("Data não encontrado"); niver=true;}
					      System.out.println(auxniver);
					      System.out.println(aux);
					   }
					  
				}
				 }
			}

		case 5 :
			System.out.println("numero do contado a ser excluido?");
			int e=entrada.nextInt();
			e=e-1;
				nome[e]="    ";
				sobrenome[e]="    ";
				email[e]="    ";
				telefone[e]="    ";
				celular[e]="    ";
				nascimento[e]="    ";
				System.out.println();
			break;
		case 6:
			sair=false;
			
		}

}
	entrada.close();

	}}