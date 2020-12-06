package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		PrintService<Integer> ps = new PrintService<>();
//		PrintService<String> ps = new PrintService<>();

		
		System.out.print("How many values: ");
		int n = sc.nextInt();

		for (int i=0; i<n ; i++) {
			Integer value = sc.nextInt();
//			String value = sc.next();
			ps.addValue(value);
		}
		ps.print();
		System.out.println();
		System.out.print("First: " + ps.first());
	}

}
