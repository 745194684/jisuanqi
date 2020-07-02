package my;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Windows {
	public static void main(String[] args) {
		Frame f = new Frame("计算器界面");
		f.setBounds(200, 200, 350, 220);
		// f.setLayout(new GridBagLayout());
		Label label1 = new Label("第一个数:");
		f.add(label1);
		TextField textFiled1 = new TextField(30);
		f.add(textFiled1);
		Label label2 = new Label("第二个数:");
		f.add(label2);
		TextField textFiled2 = new TextField(30);
		f.add(textFiled2);
		f.setLayout(new GridLayout(5, 5));
		for (int i = 1; i <= 3; i++) {
			Button btn1 = new Button(String.valueOf(i));
			f.add(btn1);
		}
		;
		Button btnA = new Button("+");
		f.add(btnA);
		for (int i = 4; i <= 6; i++) {
			Button btn2 = new Button(String.valueOf(i));
			f.add(btn2);
		}
		;

		Button btnB = new Button("-");
		f.add(btnB);

		for (int i = 7; i <= 9; i++) {
			Button btn3 = new Button(String.valueOf(i));
			f.add(btn3);
		}
		;

		Button btnC = new Button("*");
		f.add(btnC);
		Button btnD = new Button(" ");
		f.add(btnD);
		Button btnE = new Button(" ");
		f.add(btnE);
		Button btnF = new Button("=");
		f.add(btnF);
		Button btnG = new Button("/");
		f.add(btnG);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
			System.exit(0);
			}
		});
	}
}