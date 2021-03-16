package classes;

import java.util.Scanner;

public class Sistema {

	// ALUNO: CARLOS HENRIQUE DE SANTANA SOARES

	static int opcao;

	static void menu() {

		Scanner entrada = new Scanner(System.in);
		Compra compra = new Compra();
		Cliente cliente = new Cliente();
		int resp;

		do {
			System.out.println("BEM VINDO: " + cliente.getNome());
			System.out.println("-------------------------------");
			System.out.println("SELECIONE UMA DAS OPÇÕES ABAIXO ");
			System.out.println("-------------------------------");
			System.out.println("[1] - CADASTRAR CLIENTE");
			System.out.println("[2] - LOGIN");
			System.out.println("[3] - MENU DE COMPRA");
			System.out.println("[4] - SAIR");
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				cliente.Adicionar();
				break;
			case 2:
				cliente.fazerLogin();
				break;

			case 3:
				/*if (cliente.dados.isEmpty()) {
					System.out.println("--------------------------------------------------------------------");
					System.out.println("REALIZE UM CADASTRO PARA PODER COMPRAR SEUS PRODUTOS");
					System.out.println("--------------------------------------------------------------------");
				}
				if (cliente.login == false) {
					System.out.println("------------------------");
					System.out.println("REALIZE PRIMEIRO O LOGIN");
					System.out.println("------------------------");
				} else {*/
					compra.menuCompra();
				//}
				break;
			case 4:
				System.exit(0);
				break;

			default:
				System.out.println("---------------");
				System.out.println("VALOR INCORRETO");
				System.out.println("---------------");
				break;
			}

			System.out.println("DIGITE [0] PARA VOLTAR AO MENU: ");
			resp = entrada.nextInt();

		} while (resp == 0);

	}

	public static void main(String[] args) {
        try {
		Sistema.menu();
        }catch(Exception e) {
        	System.out.println("");
        }

	}

}
