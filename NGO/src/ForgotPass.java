import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;


public class ForgotPass {

	private JFrame frame;
	private JLabel lblNewLabel,lblLogin;
	private JPanel panel;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgotPass window = new ForgotPass();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ForgotPass() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1370, 750);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 1370, 750);
		frame.getContentPane().add(panel);
		
		lblLogin = new JLabel("FORGOT PASSWORD");
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setFont(new Font("Century Gothic", Font.BOLD, 40));
		lblLogin.setBounds(480, 61, 424, 44);
		panel.add(lblLogin);
		
		JButton btnLogin_2 = new JButton("Verify Email");
		btnLogin_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String em;
				String tf = textField_1.getText();
				
				try
				{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/projectdb","root","");
				
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from signup where email='"+tf+"' ");
				
				while(rs.next())
				{
					em=rs.getString(6);
					
					if(tf.equals(em))
					{
						SendMail sm=new SendMail();
					}
				}
				}
				
				catch(Exception e)
				{
					JFrame frame=new JFrame();
					JOptionPane.showMessageDialog(frame,"Please Enter Valid Email id");
				}
			}
		});
		btnLogin_2.setForeground(Color.BLACK);
		btnLogin_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLogin_2.setFocusPainted(false);
		btnLogin_2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnLogin_2.setBackground(Color.WHITE);
		btnLogin_2.setBounds(550, 355, 192, 30);
		panel.add(btnLogin_2);
		
		lblNewLabel_1 = new JLabel("Email id :");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(414, 229, 197, 22);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.WHITE);
		textField_1.setCaretColor(Color.WHITE);
		textField_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
		textField_1.setOpaque(false);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(664, 233, 240, 20);
		panel.add(textField_1);
		
		lblNewLabel = new JLabel("");
		panel.add(lblNewLabel);
		Image img =new ImageIcon(this.getClass().getResource("/93189.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		Dimension screenSz = Toolkit.getDefaultToolkit().getScreenSize();
	    lblNewLabel.setSize(screenSz.width, screenSz.height);
	}

	public void setVisible(boolean b) 
	{
	}
}
