package Calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator {

	private JFrame frame;
	private JTextField textField;

	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 464);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 416, 55);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn_7.getText();
				textField.setText(number);
			}
		});
		btn_7.setBounds(20, 159, 67, 55);
		frame.getContentPane().add(btn_7);
		
		JButton btnClear = new JButton("AC");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setBounds(20, 91, 67, 55);
		frame.getContentPane().add(btnClear);
		
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn_4.getText();
				textField.setText(number);
			}
		});
		btn_4.setBounds(20, 236, 67, 55);
		frame.getContentPane().add(btn_4);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn_1.getText();
				textField.setText(number);
			}
		});
		btn_1.setBounds(20, 302, 67, 55);
		frame.getContentPane().add(btn_1);
		
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn_0.getText();
				textField.setText(number);
			}
		});
		btn_0.setBounds(111, 91, 67, 55);
		frame.getContentPane().add(btn_0);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn_8.getText();
				textField.setText(number);
			}
		});
		btn_8.setBounds(111, 159, 67, 55);
		frame.getContentPane().add(btn_8);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn_5.getText();
				textField.setText(number);
			}
		});	
		btn_5.setBounds(111, 236, 67, 55);
		frame.getContentPane().add(btn_5);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn_2.getText();
				textField.setText(number);
			}
		});	
		btn_2.setBounds(111, 302, 67, 55);
		frame.getContentPane().add(btn_2);
		
		JButton btn_EqualsTo = new JButton("=");
		btn_EqualsTo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation== "+"){
					result=first+second;
					answer=String.format("% .2f", result);
					textField.setText(answer);
				}else if(operation== "-"){
					result=first-second;
					answer=String.format("% .2f", result);
					textField.setText(answer);
				}else if(operation== "*"){
					result=first*second;
					answer=String.format("% .2f", result);
					textField.setText(answer);
				}
				else if(operation== "/"){
					result=first/second;
					answer=String.format("% .2f", result);
					textField.setText(answer);
				}
			}
		});	
		btn_EqualsTo.setBounds(318, 302, 85, 55);
		frame.getContentPane().add(btn_EqualsTo);
		
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn_9.getText();
				textField.setText(number);
			}
		});	
		btn_9.setBounds(211, 159, 67, 55);
		frame.getContentPane().add(btn_9);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn_6.getText();
				textField.setText(number);
			}
		});	
		btn_6.setBounds(211, 236, 67, 55);
		frame.getContentPane().add(btn_6);
		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn_3.getText();
				textField.setText(number);
			}
		});	
		btn_3.setBounds(211, 302, 67, 55);
		frame.getContentPane().add(btn_3);
		
		JButton btn_divide = new JButton("/");
		btn_divide.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});	
		btn_divide.setBounds(318, 91, 67, 55);
		frame.getContentPane().add(btn_divide);
		
		JButton btn_multiply = new JButton("*");
		btn_multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btn_multiply.setBounds(318, 159, 67, 55);
		frame.getContentPane().add(btn_multiply);
		
		JButton btn_add = new JButton("+");
		btn_add.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});	
		btn_add.setBounds(318, 236, 67, 55);
		frame.getContentPane().add(btn_add);
		
		JButton btn_subtract = new JButton("-");
		btn_subtract.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});	
		btn_subtract.setBounds(211, 91, 67, 55);
		frame.getContentPane().add(btn_subtract);
	}
}
