package FirstProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator {

	private JFrame frame;
	private JTextField textField;

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
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.setBounds(20, 159, 67, 55);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnAc = new JButton("AC");
		btnAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAc.setBounds(20, 91, 67, 55);
		frame.getContentPane().add(btnAc);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(20, 159, 67, 55);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("4");
		btnNewButton_2_1.setBounds(20, 236, 67, 55);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_2_1_1 = new JButton("1");
		btnNewButton_2_1_1.setBounds(20, 302, 67, 55);
		frame.getContentPane().add(btnNewButton_2_1_1);
		
		JButton btnNewButton_1_1 = new JButton("0");
		btnNewButton_1_1.setBounds(111, 91, 67, 55);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("8");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_2.setBounds(111, 159, 67, 55);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("5");
		btnNewButton_1_3.setBounds(111, 236, 67, 55);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("2");
		btnNewButton_1_4.setBounds(111, 302, 67, 55);
		frame.getContentPane().add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("=");
		btnNewButton_1_5.setBounds(318, 302, 85, 55);
		frame.getContentPane().add(btnNewButton_1_5);
		
		JButton btnNewButton_1_6 = new JButton("9");
		btnNewButton_1_6.setBounds(211, 159, 67, 55);
		frame.getContentPane().add(btnNewButton_1_6);
		
		JButton btnNewButton_1_7 = new JButton("6");
		btnNewButton_1_7.setBounds(211, 236, 67, 55);
		frame.getContentPane().add(btnNewButton_1_7);
		
		JButton btnNewButton_1_8 = new JButton("3");
		btnNewButton_1_8.setBounds(211, 302, 67, 55);
		frame.getContentPane().add(btnNewButton_1_8);
		
		JButton btnNewButton_1_9 = new JButton("/");
		btnNewButton_1_9.setBounds(318, 91, 67, 55);
		frame.getContentPane().add(btnNewButton_1_9);
		
		JButton btnNewButton_1_10 = new JButton("*");
		btnNewButton_1_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_10.setBounds(318, 159, 67, 55);
		frame.getContentPane().add(btnNewButton_1_10);
		
		JButton btnNewButton_1_11 = new JButton("+");
		btnNewButton_1_11.setBounds(318, 236, 67, 55);
		frame.getContentPane().add(btnNewButton_1_11);
		
		JButton btnNewButton_1_12 = new JButton("-");
		btnNewButton_1_12.setBounds(211, 91, 67, 55);
		frame.getContentPane().add(btnNewButton_1_12);
	}
}
