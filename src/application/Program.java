package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Entrada:");
		student.name   = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		System.out.println("Saida:");
		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
		
		if (student.finalGrade() > 60.0) {
			System.out.printf("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoint());
		}
		
		sc.close();
				
		

	}

}
