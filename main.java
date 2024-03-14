package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		Scanner oUserInput = new Scanner(System.in);

		String sStudentName = "";
		String sStudentMajor = "";
		long lStudentNum = 0;

		while (true) {
			try {
				System.out.print("학번을 입력하세요>>");
				lStudentNum = oUserInput.nextLong();

				break;
			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다");
				oUserInput.nextLine();
			}
		}
		oUserInput.nextLine();

		System.out.print("이름을 입력하세요>>");
		sStudentName = oUserInput.nextLine();

		System.out.print("전공을 입력하세요>>");
		sStudentMajor = oUserInput.nextLine();

		oUserInput.close();

		System.out.println("학번: " + lStudentNum);
		System.out.println("이름: " + sStudentName);
		System.out.println("전공: " + sStudentMajor);

//with bash

	}

}
