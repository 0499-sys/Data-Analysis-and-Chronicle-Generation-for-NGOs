import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JPasswordField;


public class SignUp {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblSecurityQuestion;
	private JLabel lblPassword;
	private JButton btnRegister;
	private JTextField textField_4;
	private JLabel lblEmailId;
	private JLabel lblConfirmPassword;
	private JLabel lblConfirmPassword_1;
	private JButton btnBack;
	private JLabel lblLocation;
	private JLabel lblContactNo;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JComboBox comboBox;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp window = new SignUp();
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
	public SignUp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0,0, 1370,750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		Image img =new ImageIcon(this.getClass().getResource("/93189.jpg")).getImage();
		
		JLabel lblSignUp = new JLabel("Sign up");
		lblSignUp.setForeground(Color.WHITE);
		lblSignUp.setFont(new Font("Century Gothic", Font.BOLD, 40));
		lblSignUp.setBounds(587, 21, 300, 166);
		frame.getContentPane().add(lblSignUp);
		
		JLabel lblName = new JLabel("Name of NGO:");
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblName.setBounds(90, 170, 169, 41);
		frame.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setOpaque(false);
		textField.setForeground(Color.WHITE);
		textField.setCaretColor(Color.WHITE);
		textField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
		textField.setBounds(265, 185, 291, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblTypeOfNgo = new JLabel("Type of NGO:");
		lblTypeOfNgo.setForeground(Color.WHITE);
		lblTypeOfNgo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTypeOfNgo.setBounds(90, 237, 131, 41);
		frame.getContentPane().add(lblTypeOfNgo);
	
		String ngolist[]={"ANIMAL AID","ORPHANAGE","OLD AGE"};
		comboBox = new JComboBox(ngolist);
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(265, 242, 291, 26);
		frame.getContentPane().add(comboBox);
		
		lblLocation = new JLabel("Location:");
		lblLocation.setForeground(Color.WHITE);
		lblLocation.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLocation.setBounds(94, 289, 116, 41);
		frame.getContentPane().add(lblLocation);
			
			textField_1 = new JTextField();
			textField_1.setOpaque(false);
			textField_1.setForeground(Color.WHITE);
			textField_1.setColumns(10);
			textField_1.setCaretColor(Color.WHITE);
			textField_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
			textField_1.setBounds(265, 300, 291, 20);
			frame.getContentPane().add(textField_1);
				
				lblContactNo = new JLabel("Contact No:");
				lblContactNo.setForeground(Color.WHITE);
				lblContactNo.setFont(new Font("Tahoma", Font.PLAIN, 20));
				lblContactNo.setBounds(681, 170, 143, 31);
				frame.getContentPane().add(lblContactNo);
					
					textField_2 = new JTextField();
					textField_2.setOpaque(false);
					textField_2.setForeground(Color.WHITE);
					textField_2.setColumns(10);
					textField_2.setCaretColor(Color.WHITE);
					textField_2.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
					textField_2.setBounds(820, 185, 291, 20);
					frame.getContentPane().add(textField_2);
					
					lblEmailId = new JLabel("Email id:");
					lblEmailId.setForeground(Color.WHITE);
					lblEmailId.setFont(new Font("Tahoma", Font.PLAIN, 20));
					lblEmailId.setBounds(681, 237, 143, 31);
					frame.getContentPane().add(lblEmailId);
					
					textField_3 = new JTextField();
					textField_3.setOpaque(false);
					textField_3.setForeground(Color.WHITE);
					textField_3.setColumns(10);
					textField_3.setCaretColor(Color.WHITE);
					textField_3.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
					textField_3.setBounds(820, 248, 291, 20);
					frame.getContentPane().add(textField_3);
					
					lblSecurityQuestion = new JLabel("NGO Reg No.");
					lblSecurityQuestion.setForeground(Color.WHITE);
					lblSecurityQuestion.setFont(new Font("Tahoma", Font.PLAIN, 20));
					lblSecurityQuestion.setBounds(94, 351, 165, 41);
					frame.getContentPane().add(lblSecurityQuestion);
					
					lblPassword = new JLabel("Password:");
					lblPassword.setForeground(Color.WHITE);
					lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
					lblPassword.setBounds(681, 294, 143, 31);
					frame.getContentPane().add(lblPassword);
					
					lblConfirmPassword = new JLabel("Confirm");
					lblConfirmPassword.setForeground(Color.WHITE);
					lblConfirmPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
					lblConfirmPassword.setBounds(681, 351, 169, 31);
					frame.getContentPane().add(lblConfirmPassword);
								
								lblConfirmPassword_1 = new JLabel("Password:");
								lblConfirmPassword_1.setForeground(Color.WHITE);
								lblConfirmPassword_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
								lblConfirmPassword_1.setBounds(681, 377, 169, 31);
								frame.getContentPane().add(lblConfirmPassword_1);
									
									btnBack = new JButton("Register");
									btnBack.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent arg0) 
										{
											String na,l,reg,mail,ty,psw,cpsw,conn;
											
											try
											{
												na=textField.getText();
												l=textField_1.getText();
												reg=textField_4.getText();
												conn=textField_2.getText();
												mail=textField_3.getText();
												ty=comboBox.getSelectedItem().toString();
												psw=new String(passwordField.getPassword());
												cpsw=new String(passwordField_1.getPassword());
												
												if(psw.equals(cpsw))
												{
													if(conn.length()==10)
													{
								
														Class.forName("com.mysql.jdbc.Driver");
														Connection con=DriverManager.getConnection("jdbc:mysql://localhost/projectdb","root","");
																
														Statement st=con.createStatement();
														st.executeUpdate("insert into signup values('"+na+"','"+ty+"','"+l+"','"+reg+"','"+conn+"','"+mail+"','"+psw+"','"+cpsw+"')");
																
														textField_2.setText("");
														textField_3.setText("");
														textField_1.setText("");
														textField.setText("");
														textField_4.setText("");
														passwordField_1.setText("");
														passwordField.setText("");
														
														JFrame frame=new JFrame();
														JOptionPane.showMessageDialog(frame,"REGISTERED SUCCESSFULLY");
														
														HomePage hp=new HomePage();
														hp.setVisible(true);
														
														frame.setVisible(false);
														
													}
														else
														{
															JFrame frame=new JFrame();
															JOptionPane.showMessageDialog(frame,"INVALID CONTACT NUMBER");
														}
												}
												
												
												else 
												{
													JFrame frame=new JFrame();
													JOptionPane.showMessageDialog(frame,"INCORRECT PASSWORD");
													
													passwordField_1.setText("");
												}
														
											}
											
											catch(Exception e)
											{
												System.out.println("\nSIGNUP ERROR: "+e.getMessage());
											}
										}
									});
									btnBack.setBackground(Color.WHITE);
									btnBack.setForeground(Color.DARK_GRAY);
									btnBack.setFont(new Font("Tahoma", Font.BOLD, 15));
									btnBack.setBounds(519, 514, 131, 31);
									frame.getContentPane().add(btnBack);
									
									btnRegister = new JButton("Back");
									btnRegister.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent arg0) 
										{
											HomePage hp = new HomePage();
											hp.setVisible(true);
											
											frame.setVisible(false);
										}
									});
									btnRegister.setBackground(Color.WHITE);
									btnRegister.setForeground(Color.DARK_GRAY);
									btnRegister.setFont(new Font("Tahoma", Font.BOLD, 15));
									btnRegister.setBounds(681, 514, 131, 31);
									frame.getContentPane().add(btnRegister);
										
										textField_4 = new JTextField();
										textField_4.setOpaque(false);
										textField_4.setForeground(Color.WHITE);
										textField_4.setColumns(10);
										textField_4.setCaretColor(Color.WHITE);
										textField_4.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
										textField_4.setBounds(265, 365, 291, 20);
										frame.getContentPane().add(textField_4);
											
											passwordField_1 = new JPasswordField();
											passwordField_1.setOpaque(false);
											passwordField_1.setForeground(Color.WHITE);
											passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
											passwordField_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
											passwordField_1.setBounds(820, 387, 291, 20);
											frame.getContentPane().add(passwordField_1);
											
											passwordField = new JPasswordField();
											passwordField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
											passwordField.setOpaque(false);
											passwordField.setFont(new Font("Tahoma", Font.PLAIN, 11));
											passwordField.setForeground(Color.WHITE);
											passwordField.setBounds(820, 303, 291, 20);
											frame.getContentPane().add(passwordField);
										
											
											
											JLabel imglabel = new JLabel();
											imglabel.setForeground(Color.WHITE);
											imglabel.setBackground(Color.WHITE);
											imglabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
											imglabel.setBounds(0,0,1370,750);
											frame.getContentPane().add(imglabel);
											imglabel.setIcon(new ImageIcon(img));
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}