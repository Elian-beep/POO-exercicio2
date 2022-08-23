package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario func1 = new Funcionario();
		
		System.out.println("Digite o nome, salario bruto e imposto do funcionário:");
		func1.nome = sc.nextLine();
		func1.salarioBruto = sc.nextDouble();
		func1.imposto = sc.nextDouble();
		
		System.out.printf("Funcionário: %s, $ %.2f\n", func1.nome, func1.salarioLiquido());
		
		System.out.println("Qual a porcentagem de incremento no salário?");
		double porc = sc.nextDouble();
		
		func1.atualizaSalario(porc);
		
		sc.close();
	}
}
