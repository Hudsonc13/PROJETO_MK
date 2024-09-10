package source;

public class gestao {
	item itens[];
	user usuario;
	int totItens;
	public user getUsuario() {
		return usuario;
	}
	public void setUsuario(user usuario) {
		this.usuario = usuario;
	}
	public item[] getItens() {
		return itens;
	}
	public void setItens(item item) {
		this.itens[totItens] = item;
		totItens += 1;
	} 
}
