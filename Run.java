package one.two.three;

import one.two.three.Candy;
import java.util.Scanner;

public class Run {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);

		int a;
		int b;

		System.out.println("사탕의 갯수와 인원 수를 정한 후, 인원당 사탕을 몇개씩 가질 수 있는지 계산하는 프로그램입니다.");
		System.out.println("사탕의 갯수와 인원 수를 입력하세요.");
		System.out.print("사탕 갯수: ");
		a = sc.nextInt();
		System.out.print("인원 수: ");
		b = sc.nextInt();

		Candy C = new Candy();

		if (C.canGetCandy(a, b) <= 0) {
			System.out.println("1인 당 1개의 사탕을 먹을 수 없으므로 사탕을 배분하지 않습니다.");
		} else {
			System.out.println(C.canGetCandy(a, b) + "개씩 먹을 수 있습니다.");
		System.out.println(C.leftCandy(a, b) + "개가 남아요.");
		}
	}
}
