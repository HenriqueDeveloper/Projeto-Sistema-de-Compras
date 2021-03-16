package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import interfaces.Cadastro;

public class Compra implements Cadastro {

	Scanner entrada = new Scanner(System.in);

	List<Produto> produtos = new ArrayList();
	List<Double> totalProduto = new ArrayList();
	Produto produto = new Produto();

	Cliente cliente = new Cliente();

	@Override
	public void Adicionar() {
		Produto produto = new Produto();

		try {
			System.out.print("NOME DO PRODUTO: ");
			produto.setNome(entrada.next().trim().replace(" ", "").toUpperCase());

			System.out.print("PREÇO: ");
			produto.setPreco(entrada.nextDouble());

			System.out.print("QUANTIDADE: ");
			produto.setQtd(entrada.nextInt());

			System.out.print("CÓDIGO DO CLIENTE: ");
			produto.setCodCliente(entrada.nextInt());

			produtos.add(produto);

			System.out.println("----------------------------");
			System.out.println("COMPRA EFETUADA COM SUCESSO!");
			System.out.println("----------------------------");
		} catch (java.util.InputMismatchException e) {
			System.out.println("-------------------------");
			System.out.print("ERRO! DIGITE APENAS NÚMEROS.\n");
			System.out.println("-------------------------");
		}
	}

	public double total = 0;

	public void obterValorTotal() {

		for (int i = 0; i < produtos.size(); i++) {
			total = produtos.get(i).getPreco() * produtos.get(i).getQtd();
			System.out.println("COMPRA " + (i + 1) + " FICOU COM TOTAL: " + total);
			totalProduto.add(total);
		}

	}

	public void Produtos() {
		for (int i = 0; i < produtos.size(); i++) {
			System.out.println("------------------");
			System.out.println("COMPRA: " + (i + 1));
			System.out.println("NOME: " + produtos.get(i).getNome() + "\nPREÇO: " + produtos.get(i).getPreco()
					+ "\nQUANTIDADE: " + produtos.get(i).getQtd());
			System.out.println("------------------");
		}

	}

	public void Desconto() {
		try {
			for (int i = 0; i < produtos.size(); i++) {
				if (totalProduto.get(i) >= 100) {
					double tot = 0;
					double desconto = 0;
					tot = (totalProduto.get(i) * 10) / 100;
					desconto = totalProduto.get(i) - tot;
					System.out.println("--------------------------------------");
					System.out.println("COMPRA: " + (i + 1));
					System.out.println("PARABÉNS! VOCÊ TEM DIREITO AO DESCONTO DE 10%.\nSUA COMPRA FICARÁ POR: "
							+ desconto + "R$ ");
					System.out.println("--------------------------------------");

				} else if (totalProduto.get(i) < 100 && totalProduto.get(i) != 0) {
					System.out.println("COMPRA: " + (i + 1));
					System.out.println("--------------------------------");
					System.out.println("VOCÊ NÃO TEM DIREITO AO DESCONTO");
					System.out.println("--------------------------------");
				}

			}

		} catch (java.lang.IndexOutOfBoundsException e) {
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println(
					"ATENÇÃO!\nVOCÊ PRECISA SELECIONAR A OPÇÃO [2] ANTES DE VERIFICAR SE TEM DIREITO AO DESCONTO.");
			System.out.println("---------------------------------------------------------------------------------");
		}
	}

	boolean achou = false;

	public void verificarPorCodigo() {
		int codigo;
		System.out.println("INFORME O CÓDIGO DO CLIENTE: ");
		codigo = entrada.nextInt();
		for (int i = 0; i < produtos.size(); i++) {
			if (codigo == produtos.get(i).getCodCliente()) {
				System.out.println("ESSE USUÁRIO COMPROU: " + "(" + (produtos.get(i).getQtd()+ ") ") 
						+ produtos.get(i).getNome());
				achou = true;

			}
		}
		if (!achou) {
			System.out.println("CÓDIGO INVÁLIDO!");
		}
	}

	public void menuCompra() {

		int resp;
		do {
			System.out.println("--------------------------------");
			System.out.println("BEM-VINDO AO MENU DE COMPRAS");
			System.out.println("--------------------------------");
			System.out.println("[1] - EFETUAR UMA COMPRA");
			System.out.println("[2] - OBTER VALOR TOTAL DA COMPRA\"");
			System.out.println("[3] - MOSTRAR TODAS AS COMPRAS");
			System.out.println("[4] - VERIFICAR SE TEM DIREITO AO DESCONTO");
			System.out.println("[5] - VERIFICAR COMPRA POR CÓDIGO DO PRODUTO");
			System.out.println("[6] - VOLTAR AO MENU INICIAL");
			Sistema.opcao = entrada.nextInt();

			switch (Sistema.opcao) {
			case 1:
				Adicionar();
				break;
			case 2:
				obterValorTotal();
				break;
			case 3:
				Produtos();
				break;
			case 4:
				Desconto();
				break;
			case 5:
				verificarPorCodigo();
				break;
			case 6:
				Sistema.menu();
				break;
			}

			System.out.println("DIGITE 0 PARA VOLTAR AO MENU");
			resp = entrada.nextInt();

		} while (resp == 0);

	}

}
