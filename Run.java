package one.two.three;

import one.two.three.Candy;
import java.util.Scanner;

public class Run {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);

		int a;
		int b;

		System.out.println("������ ������ �ο� ���� ���� ��, �ο��� ������ ��� ���� �� �ִ��� ����ϴ� ���α׷��Դϴ�.");
		System.out.println("������ ������ �ο� ���� �Է��ϼ���.");
		System.out.print("���� ����: ");
		a = sc.nextInt();
		System.out.print("�ο� ��: ");
		b = sc.nextInt();

		Candy C = new Candy();

		if (C.canGetCandy(a, b) <= 0) {
			System.out.println("1�� �� 1���� ������ ���� �� �����Ƿ� ������ ������� �ʽ��ϴ�.");
		} else {
			System.out.println(C.canGetCandy(a, b) + "���� ���� �� �ֽ��ϴ�.");
		System.out.println(C.leftCandy(a, b) + "���� ���ƿ�.");
		}
	}
}
