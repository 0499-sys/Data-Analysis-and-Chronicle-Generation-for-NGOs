import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;


public class Orphan {

	private JFrame frame;
	private JLabel lblChildren;
	private JLabel label;
	private JLabel lblNewLabel;
	private JPanel panel_2;
	private JButton btnNewButton,btnViewSuggestion,btnViewFinancialAid;
	private JButton btnViewVolunteeringApplication,btnReportGeneration;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Orphan window = new Orphan();
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
	public Orphan() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0,0, 1370,850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblChildren = new JLabel("Children");
		lblChildren.setForeground(Color.WHITE);
		lblChildren.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblChildren.setBounds(588, 35, 250, 25);
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
		panel_2.setOpaque(false);
		panel_2.setBounds(0, 94, 313, 561);
		panel.add(panel_2);
		panel_2.setVisible(false);
		panel_2.setLayout(null);
		
		btnNewButton = new JButton("Insert/Update Data");
		btnNewButton.setBounds(27, 40, 247, 23);
		panel_2.add(btnNewButton);
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
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		//btnNewButton_2.setOpaque(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		
		btnReportGeneration = new JButton("Report Generation");
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
		btnReportGeneration.setBounds(30, 103, 247, 23);
		panel_2.add(btnReportGeneration);
		
		btnViewFinancialAid = new JButton("View Financial Aid");
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
		btnViewFinancialAid.setBounds(30, 166, 247, 23);
		panel_2.add(btnViewFinancialAid);
		
		btnViewSuggestion = new JButton("View Suggestion");
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
		btnViewSuggestion.setBounds(30, 229, 247, 23);
		panel_2.add(btnViewSuggestion);
		
		btnViewVolunteeringApplication = new JButton("View Volunteering Application");
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
		btnViewVolunteeringApplication.setBounds(30, 292, 247, 23);
		panel_2.add(btnViewVolunteeringApplication);
		
		JButton btnNewButton_5 = new JButton("Insert/Update Data");
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_5.setFocusPainted(false);
		btnNewButton_5.setContentAreaFilled(false);
		btnNewButton_5.setBorderPainted(false);
		btnNewButton_5.setBounds(30, 355, 247, 23);
		panel_2.add(btnNewButton_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBounds(296, 94, 1056, 655);
		frame.getContentPane().add(panel_1);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 1370, 850);
		frame.getContentPane().add(lblNewLabel);
		Image imag =new ImageIcon(this.getClass().getResource("/Untitled-1.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(imag));
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}