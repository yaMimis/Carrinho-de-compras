package main;

import java.util.ArrayList;

public class Carrinho {
	
	ArrayList<Produto> listaProduto = new ArrayList<Produto>(); 
	
	public void adicionar (Produto p) {
		
		listaProduto.add(p);
		System.out.println("O produto "+ p.nome + " foi adicionado na lista!");
		
		
	}
	
	public void remover (int i) {
		listaProduto.remove(i); 
		System.out.println("Produto Removido!");
	}
	
	public void visualizar () {
		/*for (Produto p : listaProduto) {
			System.out.println(p.nome + " " + p.preco);
		}*/
		
		for (int i = 0 ; i < listaProduto.size(); i++) {
			Produto p = listaProduto.get(i);
			System.out.println("I = "+ i + " Nome: "+p.nome + " Preço:" + p.preco);
		}
	}
}
