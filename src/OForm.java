import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JSpinner;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;


public class OForm extends Orphan implements ActionListener{
	
	

JFrame frame_1;
public JButton btnGenerate_1;
public JButton btnGenerate_2;
public JTextField textField;
public JTextField textField_1;
public JTextField textField_2;
public JLabel year;
public JSpinner spinner,spinner_1,spinner_1_2,spinner_1_3,spinner_1_1,spinner_1_2_1,spinner_1_3_1,spinner_1_1_1,spinner_1_2_3,spinner_1_3_2,
spinner_1_2_2_1,spinner_1_2_2_1_2,spinner_1_2_2_1_2_1;
public JRadioButton rdbtnYes,rdbtnYes_2,rdbtnYes_2_1,rdbtnYes_2_1_1;
String na,l,tr1,d1,v1,m1;
public int child1,dest1,dg1,db1,orp1,og1,ob1,achild1,adapt1,g1,b1,school1,p1,s2,hs1;
public static  int y;
//public static String s1;
private AbstractButton rdbtnNo;
private AbstractButton rdbtnNo_2;
private AbstractButton rdbtnNo_2_1;
private AbstractButton rdbtnNo_2_1_1;
private JTextField textField_0;

/**
* Launch the application.
 * @wbp.parser.entryPoint
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {

public void run() {
try {
	
	OForm window=new OForm(null);
	window.frame_1.setVisible(true);
	
} catch (Exception e) {
e.printStackTrace();
}
}
});
}


/**
 * @wbp.parser.entryPoint
 */
public OForm(String s1) {
	
	
	if(s1.equals("i")) {
		initialize();
	}
	
	else if(s1.equals("u")) {

	try {
		String regno;
		int year;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
		Statement st=con.createStatement();
		ResultSet rs;
		rs=st.executeQuery("SELECT *\r\n" + "FROM  `test`.`"+db+"` \r\n" + 
				"WHERE `year` = '"+y+"' ");
		System.out.println("oform..."+y);
		
		while(rs.next()) {
			
			year=rs.getInt(2);
			System.out.println(".....");
			
			if(year==y) {
				
			
				System.out.println(".......");
			                  na=rs.getString(3);
		
			                  l=rs.getString(4);
			                  //y=rs.getInt(2);
			                  
			                  child1=rs.getInt(5);
			                  dest1=rs.getInt(6);
				              dg1=rs.getInt(7);
			                  db1=rs.getInt(8);
				              orp1=rs.getInt(9);
                              og1=rs.getInt(10);
		                      ob1=rs.getInt(11);
				              achild1=rs.getInt(12);
			                  b1=rs.getInt(13);
				              g1=rs.getInt(14);
				              school1=rs.getInt(15);
				              p1=rs.getInt(16);
				              s2=rs.getInt(17);
				              hs1=rs.getInt(18);
				              tr1=rs.getString(19);
				              d1=rs.getString(20);
				              v1= rs.getString(21);
				              m1= rs.getString(22);
				
				
			
			
		  
		  
	          }
		}
	}
	
	catch(Exception ae) {System.out.println("....."+ae.getMessage());}
	initialize1();
	
	}
	
	
}


/**
 * @wbp.parser.entryPoint
 */
private void initialize1() {
	
	frame_1 = new JFrame();
	frame_1.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 20));
	frame.getContentPane().setBackground(Color.DARK_GRAY);
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
	lblName.setBounds(10, 50, 114, 28);
	lblName.setFont(new Font("Tahoma", Font.PLAIN, 15));
	lblName.setForeground(Color.WHITE);
	frame_1.getContentPane().add(lblName);

	textField = new JTextField(na);
	textField.setBounds(10, 89, 550, 20);
	textField.setCaretColor(Color.WHITE);
	textField.setBackground(Color.DARK_GRAY);
	textField.setForeground(Color.WHITE);


	textField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
	frame_1.getContentPane().add(textField);
	textField.setColumns(10);

	JLabel lblLocation = new JLabel("LOCATION:");
	lblLocation.setBounds(10, 122, 102, 14);
	lblLocation.setForeground(Color.WHITE);
	lblLocation.setFont(new Font("Tahoma", Font.PLAIN, 14));
	frame_1.getContentPane().add(lblLocation);

	textField_1 = new JTextField(l);
	textField_1.setBounds(10, 158, 550, 20);
	textField_1.setBackground(Color.DARK_GRAY);
	textField_1.setForeground(Color.WHITE);
	textField_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
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
	spinner.setValue(child1);

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
	spinner_1.setValue(dest1);

	JLabel lblNumberOfOrphans = new JLabel("NUMBER OF ORPHANS:");
	lblNumberOfOrphans.setBounds(10, 412, 153, 14);
	lblNumberOfOrphans.setForeground(Color.WHITE);
	lblNumberOfOrphans.setFont(new Font("Tahoma", Font.PLAIN, 14));
	lblNumberOfOrphans.setBackground(Color.DARK_GRAY);
	frame_1.getContentPane().add(lblNumberOfOrphans);

	JSpinner spinner_1_1 = new JSpinner();
	spinner_1_1.setBounds(228, 407, 42, 28);
	frame_1.getContentPane().add(spinner_1_1);
	spinner_1_1.setValue(orp1);

	JLabel lblNewLabel_1 = new JLabel("Girls");
	lblNewLabel_1.setBounds(53, 462, 46, 14);
	lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
	lblNewLabel_1.setForeground(Color.WHITE);
	frame_1.getContentPane().add(lblNewLabel_1);

	JSpinner spinner_1_2 = new JSpinner();
	spinner_1_2.setBounds(121, 456, 42, 28);
	frame_1.getContentPane().add(spinner_1_2);
	spinner_1_2.setValue(og1);

	JSpinner spinner_1_3 = new JSpinner();
	spinner_1_3.setBounds(121, 515, 42, 28);
	frame_1.getContentPane().add(spinner_1_3);
	spinner_1_3.setValue(ob1);

	JLabel lblNewLabel_1_1 = new JLabel("Girls");
	lblNewLabel_1_1.setBounds(53, 321, 46, 14);
	lblNewLabel_1_1.setForeground(Color.WHITE);
	lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
	frame_1.getContentPane().add(lblNewLabel_1_1);

	JSpinner spinner_1_2_1 = new JSpinner();
	spinner_1_2_1.setBounds(121, 362, 42, 28);
	frame_1.getContentPane().add(spinner_1_2_1);
	spinner_1_2_1.setValue(db1);

	JLabel lblNewLabel_2_1 = new JLabel("Boys");
	lblNewLabel_2_1.setBounds(53, 368, 46, 14);
	lblNewLabel_2_1.setForeground(Color.WHITE);
	lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
	frame_1.getContentPane().add(lblNewLabel_2_1);

	JSpinner spinner_1_3_1 = new JSpinner();
	spinner_1_3_1.setBounds(121, 315, 42, 28);
	frame_1.getContentPane().add(spinner_1_3_1);
	spinner_1_3_1.setValue(dg1);

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
	spinner_1_1_1.setValue(achild1);

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
	spinner_1_1_1_1.setValue(school1);

	JSpinner spinner_1_2_2_1 = new JSpinner();
	spinner_1_2_2_1.setBounds(707, 157, 29, 20);
	frame_1.getContentPane().add(spinner_1_2_2_1);
	spinner_1_2_2_1.setValue(p1);

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
	
	if(tr1.equals("Yes")) {
		rdbtnYes.setSelected(true);
	}
	else {
		rdbtnNo.setSelected(true);
		
	}

	JLabel lblNewLabel_1_3 = new JLabel("Girls");
	lblNewLabel_1_3.setBounds(53, 626, 46, 14);
	lblNewLabel_1_3.setForeground(Color.WHITE);
	lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
	frame_1.getContentPane().add(lblNewLabel_1_3);

	JSpinner spinner_1_2_3 = new JSpinner();
	spinner_1_2_3.setBounds(121, 617, 42, 28);
	frame_1.getContentPane().add(spinner_1_2_3);
	spinner_1_2_3.setValue(g1);

	JLabel lblNewLabel_2_1_1_1 = new JLabel("Boys");
	lblNewLabel_2_1_1_1.setBounds(53, 661, 46, 14);
	lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
	lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
	frame_1.getContentPane().add(lblNewLabel_2_1_1_1);

	JSpinner spinner_1_3_2 = new JSpinner();
	spinner_1_3_2.setBounds(121, 656, 42, 28);
	frame_1.getContentPane().add(spinner_1_3_2);
	spinner_1_3_2.setValue(b1);

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
	spinner_1_2_2_1_2.setValue(s2);

	JLabel lblHigherSecondary = new JLabel("Higher Secondary");
	lblHigherSecondary.setBounds(901, 160, 110, 14);
	lblHigherSecondary.setForeground(Color.WHITE);
	lblHigherSecondary.setBackground(Color.WHITE);
	frame_1.getContentPane().add(lblHigherSecondary);

	JSpinner spinner_1_2_2_1_2_1 = new JSpinner();
	spinner_1_2_2_1_2_1.setBounds(1021, 157, 29, 20);
	frame_1.getContentPane().add(spinner_1_2_2_1_2_1);
	spinner_1_2_2_1_2_1.setValue(hs1);
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
	
	if(d1.equals("Yes")) {
		rdbtnYes_2.setSelected(true);
	}
	else {
		rdbtnNo_2.setSelected(true);
		
	}

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
	rdbtnYes_2_1.setBounds(778, 462, 59, 23);
	rdbtnYes_2_1.setForeground(Color.WHITE);
	rdbtnYes_2_1.setBackground(Color.DARK_GRAY);
	frame_1.getContentPane().add(rdbtnYes_2_1);

	JRadioButton rdbtnNo_2_1 = new JRadioButton("NO");
	rdbtnNo_2_1.setBounds(873, 462, 59, 23);
	rdbtnNo_2_1.setForeground(Color.WHITE);
	rdbtnNo_2_1.setBackground(Color.DARK_GRAY);
	frame_1.getContentPane().add(rdbtnNo_2_1);
	
	if(m1.equals("Yes")) {
		rdbtnYes_2_1.setSelected(true);
	}
	else {
		rdbtnNo_2_1.setSelected(true);
		
	}

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
	
	if(v1.equals("Yes")) {
		rdbtnYes_2_1_1.setSelected(true);
	}
	else {
		rdbtnNo_2_1_1.setSelected(true);
		
	}

	JLabel lblFinancialInformation = new JLabel("FINANCIAL DETAILS");
	lblFinancialInformation.setBounds(628, 522, 153, 14);
	lblFinancialInformation.setForeground(Color.WHITE);
	lblFinancialInformation.setFont(new Font("Tahoma", Font.PLAIN, 13));
	frame_1.getContentPane().add(lblFinancialInformation);

	JButton btnGenerate_1 = new JButton("ADD");
	btnGenerate_1.setBounds(800, 565, 89, 23);
	frame_1.getContentPane().add(btnGenerate_1);
	

	btnGenerate_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			frame=new JFrame();
			Financial window = new Financial("u");
			window.frame.setVisible(true); 
			
			
		}
	});
	
	JButton btnBack = new JButton("BACK");
	btnBack.setBounds(1105, 684, 114, 39);
	btnBack.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
	frame_1.getContentPane().add(btnBack);
	

	btnBack.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
             Orphan o=new Orphan();
             o.frame.setVisible(true);
			
		}
	});
    

	JLabel year = new JLabel("Recorded Year:");
	year.setBounds(628, 560, 153, 28);
	year.setForeground(Color.WHITE);
	year.setFont(new Font("Tahoma", Font.PLAIN, 14));
	frame_1.getContentPane().add(year);


	textField_0 = new JTextField();
	textField_0.setBounds(757, 566, 91, 20);
	textField_0.setBackground(Color.DARK_GRAY);
	textField_0.setForeground(Color.WHITE);
	textField_0.setCaretColor(Color.WHITE);
	textField_0.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
	frame_1.getContentPane().add(textField_0);
	textField_0.setColumns(10);
	textField_0.setText(Integer.toString(y));
	
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
	

	
	
	
	JButton btnGenerate_2 = new JButton("SUBMIT");
	btnGenerate_2.setBounds(1000, 700, 89, 23);
	frame_1.getContentPane().add(btnGenerate_2);
     
	btnGenerate_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			 na=textField.getText();
			// System.out.println("\n reg "+na);
			 l=textField_1 .getText();
			 y=Integer.parseInt(textField_0.getText());
			 child1=(Integer)spinner.getValue();
			 dest1=(Integer)spinner_1.getValue();
			 dg1=(Integer)spinner_1_3_1.getValue();
			 db1=(Integer)spinner_1_2_1.getValue();
			 orp1=(Integer)spinner_1_1.getValue();
			 og1=(Integer)spinner_1_2.getValue();
			 ob1=(Integer)spinner_1_3.getValue();
			 achild1=(Integer)spinner_1_1_1.getValue();
			 g1=(Integer)spinner_1_2_3.getValue();
			 b1=(Integer)spinner_1_3_2.getValue();
			 school1=(Integer)spinner_1_1_1.getValue();
			 p1=(Integer)spinner_1_2_2_1.getValue();
			 s2=(Integer)spinner_1_2_2_1_2.getValue();
			 //hs=(Integer)spinner_1_2_1.getValue();
			 hs1=(Integer)spinner_1_2_2_1_2_1.getValue();

			 if(rdbtnYes.isSelected()) {
			 	tr1="Yes";}

			 	else {
			 		tr1="No";
			 	}

			 if(rdbtnYes_2.isSelected()) {
			 	d1="Yes";}

			 	else {
			 		d1="No";
			 	}

			 if(rdbtnYes_2_1_1.isSelected()) {
			 	v1="Yes";}

			 	else {
			 		v1="No";
			 	}

			 if(rdbtnYes_2_1.isSelected()) {
			 	m1="Yes";}

			 	else {
			 		m1="No";
			 	}
			 
			
			
			 
			 try {
		         Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
						
				Statement st=con.createStatement();
				
				
				st.executeUpdate("UPDATE `test`.`"+db+"` SET  `year`='"+y+"', `name`='"+na+"',`location`='"+l+"',`child`='"+child1+"',`dest`='"+dest1+"',`dg`='"+db1+"',`db`='"+dg1+"',`orp`='"+orp1+"',`og`='"+ob1+"',`ob`='"+og1+"',`adapt`='"+achild1+"',`ag`='"+b1+"',`ab`='"+g1+"',`school`='"+school1+"',`p`='"+p1+"',`sec`='"+s2+"',`hs`='"+hs1+"',`tr`='"+tr1+"',`d`='"+d1+"',`vacc`='"+v1+"',`gc`='"+m1+"' "
                       + " WHERE `year`='"+y+"'");
		
				//st.executeUpdate("INSERT INTO `test`.`table 2` ( `regno`,`year`, `name`, `location`, `child`, `dest`, `dg`, `db`, `orp`, `og`, `ob`, `adapt`, `ag`, `ab`,`school`, `p`, `sec`, `hs`, `tr`, `d`, `vacc`, `gc`)VALUES('"+reg+"','"+na+"','"+l+"','"+child+"','"+dest+"','"+dg+"','"+db+"','"+orp+"','"+og+"','"+ob+"','"+achild+"','"+g+"','"+b+"','"+school+"','"+p+"','"+s+"','"+hs+"','"+tr+"','"+d+"','"+v+"','"+m+"')");
				
				
				JOptionPane.showMessageDialog(frame,"DATA REGISTERED SUCCESSFULLY");    
			
			}
			
			catch(Exception ae)
			{
				System.out.println("..."+ae.getMessage());
			}
			
			}
	});



	


	 }


	


/**
 * @wbp.parser.entryPoint
 */
private void initialize() {
	
	frame_1 = new JFrame();
	frame_1.setBounds(100, 100, 450, 300);
	frame_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
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
	lblName.setBounds(10, 50, 114, 28);
	lblName.setFont(new Font("Tahoma", Font.PLAIN, 15));
	lblName.setForeground(Color.WHITE);
	frame_1.getContentPane().add(lblName);

	textField = new JTextField();
	textField.setBounds(10, 89, 550, 20);
	textField.setCaretColor(Color.WHITE);
	textField.setBackground(Color.DARK_GRAY);
	textField.setForeground(Color.WHITE);
	textField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
	frame_1.getContentPane().add(textField);
	textField.setColumns(10);

	JLabel lblLocation = new JLabel("LOCATION:");
	lblLocation.setBounds(10, 122, 102, 14);
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
	lblFinancialInformation.setBounds(628, 560, 153, 14);
	lblFinancialInformation.setForeground(Color.WHITE);
	lblFinancialInformation.setFont(new Font("Tahoma", Font.PLAIN, 13));
	frame_1.getContentPane().add(lblFinancialInformation);

	JLabel year = new JLabel("Recorded Year:");
	year.setBounds(628, 522, 153, 28);
	year.setForeground(Color.WHITE);
	year.setFont(new Font("Tahoma", Font.PLAIN, 14));
	frame_1.getContentPane().add(year);


	textField_0 = new JTextField();
	textField_0.setBounds(757, 522, 91, 20);
	textField_0.setBackground(Color.DARK_GRAY);
	textField_0.setForeground(Color.WHITE);
	textField_0.setCaretColor(Color.WHITE);
	textField_0.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
	frame_1.getContentPane().add(textField_0);
	textField_0.setColumns(10);
	
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

	JButton btnGenerate_2 = new JButton("SUBMIT");
	btnGenerate_2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
	btnGenerate_2.setBounds(960, 684, 114, 39);
	frame_1.getContentPane().add(btnGenerate_2);
	
	JButton btnGenerate_1 = new JButton("ADD");
	btnGenerate_1.setBounds(757, 560, 89, 23);
	frame_1.getContentPane().add(btnGenerate_1);
	
	JButton btnBack = new JButton("BACK");
	btnBack.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
	btnBack.setBounds(1105, 684, 114, 39);
	frame_1.getContentPane().add(btnBack);
    
	btnBack.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			Orphan o=new Orphan();
			o.frame.setVisible(true);
		}
	});



 
btnGenerate_2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		
		 
		 na=textField.getText();
		 System.out.println("\n reg "+na);
		 l=textField_1.getText();
		 y=Integer.parseInt(textField_0.getText());
		 child1=(Integer)spinner.getValue();
		 dest1=(Integer)spinner_1.getValue();
		 dg1=(Integer)spinner_1_3_1.getValue();
		 db1=(Integer)spinner_1_2_1.getValue();
		 orp1=(Integer)spinner_1_1.getValue();
		 og1=(Integer)spinner_1_2.getValue();
		 ob1=(Integer)spinner_1_3.getValue();
		 achild1=(Integer)spinner_1_1_1.getValue();
		 g1=(Integer)spinner_1_2_3.getValue();
		 b1=(Integer)spinner_1_3_2.getValue();
		 school1=(Integer)spinner_1_1_1.getValue();
		 p1=(Integer)spinner_1_2_2_1.getValue();
		 s2=(Integer)spinner_1_2_2_1_2.getValue();
		 //hs=(Integer)spinner_1_2_1.getValue();
		 hs1=(Integer)spinner_1_2_2_1_2_1.getValue();

		 if(rdbtnYes.isSelected()) {
		 	tr1="Yes";}

		 	else {
		 		tr1="No";
		 	}

		 if(rdbtnYes_2.isSelected()) {
		 	d1="Yes";}

		 	else {
		 		d1="No";
		 	}

		 if(rdbtnYes_2_1_1.isSelected()) {
		 	v1="Yes";}

		 	else {
		 		v1="No";
		 	}

		 if(rdbtnYes_2_1.isSelected()) {
		 	m1="Yes";}

		 	else {
		 		m1="No";
		 	}
		
		 
		 try {
	         Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
					
			Statement st=con.createStatement();
			ResultSet rs;
	        
			st.executeUpdate("UPDATE `test`.`"+db+"` SET  `year`='"+y+"', `name`='"+na+"',`location`='"+l+"',`child`='"+child1+"',`dest`='"+dest1+"',`dg`='"+db1+"',`db`='"+dg1+"',`orp`='"+orp1+"',`og`='"+ob1+"',`ob`='"+og1+"',`adapt`='"+achild1+"',`ag`='"+b1+"',`ab`='"+g1+"',`school`='"+school1+"',`p`='"+p1+"',`sec`='"+s1+"',`hs`='"+hs1+"',`tr`='"+tr1+"',`d`='"+d1+"',`vacc`='"+v1+"',`gc`='"+m1+"' "
                    + " WHERE `year`='"+y+"'");
			//st.executeUpdate("INSERT INTO `test`.`"+db+"` ( `regno`,`year`,`name`, `location`, `child`, `dest`, `dg`, `db`, `orp`, `og`, `ob`, `adapt`, `ag`, `ab`, `school`, `p`, `sec`, `hs`, `tr`, `d`, `vacc`, `gc`)VALUES('"+reg+"','"+y+"','"+na+"','"+l+"','"+child1+"','"+dest1+"','"+dg1+"','"+db+"','"+orp1+"','"+og1+"','"+ob1+"','"+achild1+"','"+g1+"','"+b1+"','"+school1+"','"+p1+"','"+s1+"','"+hs1+"','"+tr1+"','"+d1+"','"+v1+"','"+m1+"')");
			
			
			JOptionPane.showMessageDialog(frame,"DATA REGISTERED SUCCESSFULLY");    
		
		}
		
		catch(Exception ae)
		{System.out.println("..."+ae.getMessage());}
		
		
		
		
		
		
		
	}
});




btnGenerate_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		
		 na=textField.getText();
         l=textField_1.getText();
		 y=Integer.parseInt(textField_0.getText());
		 System.out.print(""+y);
		 child1=(Integer)spinner.getValue();
		 dest1=(Integer)spinner_1.getValue();
		 dg1=(Integer)spinner_1_3_1.getValue();
		 db1=(Integer)spinner_1_2_1.getValue();
		 orp1=(Integer)spinner_1_1.getValue();
		 og1=(Integer)spinner_1_2.getValue();
		 ob1=(Integer)spinner_1_3.getValue();
		 achild1=(Integer)spinner_1_1_1.getValue();
		 g1=(Integer)spinner_1_2_3.getValue();
		 b1=(Integer)spinner_1_3_2.getValue();
		 school1=(Integer)spinner_1_1_1.getValue();
		 p1=(Integer)spinner_1_2_2_1.getValue();
		 s2=(Integer)spinner_1_2_2_1_2.getValue();
		 //hs=(Integer)spinner_1_2_1.getValue();
		 hs1=(Integer)spinner_1_2_2_1_2_1.getValue();

		 if(rdbtnYes.isSelected()) {
		 	tr1="Yes";}

		 	else {
		 		tr1="No";
		 	}

		 if(rdbtnYes_2.isSelected()) {
		 	d1="Yes";}

		 	else {
		 		d1="No";
		 	}

		 if(rdbtnYes_2_1_1.isSelected()) {
		 	v1="Yes";}

		 	else {
		 		v1="No";
		 	}

		 if(rdbtnYes_2_1.isSelected()) {
		 	m1="Yes";}

		 	else {
		 		m1="No";
		 	}
		
		 
		 try {
	         Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
					
			Statement st=con.createStatement();
			ResultSet rs;
	
			st.executeUpdate("INSERT INTO `test`.`"+db+"` ( `regno`,`year`,`name`, `location`, `child`, `dest`, `dg`, `db`, `orp`, `og`, `ob`, `adapt`, `ag`, `ab`, `school`, `p`, `sec`, `hs`, `tr`, `d`, `vacc`, `gc`)VALUES('"+reg+"','"+y+"','"+na+"','"+l+"','"+child1+"','"+dest1+"','"+dg1+"','"+db1+"','"+orp1+"','"+og1+"','"+ob1+"','"+achild1+"','"+g1+"','"+b1+"','"+school1+"','"+p1+"','"+s2+"','"+hs1+"','"+tr1+"','"+d1+"','"+v1+"','"+m1+"')");
			
			
			JOptionPane.showMessageDialog(frame,"DATA REGISTERED SUCCESSFULLY");    
		
		}
		
		catch(Exception ae)
		 
		{System.out.println("..."+ae.getMessage());}
		

		Financial window = new Financial(s1);
		window.frame.setVisible(true);
		
		
	}
});




 }

/**
 * @wbp.parser.entryPoint
 */
public int get() {
	return y;
	}

/**
 * @wbp.parser.entryPoint
 */
public void setVisible(boolean b) {
	// TODO Auto-generated method stub
	
}

/**
 * @wbp.parser.entryPoint
 */
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}

