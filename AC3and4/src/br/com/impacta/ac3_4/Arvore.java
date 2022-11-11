package br.com.impacta.ac3_4;

import javax.swing.JOptionPane;

public class Arvore {
	private No root;

	public Arvore() {
		root = null;
	}

	public void inserir(long v) {
		No novo = new No();
		novo.item = v;
		novo.dir = null;
		novo.esq = null;

		if (root == null)
			root = novo;
		else {
			No atual = root;
			No anterior;
			while (true) {
				anterior = atual;
				if (v <= atual.item) {
					atual = atual.esq;
					if (atual == null) {
						anterior.esq = novo;
						return;
					}
				} else {
					atual = atual.dir;
					if (atual == null) {
						anterior.dir = novo;
						return;
					}
				}
			}
		}

	}

	public No buscar(long chave) {
		if (root == null)
			return null;
		No atual = root;
		while (atual.item != chave) {
			if (chave < atual.item)
				atual = atual.esq;
			else
				atual = atual.dir;
			if (atual == null)
				return null;
		}
		return atual;
	}

	public No no_sucessor(No apaga) {
		No paidosucessor = apaga;
		No sucessor = apaga;
		No atual = apaga.dir;

		while (atual != null) {
			paidosucessor = sucessor;
			sucessor = atual;
			atual = atual.esq;
		}
		if (sucessor != apaga.dir) {
			paidosucessor.esq = sucessor.dir;
			sucessor.dir = apaga.dir;
		}
		return sucessor;
	}

	public void caminhar() {
		JOptionPane.showMessageDialog(null,"Exibindo em ordem: ");
		inOrder(root);
		JOptionPane.showMessageDialog(null,"Exibindo em pos-ordem: ");
		posOrder(root);
		JOptionPane.showMessageDialog(null,"Exibindo em pre-ordem: ");
		preOrder(root);
		JOptionPane.showMessageDialog(null,"Altura da arvore: " + altura(root));
		JOptionPane.showMessageDialog(null,"Quantidade de folhas: " + folhas(root));
		JOptionPane.showMessageDialog(null,"Quantidade de Nós: " + contarNos(root));
	}

	public void inOrder(No atual) {
		if (atual != null) {
			inOrder(atual.esq);
			JOptionPane.showMessageDialog(null,atual.item + " ");
			inOrder(atual.dir);
		}
	}

	public void preOrder(No atual) {
		if (atual != null) {
			JOptionPane.showMessageDialog(null,atual.item + " ");
			preOrder(atual.esq);
			preOrder(atual.dir);
		}
	}

	public void posOrder(No atual) {
		if (atual != null) {
			posOrder(atual.esq);
			posOrder(atual.dir);
			JOptionPane.showMessageDialog(null,atual.item + " ");
		}
	}

	public int altura(No atual) {
		if (atual == null || (atual.esq == null && atual.dir == null))
			return 0;
		else {
			if (altura(atual.esq) > altura(atual.dir))
				return (1 + altura(atual.esq));
			else
				return (1 + altura(atual.dir));
		}
	}

	public int folhas(No atual) {
		if (atual == null)
			return 0;
		if (atual.esq == null && atual.dir == null)
			return 1;
		return folhas(atual.esq) + folhas(atual.dir);
	}

	public int contarNos(No atual) {
		if (atual == null)
			return 0;
		else
			return (1 + contarNos(atual.esq) + contarNos(atual.dir));
	}
}