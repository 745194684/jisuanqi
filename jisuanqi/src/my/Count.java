package my;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
@SuppressWarnings("serial")
public class Count extends JFrame implements ActionListener {
	private String firstNum;
	private String secondNum;
	private String operator;
	@SuppressWarnings("unused")
	private String resultNum;
	private String str;
	JTextField jtf = new JTextField();// 建立一个文本框
	
	public Count() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();// 建立一个容器
		jtf.setHorizontalAlignment(JTextField.RIGHT);
		JPanel jpl = new JPanel();// JPanel是轻量级容器
		c.add(jtf, BorderLayout.NORTH);
		c.add(jpl, BorderLayout.CENTER);
		jpl.setLayout(new GridLayout(5, 4));
		JButton b = null;
		b = new JButton("1");
		b.addActionListener(this);
		jpl.add(b);
		b = new JButton("2");
		b.addActionListener(this);
		jpl.add(b);
		b = new JButton("3");
		b.addActionListener(this);
		jpl.add(b);
		b = new JButton("退格");
		b.addActionListener(this);
		jpl.add(b);
		b = new JButton("清零");
		b.addActionListener(this);
		jpl.add(b);
		b = new JButton("4");
		b.addActionListener(this);
		jpl.add(b);
		b = new JButton("5");
		b.addActionListener(this);
		jpl.add(b);
		b = new JButton("6");
		b.addActionListener(this);
		jpl.add(b);
		b = new JButton("+");
		b.addActionListener(this);
		jpl.add(b);
		b = new JButton("-");
		b.addActionListener(this);
		jpl.add(b);		
		b = new JButton("7");
		b.addActionListener(this);
		jpl.add(b);
		b = new JButton("8");
		b.addActionListener(this);
		jpl.add(b);
		b = new JButton("9");
		b.addActionListener(this);
		jpl.add(b);
		b = new JButton("*");
		b.addActionListener(this);
		jpl.add(b);
		b = new JButton("/");
		b.addActionListener(this);
		jpl.add(b);
		b = new JButton("0");
		b.addActionListener(this);
		jpl.add(b);
		b = new JButton(".");
		b.addActionListener(this);
		jpl.add(b);
		b = new JButton("+/-");
		b.addActionListener(this);
		jpl.add(b);
		b = new JButton("倒数");
		b.addActionListener(this);
		jpl.add(b);
		b = new JButton("取余");
		b.addActionListener(this);
		jpl.add(b);
		b = new JButton(" ");
		jpl.add(b);
		b = new JButton(" ");
		jpl.add(b);
		
		b = new JButton("sin");
		b.addActionListener(this);
		jpl.add(b);
		b = new JButton("cos");
		b.addActionListener(this);
		jpl.add(b);	
		b.addActionListener(this);
		jpl.add(b);	
		b = new JButton("=");
		b.addActionListener(this);
		jpl.add(b);
		setBounds(200, 300, 400, 300);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		String context = btn.getText();
		if (context.equals("+")) {
			operator = "+";
			firstNum = jtf.getText();
			jtf.setText("");
			return;
		}
		if (context.equals("-")) {
			        
				if (jtf.getText().equals("")) {
					context = "-";
					jtf.setText(jtf.getText() + context);
					firstNum = jtf.getText();
				  }
				else{	
					operator = "-";
					firstNum = jtf.getText();
					jtf.setText("");					
		  }
				return;
		}
		if (context.equals("*")) {
			operator = "*";
			firstNum = jtf.getText();
			jtf.setText("");
			return;
		}
		if (context.equals("/")) {
			operator = "/";
			firstNum = jtf.getText();
			jtf.setText("");
			return;
		}
		if(context.equals("退格")){
			operator = "Ac";
			str = jtf.getText();
			str = str.substring(0,str.length()-1);
			jtf.setText(str);
			return;			
		}
		if(context.equals("清零")){
			operator = "";
			jtf.setText("");
			return ;			
		}
		if(context.equals("倒数")){
			operator = "";
			str = jtf.getText();
			double m = Double.parseDouble(str) ;
			str = 1.0/m + ""; 
			jtf.setText(str);
			return;			
		}
		if (context.equals("取余")) {
			operator = "取余";
			firstNum = jtf.getText();
			jtf.setText("");
			return;
		}
		if (context.equals("+/-")) {
			operator = "+/-";
			firstNum = jtf.getText();
			double result  = Double.parseDouble(firstNum)*(-1);
			jtf.setText(result + "");
			return;
		}
		if (context.equals("sin")) {
			operator = "";
			firstNum = jtf.getText();
			double result  =  Math.sin(Math.toRadians(Double.parseDouble(firstNum)));			
			jtf.setText(result + "");
			return;
		}
		if (context.equals("cos")) {
			operator = "";
			firstNum = jtf.getText();
			double result  =  Math.cos(Math.toRadians(Double.parseDouble(firstNum)));			
			jtf.setText(result + "");
			return;
		}
		if (context.equals("=")) {
			secondNum = jtf.getText();
			if (operator.equals("+")) {				
				double result = Double.parseDouble(firstNum) + Double.parseDouble(secondNum);				
				jtf.setText(result + "");
			}
			if (operator.equals("-")) {
				double result = Double.parseDouble(firstNum) - Double.parseDouble(secondNum);
				jtf.setText(result + "");
			}
			if (operator.equals("*")) {
				double result = Double.parseDouble(firstNum) * Double.parseDouble(secondNum);
				jtf.setText(result + "");
			}
			if (operator.equals("/")) {
				double result = Double.parseDouble(firstNum) / Double.parseDouble(secondNum);
				jtf.setText(result + "");
			}
			if (operator.equals("取余")) {
				double result = Double.parseDouble(firstNum) % Double.parseDouble(secondNum);
				jtf.setText(result + "");
			}
			return;
		}
		jtf.setText(jtf.getText() + context);
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Count a = new Count();
	}
}
