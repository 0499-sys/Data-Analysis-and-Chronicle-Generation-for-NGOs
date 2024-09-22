import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JComboBox;

public class OForm1 {

	private JFrame frame;
	private JFrame frame_1;
	public JButton btnGenerate_1;
	public JButton btnGenerate_2;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JLabel year;
	public JSpinner spinner,spinner_1,spinner_1_2,spinner_1_3,spinner_1_1,spinner_1_2_1,spinner_1_3_1,spinner_1_1_1,spinner_1_2_3,spinner_1_3_2,
	spinner_1_2_2_1,spinner_1_2_2_1_2,spinner_1_2_2_1_2_1;
	public JRadioButton rdbtnYes,rdbtnYes_2,rdbtnYes_2_1,rdbtnYes_2_1_1;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OForm1 window = new OForm1();
					window.frame_1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OForm1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
	    frame_1 = new JFrame();
		frame_1.getContentPane().setForeground(Color.WHITE);
		frame_1.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 20));
		frame_1.getContentPane().setBackground(Color.DARK_GRAY);
		frame_1.setBounds(0, 0, 1370, 850);
		frame_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame_1.getContentPane().setLayout(null);
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1284, 39);
		panel.setBackground(Color.DARK_GRAY);
		frame_1.getContentPane().add(panel);

		JTextArea txtrOrphanagePage = new JTextArea();
		txtrOrphanagePage.setForeground(Color.WHITE);
		txtrOrphanagePage.setBackground(Color.DARK_GRAY);
		txtrOrphanagePage.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtrOrphanagePage.setText("ORPHANAGE FORM");
		panel.add(txtrOrphanagePage);

		JLabel lblName = new JLabel("NAME:");
		lblName.setBounds(12, 82, 114, 28);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblName.setForeground(Color.WHITE);
		frame_1.getContentPane().add(lblName);

		textField = new JTextField();
		textField.setBounds(12, 109, 550, 20);
		textField.setCaretColor(Color.WHITE);
		textField.setBackground(Color.DARK_GRAY);
		textField.setForeground(Color.WHITE);
		textField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
		frame_1.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblLocation = new JLabel("LOCATION:");
		lblLocation.setBounds(12, 142, 102, 14);
		lblLocation.setForeground(Color.WHITE);
		lblLocation.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame_1.getContentPane().add(lblLocation);

		textField_1 = new JTextField();
		textField_1.setBounds(10, 158, 550, 20);
		textField_1.setBackground(Color.DARK_GRAY);
		textField_1.setForeground(Color.white);
		textField_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
		frame_1.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel = new JLabel("TOTAL NUMBER OF CHILDREN:");
		lblNewLabel.setBounds(10, 197, 208, 20);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setForeground(Color.WHITE);
		frame_1.getContentPane().add(lblNewLabel);

		JSpinner spinner = new JSpinner();
		spinner.setBounds(228, 195, 42, 28);
		frame_1.getContentPane().add(spinner);

		JLabel label = new JLabel("");
		label.setBounds(10, 267, 46, 14);
		frame_1.getContentPane().add(label);

		JLabel label_1 = new JLabel("");
		label_1.setBounds(10, 267, 46, 14);
		frame_1.getContentPane().add(label_1);

		JLabel lblNumberOfDestitutes = new JLabel("NUMBER OF DESTITUTES:");
		lblNumberOfDestitutes.setBounds(10, 267, 167, 14);
		lblNumberOfDestitutes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNumberOfDestitutes.setForeground(Color.WHITE);
		lblNumberOfDestitutes.setBackground(Color.DARK_GRAY);
		frame_1.getContentPane().add(lblNumberOfDestitutes);

		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(228, 262, 42, 28);
		frame_1.getContentPane().add(spinner_1);

		JLabel lblNumberOfOrphans = new JLabel("NUMBER OF ORPHANS:");
		lblNumberOfOrphans.setBounds(10, 412, 153, 14);
		lblNumberOfOrphans.setForeground(Color.WHITE);
		lblNumberOfOrphans.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNumberOfOrphans.setBackground(Color.DARK_GRAY);
		frame_1.getContentPane().add(lblNumberOfOrphans);

		JSpinner spinner_1_1 = new JSpinner();
		spinner_1_1.setBounds(228, 407, 42, 28);
		frame_1.getContentPane().add(spinner_1_1);

		JLabel lblNewLabel_1 = new JLabel("Girls");
		lblNewLabel_1.setBounds(53, 462, 46, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setForeground(Color.WHITE);
		frame_1.getContentPane().add(lblNewLabel_1);

		JSpinner spinner_1_2 = new JSpinner();
		spinner_1_2.setBounds(121, 456, 42, 28);
		frame_1.getContentPane().add(spinner_1_2);

		JSpinner spinner_1_3 = new JSpinner();
		spinner_1_3.setBounds(121, 515, 42, 28);
		frame_1.getContentPane().add(spinner_1_3);

		JLabel lblNewLabel_1_1 = new JLabel("Girls");
		lblNewLabel_1_1.setBounds(53, 321, 46, 14);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame_1.getContentPane().add(lblNewLabel_1_1);

		JSpinner spinner_1_2_1 = new JSpinner();
		spinner_1_2_1.setBounds(121, 362, 42, 28);
		frame_1.getContentPane().add(spinner_1_2_1);

		JLabel lblNewLabel_2_1 = new JLabel("Boys");
		lblNewLabel_2_1.setBounds(53, 368, 46, 14);
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame_1.getContentPane().add(lblNewLabel_2_1);

		JSpinner spinner_1_3_1 = new JSpinner();
		spinner_1_3_1.setBounds(121, 315, 42, 28);
		frame_1.getContentPane().add(spinner_1_3_1);

		JLabel lblNewLabel_2_1_1 = new JLabel("Boys");
		lblNewLabel_2_1_1.setBounds(53, 521, 46, 14);
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame_1.getContentPane().add(lblNewLabel_2_1_1);

		JLabel lblAdaptionDetails = new JLabel("ADAPTION DETAILS:");
		lblAdaptionDetails.setBounds(10, 567, 138, 14);
		lblAdaptionDetails.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAdaptionDetails.setForeground(Color.WHITE);
		frame_1.getContentPane().add(lblAdaptionDetails);

		JLabel lblNumberOfChildren = new JLabel("Number of Children adapted this month:");
		lblNumberOfChildren.setBounds(29, 592, 241, 14);
		lblNumberOfChildren.setForeground(Color.WHITE);
		lblNumberOfChildren.setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame_1.getContentPane().add(lblNumberOfChildren);

		JSpinner spinner_1_1_1 = new JSpinner();
		spinner_1_1_1.setBounds(280, 586, 42, 28);
		frame_1.getContentPane().add(spinner_1_1_1);

		JLabel label_2 = new JLabel("");
		label_2.setBounds(638, 414, 46, 14);
		frame_1.getContentPane().add(label_2);

		JLabel lblEducationDetails = new JLabel("EDUCATION DETAILS:");
		lblEducationDetails.setBounds(628, 90, 138, 14);
		lblEducationDetails.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEducationDetails.setForeground(Color.WHITE);
		frame_1.getContentPane().add(lblEducationDetails);

		JLabel lblNumberOfChildren_2 = new JLabel("Does the Orphanage have a permanent doctor?");
		lblNumberOfChildren_2.setBounds(661, 318, 287, 20);
		lblNumberOfChildren_2.setForeground(Color.WHITE);
		lblNumberOfChildren_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame_1.getContentPane().add(lblNumberOfChildren_2);

		JSpinner spinner_1_1_1_1 = new JSpinner();
		spinner_1_1_1_1.setBounds(873, 117, 42, 28);
		frame_1.getContentPane().add(spinner_1_1_1_1);

		JSpinner spinner_1_2_2_1 = new JSpinner();
		spinner_1_2_2_1.setBounds(707, 157, 29, 20);
		frame_1.getContentPane().add(spinner_1_2_2_1);

		JLabel lblAreTheStudents = new JLabel("Are the Students provided with transport facilities to school?");
		lblAreTheStudents.setBounds(661, 201, 354, 14);
		lblAreTheStudents.setForeground(Color.WHITE);
		lblAreTheStudents.setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame_1.getContentPane().add(lblAreTheStudents);

		JRadioButton rdbtnYes = new JRadioButton("YES");
		rdbtnYes.setBounds(778, 222, 59, 23);
		rdbtnYes.setBackground(Color.DARK_GRAY);
		rdbtnYes.setForeground(Color.WHITE);
		frame_1.getContentPane().add(rdbtnYes);

		JRadioButton rdbtnNo = new JRadioButton("NO");
		rdbtnNo.setBounds(856, 222, 59, 23);
		rdbtnNo.setForeground(Color.WHITE);
		rdbtnNo.setBackground(Color.DARK_GRAY);
		frame_1.getContentPane().add(rdbtnNo);

		JLabel lblNewLabel_1_3 = new JLabel("Girls");
		lblNewLabel_1_3.setBounds(53, 626, 46, 14);
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame_1.getContentPane().add(lblNewLabel_1_3);

		JSpinner spinner_1_2_3 = new JSpinner();
		spinner_1_2_3.setBounds(121, 617, 42, 28);
		frame_1.getContentPane().add(spinner_1_2_3);

		JLabel lblNewLabel_2_1_1_1 = new JLabel("Boys");
		lblNewLabel_2_1_1_1.setBounds(53, 661, 46, 14);
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame_1.getContentPane().add(lblNewLabel_2_1_1_1);

		JSpinner spinner_1_3_2 = new JSpinner();
		spinner_1_3_2.setBounds(121, 656, 42, 28);
		frame_1.getContentPane().add(spinner_1_3_2);

		JLabel lblPrimary = new JLabel("Primary");
		lblPrimary.setBounds(661, 160, 46, 14);
		lblPrimary.setForeground(Color.WHITE);
		frame_1.getContentPane().add(lblPrimary);

		JLabel lblSecondary = new JLabel("Secondary");
		lblSecondary.setBounds(778, 160, 70, 14);
		lblSecondary.setForeground(Color.WHITE);
		frame_1.getContentPane().add(lblSecondary);

		JSpinner spinner_1_2_2_1_2 = new JSpinner();
		spinner_1_2_2_1_2.setBounds(847, 157, 29, 20);
		frame_1.getContentPane().add(spinner_1_2_2_1_2);

		JLabel lblHigherSecondary = new JLabel("Higher Secondary");
		lblHigherSecondary.setBounds(901, 160, 110, 14);
		lblHigherSecondary.setForeground(Color.WHITE);
		lblHigherSecondary.setBackground(Color.WHITE);
		frame_1.getContentPane().add(lblHigherSecondary);

		JSpinner spinner_1_2_2_1_2_1 = new JSpinner();
		spinner_1_2_2_1_2_1.setBounds(1021, 157, 29, 20);
		frame_1.getContentPane().add(spinner_1_2_2_1_2_1);

		JLabel lblMedicalDetails = new JLabel("MEDICAL DETAILS:");
		lblMedicalDetails.setBounds(628, 293, 114, 14);
		lblMedicalDetails.setForeground(new Color(255, 255, 255));
		lblMedicalDetails.setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame_1.getContentPane().add(lblMedicalDetails);

		JRadioButton rdbtnYes_2 = new JRadioButton("YES");
		rdbtnYes_2.setBounds(707, 345, 59, 23);
		rdbtnYes_2.setForeground(Color.WHITE);
		rdbtnYes_2.setBackground(Color.DARK_GRAY);
		frame_1.getContentPane().add(rdbtnYes_2);

		JRadioButton rdbtnNo_2 = new JRadioButton("NO");
		rdbtnNo_2.setBounds(790, 345, 59, 23);
		rdbtnNo_2.setForeground(Color.WHITE);
		rdbtnNo_2.setBackground(Color.DARK_GRAY);
		frame_1.getContentPane().add(rdbtnNo_2);

		JLabel lblNumberOfChildren_1 = new JLabel("Number of children going to school");
		lblNumberOfChildren_1.setBounds(661, 120, 202, 20);
		lblNumberOfChildren_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNumberOfChildren_1.setForeground(Color.WHITE);
		frame_1.getContentPane().add(lblNumberOfChildren_1);

		JLabel lblDetailsOfVaccines = new JLabel("Vaccination for infants and children below 5 years: ");
		lblDetailsOfVaccines.setBounds(661, 376, 294, 14);
		lblDetailsOfVaccines.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDetailsOfVaccines.setForeground(Color.WHITE);
		frame_1.getContentPane().add(lblDetailsOfVaccines);

		JLabel lblIsThereA = new JLabel("Is there a female guide to make girls understand about mensturation and other adult specifications?");
		lblIsThereA.setBounds(661, 429, 600, 28);
		lblIsThereA.setForeground(Color.WHITE);
		lblIsThereA.setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame_1.getContentPane().add(lblIsThereA);

		JRadioButton rdbtnYes_2_1 = new JRadioButton("YES");
		rdbtnYes_2_1.setBounds(722, 462, 59, 23);
		rdbtnYes_2_1.setForeground(Color.WHITE);
		rdbtnYes_2_1.setBackground(Color.DARK_GRAY);
		frame_1.getContentPane().add(rdbtnYes_2_1);

		JRadioButton rdbtnNo_2_1 = new JRadioButton("NO");
		rdbtnNo_2_1.setBounds(789, 461, 59, 23);
		rdbtnNo_2_1.setForeground(Color.WHITE);
		rdbtnNo_2_1.setBackground(Color.DARK_GRAY);
		frame_1.getContentPane().add(rdbtnNo_2_1);

		JRadioButton rdbtnYes_2_1_1 = new JRadioButton("YES");
		rdbtnYes_2_1_1.setBounds(707, 397, 59, 23);
		rdbtnYes_2_1_1.setForeground(Color.WHITE);
		rdbtnYes_2_1_1.setBackground(Color.DARK_GRAY);
		frame_1.getContentPane().add(rdbtnYes_2_1_1);

		JRadioButton rdbtnNo_2_1_1 = new JRadioButton("NO");
		rdbtnNo_2_1_1.setBounds(790, 397, 59, 23);
		rdbtnNo_2_1_1.setForeground(Color.WHITE);
		rdbtnNo_2_1_1.setBackground(Color.DARK_GRAY);
		frame_1.getContentPane().add(rdbtnNo_2_1_1);

		JLabel lblFinancialInformation = new JLabel("FINANCIAL DETAILS");
		lblFinancialInformation.setBounds(628, 522, 153, 14);
		lblFinancialInformation.setForeground(Color.WHITE);
		lblFinancialInformation.setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame_1.getContentPane().add(lblFinancialInformation);

		JLabel year = new JLabel("Recorded Year:");
		year.setBounds(628, 560, 153, 28);
		year.setForeground(Color.WHITE);
		year.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame_1.getContentPane().add(year);


		textField_2 = new JTextField();
		textField_2.setBounds(757, 566, 91, 20);
		textField_2.setBackground(Color.DARK_GRAY);
		textField_2.setForeground(Color.WHITE);
		textField_2.setCaretColor(Color.WHITE);
		textField_2.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
		frame_1.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		JButton btnGenerate_2 = new JButton("SUBMIT");
		btnGenerate_2.setBounds(960, 684, 114, 39);
		btnGenerate_2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		frame_1.getContentPane().add(btnGenerate_2);
		
		JButton btnGenerate_1 = new JButton("ADD");
		btnGenerate_1.setBounds(757, 518, 89, 23);
		frame_1.getContentPane().add(btnGenerate_1);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBounds(1105, 684, 114, 39);
		btnBack.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		frame_1.getContentPane().add(btnBack);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setFocusTraversalKeysEnabled(false);
		panel_1.setVerifyInputWhenFocusTarget(false);
		panel_1.setVisible(false);
		panel_1.setOpaque(false);
		panel_1.setFocusable(false);
		panel_1.setDoubleBuffered(false);
		panel_1.setEnabled(false);
		panel_1.setBounds(10, 44, 520, 39);
		frame_1.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblChooseTheYear = new JLabel("Choose the year to update:");
		lblChooseTheYear.setForeground(Color.WHITE);
		lblChooseTheYear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblChooseTheYear.setBounds(0, 0, 204, 28);
		panel_1.add(lblChooseTheYear);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(217, 4, 118, 22);
		panel_1.add(comboBox);


	}
}
