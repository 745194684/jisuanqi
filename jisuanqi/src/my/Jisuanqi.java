package my;

import java.util.*;

public class Jisuanqi {

	public static void main(String[] args) {
		int num1;
		int num2;
		Function s = new Function();
		System.out.println("******* 欢迎使用计算器  *******");
		show();		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);		
		while (true) { 
			System.out.printf(" 命令  > ");
			String str = scanner.next();
			if (str.equals("add")) {
				System.out.println("请输入两个整数:");
				num1 = scanner.nextInt();
				num2 = scanner.nextInt();
				s.add(num1, num2);
			}
			if (str.equals("minus")) {
				System.out.println("请输入两个整数:");
				num1 = scanner.nextInt();
				num2 = scanner.nextInt();
				s.minus(num1, num2);
			}
			if (str.equals("multiply")) {
				System.out.println("请输入两个整数:");
				num1 = scanner.nextInt();
				num2 = scanner.nextInt();
				s.multiply(num1, num2);
			}
			if (str.equals("divide")) {
				System.out.println("请输入两个整数:");
				num1 = scanner.nextInt();
				num2 = scanner.nextInt();
				s.divide(num1, num2);
			}
			if (str.equals("exit")) {
				System.out.println("谢谢使用，再见！");
				break;
			}		
		}
	}

	private static void show() {
		System.out.println("*******请选择你要用的功能*******");
		System.out.println("******* 加法(add)    *******");
		System.out.println("******* 减法(minus)  *******");
		System.out.println("*******乘法(multiply)*******");
		System.out.println("******* 除法(divide) *******");
		System.out.println("******* 退出(exit)   *******");
	}

}
