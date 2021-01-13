package app;

import java.util.Locale;

import entities.Contribuinte;
import entities.PessoaFisica;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Contribuinte c = new PessoaFisica("Jose", 50000.00, 2000.00);
		
		System.out.println(c.taxesPaid());
	}

}
