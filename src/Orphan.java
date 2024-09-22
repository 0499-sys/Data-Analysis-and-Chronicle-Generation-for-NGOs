import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Component;
import javax.swing.JTextPane;


public class Orphan extends LogIn1 implements ActionListener {

	JFrame frame;
	private JLabel lblChildren;
	private JLabel label;
	private JLabel lblNewLabel;
	private JPanel panel_2;
	private JButton btnNewButton,btnViewSuggestion,btnViewFinancialAid;
	private JButton btnViewVolunteeringApplication,btnReportGeneration;
    public static String s1;
    private JTextField txtAlthoughFoodWater;
    private JTextField txtDownInTheir;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Orphan w = new Orphan();
					w.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Orphan() {
		
		initialize();
		
}
	private void initialize() {
		
		System.out.println("\n..."+reg);
		System.out.println("\n..."+db);
		frame = new JFrame();
		frame.setBounds(0,0, 1370,850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblChildren = new JLabel("ORPHANAGE");
		lblChildren.setForeground(Color.WHITE);
		lblChildren.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblChildren.setBounds(532, 35, 306, 25);
		frame.getContentPane().add(lblChildren);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBounds(0, 94, 299, 655);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				panel_2.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent arg0) 
			{
				label.setFocusable(true);
			}
			@Override
			public void mouseExited(MouseEvent arg0) 
			{
				label.setFocusable(false);
			}
		});
		label.setBounds(124, 33, 50, 50);
		panel.add(label);
		Image img =new ImageIcon(this.getClass().getResource("/menuop copy.png")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setToolTipText("Menu");
		
		panel_2 = new JPanel();
		panel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_2.setOpaque(false);
		panel_2.setBounds(12, 81, 313, 561);
		panel.add(panel_2);
		panel_2.setVisible(false);
		panel_2.setLayout(null);
		
		btnNewButton = new JButton("Insert Data");
		btnNewButton.setBounds(12, 53, 247, 23);
		panel_2.add(btnNewButton);
		btnNewButton.setFocusPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				s1="i";
				OForm window=new OForm(s1);
				window.frame_1.setVisible(true);
			}
		});
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
		
		
		
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		//btnNewButton_2.setOpaque(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		
		btnReportGeneration = new JButton("Report Generation");
		
		btnReportGeneration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				
			}
		});
		btnReportGeneration.setBounds(27, 144, 247, 23);
		btnReportGeneration.setForeground(Color.WHITE);
		btnReportGeneration.addMouseListener(new MouseAdapter() 
		{
			public void mouseEntered(MouseEvent arg0) 
			{
				btnReportGeneration.setContentAreaFilled(true);
				btnReportGeneration.setBackground(Color.WHITE);
				
				btnReportGeneration.setForeground(Color.BLACK);
			}
			public void mouseExited(MouseEvent arg0) 
			{
				btnReportGeneration.setContentAreaFilled(false);
				
				btnReportGeneration.setForeground(Color.WHITE);
			}
		});
		btnReportGeneration.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReportGeneration.setFocusPainted(false);
		btnReportGeneration.setContentAreaFilled(false);
		btnReportGeneration.setBorderPainted(false);
		panel_2.add(btnReportGeneration);
		
		btnViewFinancialAid = new JButton("View Financial Aid");
		btnViewFinancialAid.setBounds(27, 192, 247, 23);
		btnViewFinancialAid.setForeground(Color.WHITE);
		btnViewFinancialAid.addMouseListener(new MouseAdapter() 
		{
			public void mouseEntered(MouseEvent arg0) 
			{
				btnViewFinancialAid.setContentAreaFilled(true);
				btnViewFinancialAid.setBackground(Color.WHITE);
				
				btnViewFinancialAid.setForeground(Color.BLACK);
			}
			public void mouseExited(MouseEvent arg0) 
			{
				btnViewFinancialAid.setContentAreaFilled(false);
				
				btnViewFinancialAid.setForeground(Color.WHITE);
			}
		});
		btnViewFinancialAid.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnViewFinancialAid.setFocusPainted(false);
		btnViewFinancialAid.setContentAreaFilled(false);
		btnViewFinancialAid.setBorderPainted(false);
		panel_2.add(btnViewFinancialAid);
		
		btnViewSuggestion = new JButton("View Suggestion");
		btnViewSuggestion.setBounds(27, 242, 247, 23);
		btnViewSuggestion.setForeground(Color.WHITE);
		btnViewSuggestion.addMouseListener(new MouseAdapter() 
		{
			public void mouseEntered(MouseEvent arg0) 
			{
				btnViewSuggestion.setContentAreaFilled(true);
				btnViewSuggestion.setBackground(Color.WHITE);
				
				btnViewSuggestion.setForeground(Color.BLACK);
			}
			public void mouseExited(MouseEvent arg0) 
			{
				btnViewSuggestion.setContentAreaFilled(false);
				
				btnViewSuggestion.setForeground(Color.WHITE);
			}
		});
		btnViewSuggestion.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnViewSuggestion.setFocusPainted(false);
		btnViewSuggestion.setContentAreaFilled(false);
		btnViewSuggestion.setBorderPainted(false);
		panel_2.add(btnViewSuggestion);
		
		btnViewVolunteeringApplication = new JButton("View Volunteering Application");
		btnViewVolunteeringApplication.setBounds(27, 290, 247, 23);
		btnViewVolunteeringApplication.setForeground(Color.WHITE);
		btnViewVolunteeringApplication.addMouseListener(new MouseAdapter() 
		{
			public void mouseEntered(MouseEvent arg0) 
			{
				btnViewVolunteeringApplication.setContentAreaFilled(true);
				btnViewVolunteeringApplication.setBackground(Color.WHITE);
				
				btnViewVolunteeringApplication.setForeground(Color.BLACK);
			}
			public void mouseExited(MouseEvent arg0) 
			{
				btnViewVolunteeringApplication.setContentAreaFilled(false);
				
				btnViewVolunteeringApplication.setForeground(Color.WHITE);
			}
		});
		btnViewVolunteeringApplication.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnViewVolunteeringApplication.setFocusPainted(false);
		btnViewVolunteeringApplication.setContentAreaFilled(false);
		btnViewVolunteeringApplication.setBorderPainted(false);
		panel_2.add(btnViewVolunteeringApplication);
		
		JButton btnNewButton_1 = new JButton(" Update Data");
		btnNewButton_1.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
			s1="u";
			 UpdateO window = new UpdateO(s1);
			 window.frame_1.setVisible(true);
		}
		});
				
				
						
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setDefaultCapable(false);
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(240, 240, 240));
		btnNewButton_1.setBounds(61, 89, 148, 42);
		panel_2.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBounds(296, 94, 1056, 655);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\"HANDS FOR HUMANITY\"");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(0, 0, 1056, 69);
		panel_1.add(lblNewLabel_1);
		
		JTextPane txtpnperhapsThereAre = new JTextPane();
		txtpnperhapsThereAre.setBorder(null);
		txtpnperhapsThereAre.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtpnperhapsThereAre.setText("\u201CPerhaps there are those who are able to go about their lives unfettered by such concerns. But for those like us, our fate is to face the world as orphans, chasing through long years the shadows of vanished parents. There is nothing for it but to try and see through our missions to the end, as best we can, for until we do so, we will be permitted no calm.\u201D");
		txtpnperhapsThereAre.setForeground(Color.WHITE);
		txtpnperhapsThereAre.setOpaque(false);
		txtpnperhapsThereAre.setBounds(67, 82, 938, 458);
		panel_1.add(txtpnperhapsThereAre);
		
		txtAlthoughFoodWater = new JTextField();
		txtAlthoughFoodWater.setBorder(null);
		txtAlthoughFoodWater.setHorizontalAlignment(SwingConstants.LEFT);
		txtAlthoughFoodWater.setText("Although food, water and shelter are essential for life, what many children want most is the love of a family. ");
		txtAlthoughFoodWater.setOpaque(false);
		txtAlthoughFoodWater.setForeground(Color.WHITE);
		txtAlthoughFoodWater.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtAlthoughFoodWater.setBounds(67, 177, 938, 39);
		panel_1.add(txtAlthoughFoodWater);
		txtAlthoughFoodWater.setColumns(10);
		
		txtDownInTheir = new JTextField();
		txtDownInTheir.setText("\r\nDown in their hearts, wise men know this truth: the only way to help yourself is to help others. ~Elbert Hubbard");
		txtDownInTheir.setOpaque(false);
		txtDownInTheir.setHorizontalAlignment(SwingConstants.LEFT);
		txtDownInTheir.setForeground(Color.WHITE);
		txtDownInTheir.setFont(new Font("Tahoma", Font.ITALIC, 17));
		txtDownInTheir.setColumns(10);
		txtDownInTheir.setBorder(null);
		txtDownInTheir.setBounds(67, 240, 938, 39);
		panel_1.add(txtDownInTheir);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 1370, 850);
		frame.getContentPane().add(lblNewLabel);
		Image imag =new ImageIcon(this.getClass().getResource("/Untitled-1.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(imag));
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
		}

