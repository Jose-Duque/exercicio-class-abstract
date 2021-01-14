package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJurica;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> list = new ArrayList<>();
		
		System.out.print("Enter the number of payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or Company (c/i)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual incone: ");
			double rendaAnual = sc.nextDouble();
			if(type == 'i') {
				System.out.print("Health expenditures: ");
				double health = sc.nextDouble();
				list.add(new PessoaFisica(name, rendaAnual, health));
			}
			else {
				System.out.print("Number of employees: ");
				int employee = sc.nextInt();
				list.add(new PessoaJurica(name, rendaAnual, employee));
			}
		}
		System.out.println();
		System.out.println("Taxes paid:");
		double sum = 0.0;
		for (Contribuinte obj : list) {
			System.out.printf(obj.getName() + ": $ %.2f", + obj.taxesPaid());
			System.out.println();
			sum+= obj.taxesPaid();
		}
		System.out.println();
		System.out.println("Total taxes:");
		System.out.printf("%.2f", sum);
		
		sc.close();
	}
	
}
