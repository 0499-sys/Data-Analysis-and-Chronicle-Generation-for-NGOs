import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.Image;


public class ViewApp {

	private JFrame frame;
	private JLabel lblNewLabel,lblChildren;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewApp window = new ViewApp();
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
	public ViewApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1370, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblChildren = new JLabel("Children");
		lblChildren.setForeground(Color.WHITE);
		lblChildren.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblChildren.setBounds(588, 35, 250, 25);
		frame.getContentPane().add(lblChildren);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 1370, 850);
		frame.getContentPane().add(lblNewLabel);
		Image imag =new ImageIcon(this.getClass().getResource("/Untitled-1.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(imag));
	}
}
