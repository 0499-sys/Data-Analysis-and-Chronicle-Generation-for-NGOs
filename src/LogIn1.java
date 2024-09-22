import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JPasswordField;


public class LogIn1 extends SignUp{

	JFrame frame;
	private JPanel panel;
	private JLabel lblLogin;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField textField;
	private JButton btnLogin_1;
	private JButton btnLogin_2,btnLogin;
	private JPasswordField passwordField;
	public JComboBox comboBox;
	public static String reg;
	public static String db;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn1 window = new LogIn1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LogIn1() {
		initialize();
	}

	private void initialize() {

		System.out.println("\n..."+db);
		frame = new JFrame();
		frame.setBounds(0, 0, 1370, 850);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setLayout(null);
		frame.getContentPane().add(panel);
		panel.setBounds(0, 0, 1370, 850);
		
		lblNewLabel_1 = new JLabel("EMAIL ID  :  ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(444, 211, 133, 22);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setForeground(Color.WHITE);
		textField.setOpaque(false);
		textField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(650, 215, 218, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordField.setForeground(Color.WHITE);
		passwordField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
		passwordField.setOpaque(false);
		passwordField.setBounds(650, 291, 218, 24);
		panel.add(passwordField);
		
		btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) 
		{
		  
			
			String emailid,paswrd,ty;
			String emaill=textField.getText();
	
			//String ngotype=(String)comboBox.getSelectedItem();
			String psw=new String(passwordField.getPassword());
			
			try
			{	
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
						
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("SELECT *\r\n" + "FROM `table 3`\r\n" + 
						"WHERE `psw` = '"+psw+"' ");
				
				while(rs.next())
				{
					emailid=rs.getString(6);
					paswrd=rs.getString(7);
					//ty=rs.getString(2);
					
					
					if(emailid.equals(emaill) && paswrd.equals(psw))
					{
						
						  reg=rs.getString(4);
						  db=rs.getString(1);
						 // System.out.println("\n reg "+reg);
						  frame=new JFrame();
						  Orphan w1 = new Orphan();
						  w1.frame.setVisible(true);
						
						//if(ty.equals(ngotype)) {
						
					//}
				}
					
					else {
						JOptionPane.showMessageDialog(frame,"PLEASE ENTER VALID DETAILS");
					}
				}
				System.out.println("\n reg "+reg);
				textField.setText("");
				passwordField.setText("");
						
			}
			
			catch(Exception e)
			{
				System.out.println("\nSIGNUP ERROR: "+e.getMessage());
			}
		}
		});
	
		
	
		btnLogin.setFocusPainted(false);
		btnLogin.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setBounds(491, 407, 125, 23);
		panel.add(btnLogin);
		btnLogin.setBackground(Color.white);
		
		btnLogin_2 = new JButton("FORGOT PASSWORD");
		btnLogin_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				ForgotPass fp = new ForgotPass();
				fp.setVisible(true);
				
				frame.setVisible(false);
			}
		});
		btnLogin_2.setForeground(Color.BLACK);
		btnLogin_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLogin_2.setFocusPainted(false);
		btnLogin_2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnLogin_2.setBackground(Color.WHITE);
		btnLogin_2.setBounds(562, 501, 192, 23);
		panel.add(btnLogin_2);
		
		btnLogin_1 = new JButton("BACK");
		btnLogin_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				HomePage hp=new HomePage();
				hp.setVisible(true);
				
				frame.setVisible(false);
			}
		});
		btnLogin_1.setForeground(Color.BLACK);
		btnLogin_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLogin_1.setFocusPainted(false);
		btnLogin_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnLogin_1.setBackground(Color.WHITE);
		btnLogin_1.setBounds(692, 407, 125, 23);
		panel.add(btnLogin_1);
		
		lblNewLabel_2 = new JLabel("PASSWORD  :  ");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(444, 291, 133, 22);
		panel.add(lblNewLabel_2);
		
		lblLogin = new JLabel("LOGIN");
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setFont(new Font("Century Gothic", Font.BOLD, 40));
		lblLogin.setBounds(593, 68, 192, 44);
		panel.add(lblLogin);
		Image img =new ImageIcon(this.getClass().getResource("/93189.jpg")).getImage();
		Dimension screenSz = Toolkit.getDefaultToolkit().getScreenSize();
	    
	    lblNewLabel = new JLabel("");
	    //lblNewLabel.setBounds(174, 52, 46, 14);
	    panel.add(lblNewLabel);
	    lblNewLabel.setIcon(new ImageIcon(img));
	    lblNewLabel.setSize(screenSz.width, screenSz.height);
		
	}

	public void setVisible(boolean b) 
	{
				
	}
}
