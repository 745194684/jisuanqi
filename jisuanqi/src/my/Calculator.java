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
	JTextField jtf = new JTextField();// ����һ���ı���
	
	public Calculator() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();// ����һ������
		jtf.setHorizontalAlignment(JTextField.RIGHT);
		JPanel jpl = new JPanel();// JPanel������������
		c.add(jtf, BorderLayout.NORTH);
		c.add(jpl, BorderLayout.CENTER);
		jpl.setLayout(new GridLayout(5, 5));
		JButton b = null;
		String[] s = {"1","2","3","Ac","Clear","4","5","6","+","-","7","8","9","*","/","0",".","=","����","ȡ��","+/-","sin","cos","��ƽ��","ƽ��"}; 
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
		if(context.equals("����")){
			operator = "";
			str = jtf.getText();
			double m = Double.parseDouble(str) ;
			str = 1.0/m + ""; 
			jtf.setText(str);
			return;			
		}
		if (context.equals("ȡ��")) {
			operator = "ȡ��";
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
		if (context.equals("��ƽ��")) {
			operator = "";
			firstNum = jtf.getText();
			double result  = Math.sqrt(Double.parseDouble(firstNum));			
			jtf.setText(result + "");
			return;
		}
		if (context.equals("ƽ��")) {
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
			if (operator.equals("ȡ��")) {
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
