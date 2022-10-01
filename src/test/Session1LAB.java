package test;

import java.util.Scanner;

public class Session1LAB {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Output
		System.out.print("Hello");
		//shortcut print
		//syso atau sysout (ctrl + space)
//		System.out.printf("%s %d %f");
//		System.out.print("no enter");
		System.out.println(", gampang kan?");
		//run (ctrl + fn + f11)
		
		//Data Type
		//int char float double
//		int age = 19;
//		char grade = 'a';
//		float height = 123.4f;
//		double weight = 55.123456;
//		System.out.println(15 / 123.0);
		
		//Input
//		String name;
//		int age;
//		float height;
//		double weight;
//		name = scan.nextLine();
//		System.out.println(name);
//		age = scan.nextInt();
//		System.out.println(age);
//		height = scan.nextFloat();
//		System.out.println(height);
//		weight = scan.nextDouble();
//		System.out.println(weight);
		
		//Logical Operator
		// && || >= <= < > ==
//		age = scan.nextInt();
//		if(age < 18) System.out.println("Masih Muda");
//		else if(age >= 18 && age < 25) System.out.println("Cukup Tua");
//		else System.out.println("Tua");
		
		//switch case
//		int choose;
//		choose = scan.nextInt();
//		switch (choose) {
//		case 1:
//			System.out.println("Nasi Goreng");
//			break;
//		case 2:
//			System.out.println("Bakmi Efata");
//			break;
//		default:
//			System.out.println("Ga Ada");
//			break;
//		}
		
		//Repetition
		//while do while for foreach
//		int num = 1;
//		while(num <= 50) {
//			System.out.println(num);
//			num++;
//		}
		
//		do {
//			System.out.println("jalan");
//		}while(1 > 100);
		
//		for( int i = 1; i <= 50; i++)
//			System.out.print(i + " ");
		
//		int[] array = new int[100];
//		int[] array = {12, 21, 53};
//		for(int num : array) {
//			System.out.print(num + " ");
//		}
		
		int age;
		char grade;
		
		age = scan.nextInt();
		scan.nextLine();
		grade = scan.next().charAt(0);
		
		
	}
	
}
