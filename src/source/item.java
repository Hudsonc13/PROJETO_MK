package source;

public class item {

	String nome, tipo, descricao;
	double valor;
	int dia;

	public item(String nome, String tipo, String descricao, double valor, int data) {
		this.nome = nome;
		this.tipo = tipo;
		this.descricao = descricao;
		this.valor = valor;
		this.dia = data;
	}
	public void imprimirVencimento() {
        System.out.println("Dia do vencimento: " + dia + " de cada mês.");
    }
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Valor: R$ " + valor);
        imprimirVencimento();
        System.out.println("Tipo: " + tipo);
        System.out.println("Descrição: " + descricao);
    }
}

