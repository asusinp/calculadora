package calculadora;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class CalculadoraApp {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraApp window = new CalculadoraApp();
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
	public CalculadoraApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText() + btn7.getText();
				textField.setText(text);
			}
		});
		btn7.setBounds(12, 71, 67, 25);
		frame.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText() + btn8.getText();
				textField.setText(text);
			}
		});
		btn8.setBounds(109, 71, 67, 25);
		frame.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText() + btn9.getText();
				textField.setText(text);
			}
		});
		btn9.setBounds(207, 71, 67, 25);
		frame.getContentPane().add(btn9);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText() + btn4.getText();
				textField.setText(text);
			}
		});
		btn4.setBounds(12, 108, 67, 25);
		frame.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText() + btn5.getText();
				textField.setText(text);
			}
		});
		btn5.setBounds(109, 108, 67, 25);
		frame.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText() + btn6.getText();
				textField.setText(text);
			}
		});
		btn6.setBounds(207, 108, 67, 25);
		frame.getContentPane().add(btn6);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText() + btn1.getText();
				textField.setText(text);
			}
		});
		btn1.setBounds(12, 145, 67, 25);
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText() + btn2.getText();
				textField.setText(text);
			}
		});
		btn2.setBounds(109, 145, 67, 25);
		frame.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText() + btn3.getText();
				textField.setText(text);
			}
		});
		btn3.setBounds(207, 145, 67, 25);
		frame.getContentPane().add(btn3);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText() + btn0.getText();
				textField.setText(text);
			}
		});
		btn0.setBounds(12, 182, 67, 25);
		frame.getContentPane().add(btn0);

		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText() + btnDivision.getText();
				textField.setText(text);
			}
		});
		btnDivision.setBounds(305, 71, 117, 25);
		frame.getContentPane().add(btnDivision);

		JButton btnMultiplication = new JButton("*");
		btnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText() + btnMultiplication.getText();
				textField.setText(text);
			}
		});
		btnMultiplication.setBounds(305, 108, 117, 25);
		frame.getContentPane().add(btnMultiplication);

		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText() + btnAdd.getText();
				textField.setText(text);
			}
		});
		btnAdd.setBounds(305, 145, 117, 25);
		frame.getContentPane().add(btnAdd);

		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText() + btnSub.getText();
				textField.setText(text);
			}
		});
		btnSub.setBounds(305, 182, 117, 25);
		frame.getContentPane().add(btnSub);

		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ScriptEngineManager manager = new ScriptEngineManager();
				ScriptEngine engine = manager.getEngineByName("js");
				try {
					String expression = textField.getText();
					Object result = engine.eval(expression);
					textField.setText(String.valueOf(result));
				} catch(ScriptException se) {
					System.out.println(se);
				}
			}
		});
		btnEqual.setBounds(109, 182, 165, 25);
		frame.getContentPane().add(btnEqual);

		textField = new JTextField();
		textField.setBounds(12, 12, 411, 45);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnC.setBounds(12, 219, 189, 25);
		frame.getContentPane().add(btnC);
		
		JButton btnDel = new JButton("DEL");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().substring(0,textField.getText().length() - 1));
			}
		});
		btnDel.setBounds(233, 219, 189, 25);
		frame.getContentPane().add(btnDel);
	}
}
