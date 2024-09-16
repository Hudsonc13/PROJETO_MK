package source;

public class item {

	public String nome, tipo, descricao;
	public double valor;
	public int dia;
	
	public item(String nome, String tipo, String descricao, double valor, int data) {
		this.nome = nome;
		this.tipo = tipo;
		this.descricao = descricao;
		this.valor = valor;
		this.dia = data;
	}

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Valor: R$ " + valor);
        System.out.println("Dia do vencimento: " + dia + " de cada mês.");
        System.out.println("Tipo: " + tipo);
        System.out.println("Descrição: " + descricao);
    }
}

