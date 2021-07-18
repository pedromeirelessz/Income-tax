package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int N = sc.nextInt();

		for (int cont = 1; cont <= N; cont++) {

			System.out.println("Tax payer #" + cont + " data: ");

			System.out.print("Individual or companay (i/c)?: ");
			char alternative = sc.next().charAt(0);

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();

			if (alternative == 'i') {

				System.out.print("Health expenditures?: ");
				Double healthExpenditures = sc.nextDouble();

				list.add(new Individual(name, anualIncome, healthExpenditures));

			} else if (alternative == 'c') {

				System.out.print("Number of employees: ");
				Integer numberOfEmployees = sc.nextInt();

				list.add(new Company(name, anualIncome, numberOfEmployees));

			}

		}

		double sum = 0.0;

		System.out.println();
		System.out.println("TAXES PAID: ");

		for (TaxPayer tax : list) {

			sum += tax.tax();

			System.out.println(tax.getName() + ": $" + String.format("%.2f", tax.tax()));
		}

		System.out.println();
		System.out.println("Total taxes: $" + sum);

		sc.close();
	}
}
