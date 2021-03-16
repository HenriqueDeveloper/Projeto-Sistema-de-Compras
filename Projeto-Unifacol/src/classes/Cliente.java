package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import interfaces.Cadastro;


public class Cliente extends Pessoa implements Cadastro {

	List<Cliente> dados = new ArrayList<>();

	Scanner entrada = new Scanner(System.in);
	public String nome;
	private String email;
	private int senha;
	
	boolean login = false;

	public Cliente(String email, String nome, int idade, int senha) {
		setEmail(email);
		setNome(nome);
		setIdade(idade);
		setSenha(senha);
	}

	public Cliente() {
		System.out.println("-------------------------------");
		setNome("NOVO USUÁRIO");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	@SuppressWarnings("unchecked")

	@Override
	public void Adicionar() {
		try {
			System.out.println("NOME: ");
			setNome(entrada.next().trim().replace(" ", "").toUpperCase());

			System.out.println("IDADE: ");
			setIdade(entrada.nextInt());

			System.out.println("E-MAIL: ");
			setEmail(entrada.next());

			System.out.println("SENHA: ");
			setSenha(entrada.nextInt());

			System.out.println("-----------------");
			System.out.println("DADOS CADASTRADOS");
			System.out.println("------------------");
		} catch (java.util.InputMismatchException e) {
			System.out.println("---------------------------");
			System.out.println("ERRO! DIGITE APENAS NÚMEROS");
			System.out.println("---------------------------");
		}
		dados.add(new Cliente(getEmail(), getNome(), getIdade(), getSenha()));

	}

	public void fazerLogin() {
		
			System.out.println("E-MAIL: ");
			String email = entrada.next();
			System.out.println("SENHA: ");
			int senha = entrada.nextInt();

			for (int i = 0; i < dados.size(); i++) {
				if (email.equals(dados.get(i).getEmail()) && senha == dados.get(i).getSenha()) {
					System.out.println("--------------");
					System.out.println("LOGIN EFETUADO");
					System.out.println("--------------");
					this.login = true;

				} else {
					System.out.println("----------------");
					System.out.println("LOGIN NÃO EXISTE");
					System.out.println("----------------");

				}
			}
		}
	}
