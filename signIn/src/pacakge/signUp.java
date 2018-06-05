package pacakge;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

public class signUp {
	
	private JFrame frame;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField txtLikegmailcom;
	
	public signUp()
	{
		
	}
	
	public void  signUP()
	{
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 240, 240));
		frame.setBounds(100, 100, 500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	
		JLabel lblNewLabel = new JLabel("Account Name :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 216, 145, 36);
		frame.getContentPane().add(lblNewLabel);
	
		JLabel lblNewLabel_1 = new JLabel("Password :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 263, 145, 23);
		frame.getContentPane().add(lblNewLabel_1);
	
		JLabel lblNewLabel_2 = new JLabel("Confirm Password :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(10, 297, 164, 36);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_7 = new JLabel("Country :");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(10, 330, 164, 36);
		frame.getContentPane().add(lblNewLabel_7);
		
		JTextArea txtrLikeJohnSmith = new JTextArea();
		txtrLikeJohnSmith.setText("Like John Smith");
		txtrLikeJohnSmith.setBounds(188, 225, 223, 22);
		frame.getContentPane().add(txtrLikeJohnSmith);
	
		passwordField = new JPasswordField();
		passwordField.setBounds(188, 264, 145, 20);
		frame.getContentPane().add(passwordField);
	
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(188, 305, 145, 20);
		frame.getContentPane().add(passwordField_1);
		
		JTextArea country_1 = new JTextArea();
		country_1.setBounds(188,335,145,30);
		frame.getContentPane().add(country_1);
		
	
		JLabel lblNewLabel_3 = new JLabel("Sign Up Page");
		lblNewLabel_3.setBackground(Color.GRAY);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblNewLabel_3.setBounds(31, 11, 411, 60);
		frame.getContentPane().add(lblNewLabel_3);
	
		JLabel lblNewLabel_4 = new JLabel("BirthDate :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(10, 191, 125, 14);
		frame.getContentPane().add(lblNewLabel_4);
	
		JLabel lblNewLabel_5 = new JLabel("Gender:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(10, 153, 114, 23);
		frame.getContentPane().add(lblNewLabel_5);
	
		JLabel lblNewLabel_6 = new JLabel("Email Address :");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(10, 100, 164, 42);
		frame.getContentPane().add(lblNewLabel_6);
	
		txtLikegmailcom = new JTextField();
		txtLikegmailcom.setText("Like ****@gmail.com");
		txtLikegmailcom.setBounds(188, 104, 223, 41);
		frame.getContentPane().add(txtLikegmailcom);
		txtLikegmailcom.setColumns(10);
	
		final JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(2017, 1950, 2017, 1));
		spinner.setBounds(186, 178, 134, 28);
		frame.getContentPane().add(spinner);
	
	
		final JRadioButton rdbtnNewRadioButton = new JRadioButton("Yes");
		rdbtnNewRadioButton.setBounds(226, 412, 84, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
	
		final JRadioButton rdbtnNo = new JRadioButton("No");
		rdbtnNo.setBounds(226, 386, 88, 23);
		frame.getContentPane().add(rdbtnNo);
	
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected())
				{
					rdbtnNo.setSelected(false);
				}
			}
		});
	
		rdbtnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNo.isSelected())
				{
					rdbtnNewRadioButton.setSelected(false);
				}
			}
		});
	
		JLabel lblAcceptOurTerms = new JLabel("Accept terms of policy :");
		lblAcceptOurTerms.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAcceptOurTerms.setBounds(10, 369, 210, 46);
		frame.getContentPane().add(lblAcceptOurTerms);
	
		final JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Male");
		rdbtnNewRadioButton_1.setBounds(184, 149, 84, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
	
		final JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Female");
		rdbtnNewRadioButton_2.setBounds(270, 149, 84, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
	
		final JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Other");
		rdbtnNewRadioButton_3.setBounds(356, 149, 55, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
	
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtLikegmailcom.setText("Like ****@gmail.com");
				txtrLikeJohnSmith.setText("Like John Smith");
				passwordField_1.setText("");
				passwordField.setText("");
				country_1.setText("");
				rdbtnNewRadioButton_1.setSelected(false);
				rdbtnNewRadioButton_2.setSelected(false);
				rdbtnNewRadioButton_3.setSelected(false);
				rdbtnNewRadioButton.setSelected(false);
				rdbtnNo.setSelected(false);
			
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(206, 452, 98, 36);
		frame.getContentPane().add(btnNewButton_1);
	
		JButton btnNewButton_2 = new JButton("Cancel");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);;
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_2.setBounds(57, 452, 98, 36);
		frame.getContentPane().add(btnNewButton_2);
	
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_2.isSelected())
				{
					rdbtnNewRadioButton_1.setSelected(false);
					rdbtnNewRadioButton_3.setSelected(false);
				}
			}
		});
	
		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_3.isSelected())
				{
					rdbtnNewRadioButton_1.setSelected(false);
					rdbtnNewRadioButton_2.setSelected(false);
				}
			}
		});
	
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_1.isSelected())
				{
					rdbtnNewRadioButton_2.setSelected(false);
					rdbtnNewRadioButton_3.setSelected(false);
				}
			}
		});
	
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = txtrLikeJohnSmith.getText();
				String email = txtLikegmailcom.getText();
				String gender;
				if(rdbtnNewRadioButton_1.isSelected())gender = "male";
				else if(rdbtnNewRadioButton_2.isSelected()) gender = "female";
				else gender = "other";
				
				char [] password = passwordField.getPassword();
				String pass = String.valueOf(password);
				char [] password1 = passwordField_1.getPassword();
				String pass1 = String.valueOf(password1);
				if(pass1.equals(pass)) //password checking
				{
					String total = name+","+email+","+gender+","+pass;
					
					if(rdbtnNewRadioButton.isSelected() && pass != null && gender != null && name != null && email != null)//If all options are selected
					{
							try
							{
								FileWriter writer = new FileWriter("SignUpFile.txt",true);
								BufferedWriter bf = new BufferedWriter(writer);
								bf.write(total);
								bf.newLine();
								bf.close();
							}
							catch(IOException er)
							{
								er.printStackTrace();
							}
					}
					else JOptionPane.showMessageDialog(null,"Fill up every option!");
				}
				else JOptionPane.showMessageDialog(null, "Password didn't match.");
				
				Form fr = new Form();
				fr.initialize();
				frame.setVisible(false);
				
			}
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(344, 452, 98, 36);
		frame.getContentPane().add(btnNewButton);
		frame.setVisible(true);
	}	
}

