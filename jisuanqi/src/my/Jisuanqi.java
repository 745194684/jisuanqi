package my;

import java.util.*;

public class Jisuanqi {

	public static void main(String[] args) {
		int num1;
		int num2;
		Function s = new Function();
		System.out.println("******* ��ӭʹ�ü�����  *******");
		show();		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);		
		while (true) { 
			System.out.printf(" ����  > ");
			String str = scanner.next();
			if (str.equals("add")) {
				System.out.println("��������������:");
				num1 = scanner.nextInt();
				num2 = scanner.nextInt();
				s.add(num1, num2);
			}
			if (str.equals("minus")) {
				System.out.println("��������������:");
				num1 = scanner.nextInt();
				num2 = scanner.nextInt();
				s.minus(num1, num2);
			}
			if (str.equals("multiply")) {
				System.out.println("��������������:");
				num1 = scanner.nextInt();
				num2 = scanner.nextInt();
				s.multiply(num1, num2);
			}
			if (str.equals("divide")) {
				System.out.println("��������������:");
				num1 = scanner.nextInt();
				num2 = scanner.nextInt();
				s.divide(num1, num2);
			}
			if (str.equals("exit")) {
				System.out.println("ллʹ�ã��ټ���");
				break;
			}		
		}
	}

	private static void show() {
		System.out.println("*******��ѡ����Ҫ�õĹ���*******");
		System.out.println("******* �ӷ�(add)    *******");
		System.out.println("******* ����(minus)  *******");
		System.out.println("*******�˷�(multiply)*******");
		System.out.println("******* ����(divide) *******");
		System.out.println("******* �˳�(exit)   *******");
	}

}
