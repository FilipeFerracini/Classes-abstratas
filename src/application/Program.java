package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Person> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.printf("Tax payer #%d data:", i);
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();

			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenses = sc.nextDouble();
				list.add(new Individual(name, annualIncome, healthExpenses));
			} else {
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				list.add(new Company(name, annualIncome, numberEmployees));
			}
		}

		System.out.println();
		System.out.println("TAXES PAID:");
		double sum = 0.0;
		for (Person p : list) {
			sum += p.tax();
			System.out.println(p);
		}
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f%n", sum);

		sc.close();

	}

}
