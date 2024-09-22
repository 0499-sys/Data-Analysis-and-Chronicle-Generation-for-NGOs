import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.UIManager;


public class HomePage
{
	private JFrame frame;
	private JLabel lblNewLabel,lblNewLabel_1;
	private JPanel panel,panel_1;
	private JLabel lblNgosDataAnalysis;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JTextArea txtrLoremIpsumDolor;
	private JButton btnReportGeneration;
	private JButton btnReportGeneration_1;
	private JButton btnReportGeneration_2;
	private JButton btnReportGeneration_3;
	private JButton btnReportGeneration_4;
	private JButton btnReportGeneration_5;
	SignUp su;
	//private Thread th = new Thread();

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage window = new HomePage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public HomePage() 
	{
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    frame.setSize(screenSize.width, screenSize.height);
		
		panel = new JPanel();
		frame.getContentPane().add(panel);
		Dimension scrSize = Toolkit.getDefaultToolkit().getScreenSize();
	    panel.setSize(scrSize.width, scrSize.height);
		
		btnNewButton = new JButton("Contact Us");
		btnNewButton.setBounds(1144, 59, 120, 23);
		btnNewButton.setFocusPainted(false);
		btnNewButton.addMouseListener(new MouseAdapter() 
		{
			public void mouseEntered(MouseEvent arg0) 
			{
				btnNewButton.setContentAreaFilled(true);
				btnNewButton.setBackground(Color.WHITE);
				
				btnNewButton.setForeground(Color.BLACK);
			}
			public void mouseExited(MouseEvent arg0) 
			{
				btnNewButton.setContentAreaFilled(false);
				
				btnNewButton.setForeground(Color.WHITE);
			}
		});
		panel.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(1032, 85, 286, 403);
		panel.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setVisible(false);
		
		btnReportGeneration = new JButton("Report Generation");
		btnReportGeneration.addMouseListener(new MouseAdapter() 
		{
			public void mouseEntered(MouseEvent arg0) 
			{
				btnReportGeneration.setForeground(Color.CYAN);
			}
			public void mouseExited(MouseEvent arg0) 
			{
				btnReportGeneration.setForeground(Color.BLACK);
			}
		});
		btnReportGeneration.setHorizontalAlignment(SwingConstants.LEFT);
		btnReportGeneration.setBounds(10, 50, 266, 25);
		btnReportGeneration.setForeground(Color.BLACK);
		btnReportGeneration.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReportGeneration.setFocusPainted(false);
		btnReportGeneration.setContentAreaFilled(false);
		btnReportGeneration.setBorderPainted(false);
		panel_1.add(btnReportGeneration);
		
		btnReportGeneration_1 = new JButton("Report Generation");
		btnReportGeneration_1.addMouseListener(new MouseAdapter() 
		{
			public void mouseEntered(MouseEvent arg0) 
			{
				btnReportGeneration_1.setForeground(Color.CYAN);
			}
			public void mouseExited(MouseEvent arg0) 
			{
				btnReportGeneration_1.setForeground(Color.BLACK);
			}
		});
		btnReportGeneration_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnReportGeneration_1.setForeground(Color.BLACK);
		btnReportGeneration_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReportGeneration_1.setFocusPainted(false);
		btnReportGeneration_1.setContentAreaFilled(false);
		btnReportGeneration_1.setBorderPainted(false);
		btnReportGeneration_1.setBounds(10, 11, 266, 25);
		panel_1.add(btnReportGeneration_1);
		
		btnReportGeneration_2 = new JButton("Report Generation");
		btnReportGeneration_2.addMouseListener(new MouseAdapter() 
		{
			public void mouseEntered(MouseEvent arg0) 
			{
				btnReportGeneration_2.setForeground(Color.CYAN);
			}
			public void mouseExited(MouseEvent arg0) 
			{
				btnReportGeneration_2.setForeground(Color.BLACK);
			}
		});
		btnReportGeneration_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnReportGeneration_2.setForeground(Color.BLACK);
		btnReportGeneration_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReportGeneration_2.setFocusPainted(false);
		btnReportGeneration_2.setContentAreaFilled(false);
		btnReportGeneration_2.setBorderPainted(false);
		btnReportGeneration_2.setBounds(10, 86, 266, 25);
		panel_1.add(btnReportGeneration_2);
		
		btnReportGeneration_3 = new JButton("Report Generation");
		btnReportGeneration_3.addMouseListener(new MouseAdapter() 
		{
			public void mouseEntered(MouseEvent arg0) 
			{
				btnReportGeneration_3.setForeground(Color.CYAN);
			}
			public void mouseExited(MouseEvent arg0) 
			{
				btnReportGeneration_3.setForeground(Color.BLACK);
			}
		});
		btnReportGeneration_3.setHorizontalAlignment(SwingConstants.LEFT);
		btnReportGeneration_3.setForeground(Color.BLACK);
		btnReportGeneration_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReportGeneration_3.setFocusPainted(false);
		btnReportGeneration_3.setContentAreaFilled(false);
		btnReportGeneration_3.setBorderPainted(false);
		btnReportGeneration_3.setBounds(10, 122, 266, 25);
		panel_1.add(btnReportGeneration_3);
		
		btnReportGeneration_4 = new JButton("Report Generation");
		btnReportGeneration_4.addMouseListener(new MouseAdapter() 
		{
			public void mouseEntered(MouseEvent arg0) 
			{
				btnReportGeneration_4.setForeground(Color.CYAN);
			}
			public void mouseExited(MouseEvent arg0) 
			{
				btnReportGeneration_4.setForeground(Color.BLACK);
			}
		});
		btnReportGeneration_4.setHorizontalAlignment(SwingConstants.LEFT);
		btnReportGeneration_4.setForeground(Color.BLACK);
		btnReportGeneration_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReportGeneration_4.setFocusPainted(false);
		btnReportGeneration_4.setContentAreaFilled(false);
		btnReportGeneration_4.setBorderPainted(false);
		btnReportGeneration_4.setBounds(10, 158, 266, 25);
		panel_1.add(btnReportGeneration_4);
		
		btnReportGeneration_5 = new JButton("Report Generation");
		btnReportGeneration_5.addMouseListener(new MouseAdapter() 
		{
			public void mouseEntered(MouseEvent arg0) 
			{
				btnReportGeneration_5.setForeground(Color.CYAN);
			}
			public void mouseExited(MouseEvent arg0) 
			{
				btnReportGeneration_5.setForeground(Color.BLACK);
			}
		});
		btnReportGeneration_5.setHorizontalAlignment(SwingConstants.LEFT);
		btnReportGeneration_5.setForeground(Color.BLACK);
		btnReportGeneration_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReportGeneration_5.setFocusPainted(false);
		btnReportGeneration_5.setContentAreaFilled(false);
		btnReportGeneration_5.setBorderPainted(false);
		btnReportGeneration_5.setBounds(10, 194, 266, 25);
		panel_1.add(btnReportGeneration_5);
		
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setToolTipText("");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(btnNewButton);
		//btnNewButton.setOpaque(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		
		btnNewButton_1 = new JButton("Sign Up");
		btnNewButton_1.setBounds(1024, 59, 120, 23);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				su = new SignUp();
				su.setVisible(true);
				
				frame.setVisible(false);
				
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() 
		{
			public void mouseEntered(MouseEvent arg0) 
			{
				btnNewButton_1.setContentAreaFilled(true);
				btnNewButton_1.setBackground(Color.WHITE);
				
				btnNewButton_1.setForeground(Color.BLACK);
			}
			public void mouseExited(MouseEvent arg0) 
			{
				btnNewButton_1.setContentAreaFilled(false);
				
				btnNewButton_1.setForeground(Color.WHITE);
			}
		});
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) 
				{
					panel_1.setVisible(true);
				}
			});
		lblNewLabel_1.setBounds(1285, 59, 50, 23);
		panel.add(lblNewLabel_1);
		Image imgage =new ImageIcon(this.getClass().getResource("/menu copy.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(imgage));
		lblNewLabel_1.setToolTipText("Menu");
		
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(btnNewButton_1);
		//btnNewButton_1.setOpaque(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		
		btnNewButton_3 = new JButton("About Us");
		btnNewButton_3.setBounds(784, 59, 120, 23);
		btnNewButton_3.setFocusPainted(false);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.addMouseListener(new MouseAdapter() 
		{
			public void mouseEntered(MouseEvent arg0) 
			{
				btnNewButton_3.setContentAreaFilled(true);
				btnNewButton_3.setBackground(Color.WHITE);
				
				btnNewButton_3.setForeground(Color.BLACK);
			}
			public void mouseExited(MouseEvent arg0) 
			{
				btnNewButton_3.setContentAreaFilled(false);
				
				btnNewButton_3.setForeground(Color.WHITE);
			}
		});
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(btnNewButton_3);
		//btnNewButton_3.setOpaque(false);
		btnNewButton_3.setContentAreaFilled(false);
		
		btnNewButton_2 = new JButton("Login");
		btnNewButton_2.setBounds(904, 59, 120, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				frame=new JFrame();
				LogIn1 window = new LogIn1();
				window.frame.setVisible(true);
				
			
				
			}
		});
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.addMouseListener(new MouseAdapter() 
		{
			public void mouseEntered(MouseEvent arg0) 
			{
				btnNewButton_2.setContentAreaFilled(true);
				btnNewButton_2.setBackground(Color.WHITE);
				
				btnNewButton_2.setForeground(Color.BLACK);
			}
			public void mouseExited(MouseEvent arg0) 
			{
				btnNewButton_2.setContentAreaFilled(false);
				
				btnNewButton_2.setForeground(Color.WHITE);
			}
		});
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(btnNewButton_2);
		//btnNewButton_2.setOpaque(false);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		
		lblNgosDataAnalysis = new JLabel("NGOs Data Analysis");
		lblNgosDataAnalysis.setBounds(250, 44, 835, 55);
		lblNgosDataAnalysis.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0)
			{
				lblNgosDataAnalysis.setForeground(Color.WHITE);
				lblNgosDataAnalysis.setBounds(270, 150, 835, 55);
				
				try
				{
					txtrLoremIpsumDolor.setBounds(321, 250, 693, 375);
					txtrLoremIpsumDolor.setVisible(true);
				}
				catch(Exception e)
				{
					System.out.println("\n"+e.getMessage());
				}
			}

			public void mousePressed(MouseEvent arg0) 
			{
				lblNgosDataAnalysis.setForeground(Color.RED);
			}
		});
		lblNgosDataAnalysis.setFont(new Font("Biko", Font.BOLD, 40));
		lblNgosDataAnalysis.setForeground(new Color(255, 255, 255));
		panel.add(lblNgosDataAnalysis);
		
		txtrLoremIpsumDolor = new JTextArea();
		txtrLoremIpsumDolor.setBounds(0, 0, 0, 0);
		txtrLoremIpsumDolor.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		txtrLoremIpsumDolor.setForeground(Color.WHITE);
		txtrLoremIpsumDolor.setText("Lorem ipsum dolor sit amet, consectetuer adipiscing elit is simply dummy text of the\r\nprinting and typesetting industry. Lorem ipsum dolor sit amet, consectetuer adipiscing \r\nis simply dummy text of the printing and typesetting industry ever since the 1500s. \r\nLorem ipsum dolor sit amet, consectetuer adipiscing is simply dummy text of the \r\nprinting and typesetting industry ever since the 1500s.\r\nLorem ipsum dolor sit amet, consectetuer adipiscing elit is simply dummy text of the\r\nprinting and typesetting industry. Lorem ipsum dolor sit amet, consectetuer adipiscing \r\nis simply dummy text of the printing and typesetting industry ever since the 1500s. \r\nLorem ipsum dolor sit amet, consectetuer adipiscing is simply dummy text of the \r\nprinting and typesetting industry ever since the 1500s.\r\nLorem ipsum dolor sit amet, consectetuer adipiscing elit is simply dummy text of the\r\nprinting and typesetting industry. Lorem ipsum dolor sit amet, consectetuer adipiscing \r\nis simply dummy text of the printing and typesetting industry ever since the 1500s. \r\nLorem ipsum dolor sit amet, consectetuer adipiscing is simply dummy text of the \r\nprinting and typesetting industry ever since the 1500s.");
		txtrLoremIpsumDolor.setOpaque(false);
		panel.add(txtrLoremIpsumDolor);
		txtrLoremIpsumDolor.setVisible(false);
	
		lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setBounds(0, 0, 1366, 768);
		panel.add(lblNewLabel);
		Image img =new ImageIcon(this.getClass().getResource("/93189.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		Dimension screenSz = Toolkit.getDefaultToolkit().getScreenSize();
	}

	public void setVisible(boolean b) 
	{	
	}
}
