package pacakge;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;


public class Form {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField_2;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form window = new Form();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	public Form() 
	{
		initialize();
	}

	
	public void initialize() {
		frame = new JFrame();
		frame.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		frame.setBackground(Color.GRAY);
		frame.setBounds(100, 100, 480 , 500);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblNewLabel_7 = new JLabel("Sign In Page");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(127, 30, 214, 38);
		frame.getContentPane().add(lblNewLabel_7);
		
		JButton btnNewButton_3 = new JButton("Sign In");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				char [] password3 = passwordField_2.getPassword();
				String pass3 = String.valueOf(password3);
				String name1 = textField.getText();
				
				try
				{	
					File file = new File("SignUpFile.txt");
					BufferedReader br = new BufferedReader(new FileReader(file));

					String st;
					boolean flag = false;
					while ((st = br.readLine()) != null)
					{
						String str [] = st.split(",");
						if(str[0].equals(name1) && str[3].equals(pass3))
						{
							JOptionPane.showMessageDialog(null, "Log in succesful!");
							flag = true;
							break;
						}
					}
					if(!flag)JOptionPane.showMessageDialog(null, "No match found!");
					br.close();
					
				}
				catch(IOException er)
				{
					er.printStackTrace();
				}
				
				
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_3.setBounds(127, 239, 202, 38);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblName = new JLabel(" Name :");
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblName.setBounds(78, 123, 95, 25);
		frame.getContentPane().add(lblName);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(78, 159, 95, 25);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(196, 123, 133, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(196, 159, 133, 22);
		frame.getContentPane().add(passwordField_2);
		
		JLabel lblDontHaveAn = new JLabel("Don't have an account ? Create One");
		lblDontHaveAn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDontHaveAn.setHorizontalAlignment(SwingConstants.LEFT);
		lblDontHaveAn.setBounds(10, 342, 225, 25);
		frame.getContentPane().add(lblDontHaveAn);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				signUp sg = new signUp();
				sg.signUP();
				
			}
		});
		btnSignUp.setBounds(252, 345, 89, 23);
		frame.getContentPane().add(btnSignUp);
		
	}		
}

		

