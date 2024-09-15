package source;

import java.util.Scanner;

public class gestao {
	item assinaturas[];
	user usuario;
	int contador;

	public gestao(user usuario, int contador) {
		this.usuario = usuario;
		this.assinaturas = new item[contador];
		this.contador = 0;
	}

	public void adicionarAssinatura(item assinatura) {
		if (contador < assinaturas.length) {
			assinaturas[contador] = assinatura;
			contador++;
			System.out.println("Assinatura adicionada com sucesso!");
		} else {
			System.out.println("Limite de assinaturas atingido");
		}
	}

	public void removerAssinatura(String nome) {
		boolean encontrado = false;
		for (int i = 0; i < contador; i++) {
			if (assinaturas[i].nome.equalsIgnoreCase(nome)) {
				encontrado = true;

				for (int j = i; j < contador - 1; j++) {
					assinaturas[j] = assinaturas[j + 1];
				}
				assinaturas[contador - 1] = null;
				contador--;
				System.out.println("Assinatura removida com sucesso!");
				break;
			}
			if (encontrado == false) {
				System.out.println("Assinatura não encontrada.");
			}
		}
	}
	
	public void alterarAssinatura(String nome) {
        boolean encontrado = false;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < contador; i++) {
            if (assinaturas[i].nome.equalsIgnoreCase(nome)) {
                encontrado = true;
                System.out.println("Alterando a assinatura: " + nome);
                System.out.print("Novo valor: ");
                assinaturas[i].valor = sc.nextDouble();
                sc.nextLine(); 
                System.out.print("Novo dia de vencimento: ");
                assinaturas[i].dia = sc.nextInt();
                sc.nextLine();
                System.out.print("Novo tipo: ");
                assinaturas[i].tipo = sc.nextLine();
                System.out.print("Nova descrição: ");
                assinaturas[i].descricao = sc.nextLine();
                System.out.println("Assinatura alterada com sucesso!");
                break;
            }
            sc.close();
        }
        if (encontrado == false) {
            System.out.println("Assinatura não encontrada.");
        }
    }
	
	public void calcularDespesas() {
        double total = 0;
        for (int i = 0; i < contador; i++) {
            total += assinaturas[i].valor;
        }
        System.out.println("Total de despesas com assinaturas: R$ " + total);
    }
	
	public void listarAssinaturas() {
        if (contador == 0) {
            System.out.println("Nenhuma assinatura cadastrada.");
            return;
        }
        for (int i = 0; i < contador; i++) {
            System.out.println("Assinatura " + (i + 1) + ":");
            assinaturas[i].exibirInfo();
            System.out.println("------------------------");
        }
    }
}
