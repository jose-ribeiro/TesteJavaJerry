package Programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.aliancaSoftware;
import entidades.funcionario;
import entidades.horasDeContrato;
import entidades.enums.nivelFuncionario;


public class main {

	public static void main(String[] args) throws ParseException{
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);	
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("*************************");
		System.out.println("Alianca Software Serviços");
		System.out.println("*************************");
		
		System.out.println("Nome do Departamento");
		String nomeDepartamento = sc.nextLine();
		
		System.out.println("Bem vindo ao departamento: " + nomeDepartamento);
		System.out.println("Digite Seu nome: ");
		String nomeFuncionario = sc.nextLine();
		
		System.out.println("Nivel funcionario: ");
		String nivelFuncio = sc.nextLine();
		
		System.out.println("Base de salario: ");
		double baseSalario = sc.nextDouble();
		
		
		funcionario funcionarioAlianca = new funcionario(nomeFuncionario, nivelFuncionario.valueOf(nivelFuncio), baseSalario, new aliancaSoftware(nomeDepartamento));
			
		
		System.out.print("Quantos Contratos de trabalho:  ");
		int quantidadeDeContratos = sc.nextInt();

		for (int i = 1; i <= quantidadeDeContratos; i++) {
			System.out.println("Entre com o contrato #" + i + " data:");
			System.out.print("Entre com a data (DD/MM/YYYY): ");
			Date dataContrato = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duração (horas): ");
			int horas = sc.nextInt();
			horasDeContrato contrato = new horasDeContrato(dataContrato, valorPorHora, horas);
			funcionarioAlianca.adicionarContrato(contrato);
			
		}
		
		System.out.println();
		System.out.print("Entre com o mes e ano para calcular o salario (MM/YYYY): ");
		String mesEano = sc.next();
		int mes = Integer.parseInt(mesEano.substring(0, 2));
		int ano = Integer.parseInt(mesEano.substring(3));
		System.out.println("Name: " + funcionarioAlianca.pegaNome());
		System.out.println("Departamento: " + nomeDepartamento);
		System.out.println("Salario recebido no mes: " + mesEano + ": " + String.format("%.2f", funcionarioAlianca.calculoContrato(ano, mes)));
		 
		
		sc.close();
	}

}
