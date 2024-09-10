package app;
import source.user;
import source.gestao;
import source.item;

public class Program {
	public static void main(String[] args) {
		user u1 = new user("Lucas", "20", 1070.50);
		gestao g1 = new gestao();
		g1.setUsuario(u1);
		item i1 = new item("Netflix", "Streaming", "Streaming de filmes e series", 24.99f, 15);
		g1.setItens(i1);
		
	
	
	
	
	}

}
