package br.com.impacta.ac3_4;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class UsarArvore {
	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		Arvore arv = new Arvore();
		int opcao;
		long x;
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Programa Arvore binaria de long"
					+ "\n--------------------------------------------"
					+ "\n1 - Inserir"
					+ "\n2 - Exibir"
					+ "\n3 - Sair do Programa"
					+ "\nDigite o número da opção: "));
			switch (opcao) {
			case 1: {
				x = Long.parseLong(JOptionPane.showInputDialog("Informe o valor (long) -> "));
				arv.inserir(x);
				break;
			}
			case 2: {
				arv.caminhar();
				break;
			}
			}
		} while (opcao != 3);
	}
}