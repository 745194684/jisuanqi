package my;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class Chuangkou extends Frame {
	public void lunchFrame() {
		setSize(300, 300);
		setLocation(100, 100);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});
	}
 
	public void paint(Graphics g) {
		g.drawLine(100, 100, 200, 200);//����
	    g.drawRect(100, 100, 200, 200);//������
	    g.drawOval(100, 100, 200, 200);//��Բ
	}





	public static void main(String[] args) {
		Chuangkou gf = new Chuangkou();
		gf.lunchFrame();

	}
}
