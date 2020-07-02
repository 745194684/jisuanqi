package my;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
@SuppressWarnings("serial")
public class Calculator extends JFrame implements ActionListener {
	private String firstNum;
	private String secondNum;
	private String operator;
	private String str;
	JTextField jtf = new JTextField();// 建立一个文本框
	
	public Calculator() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();// 建立一个容器
		jtf.setHorizontalAlignment(JTextField.RIGHT);
		JPanel jpl = new JPanel();// JPanel是轻量级容器
		c.add(jtf, BorderLayout.NORTH);
		c.add(jpl, BorderLayout.CENTER);
		jpl.setLayout(new GridLayout(5, 5));
		JButton b = null;
		String[] s = {"1","2","3","Ac","Clear","4","5","6","+","-","7","8","9","*","/","0",".","=","倒数","取余","+/-","sin","cos","开平方","平方"}; 
		for (int i = 0; i < s.length; i++) {
			b = new JButton(s[i]);
			b.addActionListener(this);
			jpl.add(b);
		}
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
		if(context.equals("Ac")){
			operator = "Ac";
			str = jtf.getText();
			str = str.substring(0,str.length()-1);
			jtf.setText(str);
			return;			
		}
		if(context.equals("Clear")){
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
		if (context.equals("开平方")) {
			operator = "";
			firstNum = jtf.getText();
			double result  = Math.sqrt(Double.parseDouble(firstNum));			
			jtf.setText(result + "");
			return;
		}
		if (context.equals("平方")) {
			operator = "";
			firstNum = jtf.getText();
			double result  = Math.pow(Double.parseDouble(firstNum),2);			
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
		
		 new Calculator();
		 
	}
}
