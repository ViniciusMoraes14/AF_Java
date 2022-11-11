import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.Popup;

public class App {
	public static void main(String[] args) {
		//Abrindo todos os 10 slots
		Armazenamento<String> slot0 = new Armazenamento<>();
		Armazenamento<String> slot1 = new Armazenamento<>();
		Armazenamento<String> slot2 = new Armazenamento<>();
		Armazenamento<String> slot3 = new Armazenamento<>();
		Armazenamento<String> slot4 = new Armazenamento<>();
		Armazenamento<String> slot5 = new Armazenamento<>();
		Armazenamento<String> slot6 = new Armazenamento<>();
		Armazenamento<String> slot7 = new Armazenamento<>();
		Armazenamento<String> slot8 = new Armazenamento<>();
		Armazenamento<String> slot9 = new Armazenamento<>();

		Scanner sc = new Scanner(System.in);
		int op;
		
		//Sistema inicial do programa.
		do {

			System.out.print("Programa de Armazenamento Hash"
			+"\n--------------------------------------------"
			+ "\n1 - Inserir" 
			+ "\n2 - Exibir" 
			+ "\n3 - Remover"
			+ "\n10 - Sair do Programa" 
			+ "\nDigite o número da opção: ");
			op = sc.nextInt();
			
			switch (op) {
			case 1: {
				//Inserção
				System.out.println("Nome: ");
				String nome = sc.next();
				char myChar1 = nome.charAt(0);
				char myChar2 = nome.charAt(1);
				//Criando a chave através do Calculo abaixo.
				int Chave = (myChar1 + myChar2);
				System.out.println("Essa é sua Chave " + Chave);
				int myInt = (myChar1 + myChar2) % 10;
				System.out.println("Esse nome foi armazenado na posição: " + myInt);
				System.out.println("----------------------------------------------------");
				//Pedindo a prioridade para inserir corretamente no Slot...caso Alta no inicio do vetor e Baixa ao Final do vetor.
				System.out.println("Digite a prioridade: "
									+ "\nAlta = 0"
									+ "\nBaixa = 1"
									+ "\n...?");
				int prioridade = sc.nextInt();
				
				//Adicionando ao vetor
				if (myInt == 0) {
					if(prioridade == 0) {
						slot0.add0(0, "[" + nome + "," + Chave + "," + prioridade + "]");	
					}
					if(prioridade == 1) {
						slot0.add1( "[" + nome + "," + Chave + "," + prioridade + "]");	
					}
				} 
				
				
				if (myInt == 1) {
					if(prioridade == 0) {
						slot1.add0(0, "[" + nome + "," + Chave + "," + prioridade + "]");	
					}
					if(prioridade == 1) {
						slot1.add1( "[" + nome + "," + Chave + "," + prioridade + "]");	
					}
				}
				
				
				if (myInt == 2) {
					if(prioridade == 0) {
						slot2.add0(0, "[" + nome + "," + Chave + "," + prioridade + "]");	
					}
					if(prioridade == 1) {
						slot2.add1( "[" + nome + "," + Chave + "," + prioridade + "]");	
					}
					
				}
				
				
				if (myInt == 3) {
					if(prioridade == 0) {
						slot3.add0(0, "[" + nome + "," + Chave + "," + prioridade + "]");	
					}
					if(prioridade == 1) {
						slot3.add1( "[" + nome + "," + Chave + "," + prioridade + "]");	
					}
				}
				
				
				if (myInt == 4) {
					if(prioridade == 0) {
						slot4.add0(0, "[" + nome + "," + Chave + "," + prioridade + "]");	
					}
					if(prioridade == 1) {
						slot4.add1( "[" + nome + "," + Chave + "," + prioridade + "]");	
					}
				}
				
				
				if (myInt == 5) {
					if(prioridade == 0) {
						slot5.add0(0, "[" + nome + "," + Chave + "," + prioridade + "]");	
					}
					if(prioridade == 1) {
						slot5.add1( "[" + nome + "," + Chave + "," + prioridade + "]");	
					}
				}
				
				
				if (myInt == 6) {
					if(prioridade == 0) {
						slot6.add0(0, "[" + nome + "," + Chave + "," + prioridade + "]");	
					}
					if(prioridade == 1) {
						slot6.add1( "[" + nome + "," + Chave + "," + prioridade + "]");	
					}
				}
				
				
				if (myInt == 7) {
					if(prioridade == 0) {
						slot7.add0(0, "[" + nome + "," + Chave + "," + prioridade + "]");	
					}
					if(prioridade == 1) {
						slot7.add1( "[" + nome + "," + Chave + "," + prioridade + "]");	
					}
				}
				
				
				if (myInt == 8) {
					if(prioridade == 0) {
						slot8.add0(0, "[" + nome + "," + Chave + "," + prioridade + "]");	
					}
					if(prioridade == 1) {
						slot8.add1( "[" + nome + "," + Chave + "," + prioridade + "]");	
					}
				}
				
				
				if (myInt == 9) {
					if(prioridade == 0) {
						slot9.add0(0, "[" + nome + "," + Chave + "," + prioridade + "]");	
					}
					if(prioridade == 1) {
						slot9.add1( "[" + nome + "," + Chave + "," + prioridade + "]");	
					}
				}
				break;
				
			}
			case 2: {
				System.out.println("Armazenamento");
				System.out.println("------------------------------------------");
				System.out.println("slot0: " + slot0);
				System.out.println("slot1: " + slot1);
				System.out.println("slot2: " + slot2);
				System.out.println("slot3: " + slot3);
				System.out.println("slot4: " + slot4);
				System.out.println("slot5: " + slot5);
				System.out.println("slot6: " + slot6);
				System.out.println("slot7: " + slot7);
				System.out.println("slot8: " + slot8);
				System.out.println("slot9: " + slot9);
				break;
			}
			
			case 3:
			{
				//Sistema de remoção através da posição da tabela hash. NÃO CONSEGUI DESENVOLVER OUTRA FORMA
				int excluir;
		    	System.out.println("Digite a posição de quem deseja remover que deseja remover: ");
		    	excluir = sc.nextInt();
		    	slot1.remove(excluir);
		    	break;
		    	
			}
			}
		} while (op != 10);
	}
}