package source;

public class item {
	
	String nome, tipo, descricao;
	float valor;
	int dia;
	
	
	public item(String nome, String tipo, String descricao, float valor, int data) {
		this.nome = nome;
		this.tipo = tipo;
		this.descricao = descricao;
		this.valor = valor;
		this.dia = data;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public float getValor() {
		return valor;
	}


	public void setValor(float valor) {
		this.valor = valor;
	}


	public int getData() {
		return dia;
	}


	public void setData(int data) {
		this.dia = data;
	}
	
	public String vencimento() {
		return "Vencimento no dia" + dia;
		
	}
	
	
	
	
	
}
