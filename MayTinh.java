import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MayTinh implements ActionListener {
	static JFrame fr;
	static JLabel lb, lb1, lb2, lb3, lb4;
	static JTextField tf, tf1;
	static JButton btn, btn1, btn2, btn3, btn4;
	
	public MayTinh() {
		fr = new JFrame();
		
		lb = new JLabel("Nhap a : ");
		lb.setBounds(10, 10, 100, 20);
		
		tf = new JTextField();
		tf.setBounds(100, 10, 200, 20);
		
		lb1 = new JLabel("Nhap b : ");
		lb1.setBounds(10, 40, 100, 20);
		
		tf1 = new JTextField();
		tf1.setBounds(100, 40, 200, 20);
		
		lb2 = new JLabel("**** Chon phep tinh ****");
		lb2.setBounds(10, 70, 400, 20);
		
		btn = new JButton("+");
		btn.setBounds(10, 100, 60, 20);
		btn1 = new JButton("-");
		btn1.setBounds(70, 100, 60, 20);
		btn2 = new JButton("*");
		btn2.setBounds(130, 100, 60, 20);
		btn3 = new JButton("/");
		btn3.setBounds(190, 100, 60, 20);
		
		lb3 = new JLabel("ket qua : ");
		lb3.setBounds(10, 130, 100, 20);
		
		lb4 = new JLabel();
		lb4.setBounds(100, 130, 200, 20);
		
		btn4 = new JButton("reset");
		btn4.setBounds(10, 170, 150, 20);
		
		fr.add(lb);
		fr.add(tf);
		fr.add(lb1);
		fr.add(tf1);
		fr.add(btn);
		fr.add(btn1);
		fr.add(btn2);
		fr.add(btn3);
		fr.add(btn4);
		fr.add(lb2);
		fr.add(lb3);
		fr.add(lb4);
		
		fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
		fr.setLayout(null);
		fr.setSize(400, 600);
		fr.setVisible(true);
		
		
		tf.addActionListener(this);
		tf1.addActionListener(this);
		btn.addActionListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		
		
		
		
	}
	public static void main(String[] args) {
		new MayTinh();
	}
	
	public int cong(int a, int b) {
		return a + b;
	}
	public int tru(int a, int b) {
		return a - b;
	}
	public int nhan(int a, int b) {
		return a * b;
	}
	public int chia(int a, int b) {
		return a+ b;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String s1 = tf.getText();
		String s2 = tf1.getText();
		
		
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		int c = 0;
		
		if(e.getSource() == btn) {
			c = cong(a,b);
		}else if(e.getSource() == btn1) {
			c = tru(a, b);
		}else if(e.getSource() == btn2) {
			c = nhan(a, b);
		}else if(e.getSource() == btn3) {
			c = chia(a, b);
		}else if(e.getSource() == btn4) {
			tf.setText(null);
			tf1.setText(null);
		}
		
		String kq = String.valueOf(c);
		lb4.setText(kq);
		
	}

}
