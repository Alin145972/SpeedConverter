package speedConverter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame1 {

	private JFrame frmSpeedconverter;
	private JTextField textFieldInput;
	private JTextField textFieldOutput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frmSpeedconverter.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSpeedconverter = new JFrame();
		frmSpeedconverter.setTitle("SpeedConverter");
		frmSpeedconverter.getContentPane().setFont(new Font("Verdana", Font.PLAIN, 20));
		frmSpeedconverter.setBounds(100, 100, 928, 566);
		frmSpeedconverter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSpeedconverter.getContentPane().setLayout(null);
		
		JLabel lblExplain = new JLabel("This app converts speed value from kilometers per hour into miles per hour.");
		lblExplain.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblExplain.setBounds(49, 11, 812, 107);
		frmSpeedconverter.getContentPane().add(lblExplain);
		
		JLabel lblInstruction = new JLabel("Insert a valid kilometers per hour value here");
		lblInstruction.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblInstruction.setBounds(59, 107, 499, 53);
		frmSpeedconverter.getContentPane().add(lblInstruction);
		
		textFieldInput = new JTextField();
		textFieldInput.setFont(new Font("Verdana", Font.BOLD, 20));
		textFieldInput.setBounds(558, 118, 249, 39);
		frmSpeedconverter.getContentPane().add(textFieldInput);
		textFieldInput.setColumns(10);
		
		JButton btnConvert = new JButton("Convert to miles per hour");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Now lets make the buttons work
				double InputValue;
				try {
					InputValue = Double.parseDouble(textFieldInput.getText());
					textFieldOutput.setText(SpeedConverter.printConversion(InputValue));
					
				}catch(Exception e2) {
					textFieldOutput.setText("Please Enter a valid km/h value!");
				}
			}
		});
		btnConvert.setForeground(new Color(255, 255, 255));
		btnConvert.setBackground(new Color(128, 128, 128));
		btnConvert.setFont(new Font("Verdana", Font.BOLD, 20));
		btnConvert.setBounds(227, 219, 452, 115);
		frmSpeedconverter.getContentPane().add(btnConvert);
		
		textFieldOutput = new JTextField();
		textFieldOutput.setFont(new Font("Verdana", Font.BOLD, 20));
		textFieldOutput.setBounds(59, 427, 524, 53);
		frmSpeedconverter.getContentPane().add(textFieldOutput);
		textFieldOutput.setColumns(10);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldInput.setText("");
				textFieldOutput.setText("");
			}
		});
		btnReset.setForeground(new Color(255, 255, 255));
		btnReset.setBackground(new Color(128, 128, 128));
		btnReset.setFont(new Font("Verdana", Font.BOLD, 20));
		btnReset.setBounds(621, 427, 186, 53);
		frmSpeedconverter.getContentPane().add(btnReset);
	}
}
