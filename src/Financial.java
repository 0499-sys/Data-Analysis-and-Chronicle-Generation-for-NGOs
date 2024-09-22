import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;


public class Financial extends Orphan implements ActionListener{

JFrame frame;



public static int cc,f,l,i,fc1,cw1,mh1,et1,t1,infra1,sw1,ta1,ps1,ti1,dr1,af1,a1,bl1,rf1;
public JTextArea textArea ,textArea_1,textArea_1_1,textArea_1_1_1;
public JTextField textField_2,textField_3,textField_6,textField_5,textField_4,textField_7,textField_8,textField_9,textField_10,textField_11,textField_12,
textField_13,
textField_14,
textField_15,
textField_16;
public String s;
public static  int y1;





/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
//Financial window = new Financial(s1);
//window.frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}


public Financial(String s) {
	
	OForm o1=new OForm(s1);
	
if(s.equals("i")) {	
	y1=o1.y;
initialize();
}
else if(s1.equals("u")){
	y1=o1.y;
	try {
		
		String regno;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
		Statement st=con.createStatement();
		ResultSet rs;
		rs=st.executeQuery("SELECT *\r\n" + "FROM `Finance`\r\n" + 
				"WHERE `regno` = '"+reg+"' ");
		System.out.println(""+y1);
		
		while(rs.next()) {
			
			regno=rs.getString(1);
			System.out.println(".....");
			
			if(regno.equals(reg)) {
				
				cc=rs.getInt(2);
				f=rs.getInt(3);
				l=rs.getInt(4);
				i=rs.getInt(5);
				fc1=rs.getInt(6);
				cw1=rs.getInt(7);
				mh1=rs.getInt(8);
				et1=rs.getInt(9);
				t1=rs.getInt(10);
				infra1=rs.getInt(11);
				sw1=rs.getInt(12);
				ta1=rs.getInt(13);
				ps1=rs.getInt(14);
				ti1=rs.getInt(15);
				dr1=rs.getInt(16);
				af1=rs.getInt(17);
				a1=rs.getInt(18);
				bl1=rs.getInt(19);
				rf1=rs.getInt(20);
				
			}
				
			}
		
		initialize1();
		}
	
	catch(Exception e) {}
	}


   
}


private void initialize1() {
	
	frame = new JFrame();
	frame.getContentPane().setBackground(Color.DARK_GRAY);
	frame.setBounds(0, 0, 1370, 850);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);

	JPanel panel = new JPanel();
	panel.setBounds(0, 0, 1284, 39);
	panel.setBackground(Color.DARK_GRAY);
	frame.getContentPane().add(panel);

	JTextArea txtrFinancialDetails = new JTextArea();
	txtrFinancialDetails.setForeground(Color.WHITE);
	txtrFinancialDetails.setBackground(Color.DARK_GRAY);
	txtrFinancialDetails.setSelectedTextColor(Color.WHITE);
	txtrFinancialDetails.setFont(new Font("Tahoma", Font.BOLD, 20));
	txtrFinancialDetails.setText("FINANCIAL DETAILS");
	panel.add(txtrFinancialDetails);

	JLabel lblDirectOrphanageExpenses = new JLabel("DIRECT ORPHANAGE EXPENDITURE:");
	lblDirectOrphanageExpenses.setBounds(495, 79, 254, 14);
	lblDirectOrphanageExpenses.setFont(new Font("Tahoma", Font.PLAIN, 15));
	lblDirectOrphanageExpenses.setForeground(Color.WHITE);
	frame.getContentPane().add(lblDirectOrphanageExpenses);

	JLabel lblFoodAndConsumables = new JLabel("Food and Consumables");
	lblFoodAndConsumables.setBounds(524, 138, 147, 14);
	lblFoodAndConsumables.setFont(new Font("Tahoma", Font.PLAIN, 13));
	lblFoodAndConsumables.setForeground(Color.WHITE);
	frame.getContentPane().add(lblFoodAndConsumables);

	textField_2 = new JTextField();
	textField_2.setBounds(716, 133, 147, 20);
	frame.getContentPane().add(textField_2);
	textField_2.setColumns(10);

	JLabel lblNewLabel = new JLabel("Clothes and Wearings");
	lblNewLabel.setBounds(522, 173, 147, 18);
	lblNewLabel.setForeground(Color.WHITE);
	lblNewLabel.setBackground(Color.DARK_GRAY);
	lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
	frame.getContentPane().add(lblNewLabel);

	textField_3 = new JTextField();
	textField_3.setBounds(717, 172, 147, 20);
	textField_3.setColumns(10);
	frame.getContentPane().add(textField_3);

	JLabel lblMedicalAndHealth = new JLabel("Medical and Health");
	lblMedicalAndHealth.setBounds(523, 208, 147, 20);
	lblMedicalAndHealth.setForeground(Color.WHITE);
	lblMedicalAndHealth.setFont(new Font("Tahoma", Font.PLAIN, 13));
	lblMedicalAndHealth.setBackground(Color.DARK_GRAY);
	frame.getContentPane().add(lblMedicalAndHealth);

	textField_4 = new JTextField();
	textField_4.setBounds(719, 283, 147, 20);
	textField_4.setColumns(10);
	frame.getContentPane().add(textField_4);

	textField_5 = new JTextField();
	textField_5.setBounds(720, 246, 147, 20);
	textField_5.setColumns(10);
	frame.getContentPane().add(textField_5);

	JLabel lblEducationAndTutions = new JLabel("Education and Tutions");
	lblEducationAndTutions.setBounds(525, 245, 147, 20);
	lblEducationAndTutions.setForeground(Color.WHITE);
	lblEducationAndTutions.setFont(new Font("Tahoma", Font.PLAIN, 13));
	lblEducationAndTutions.setBackground(Color.DARK_GRAY);
	frame.getContentPane().add(lblEducationAndTutions);

	JLabel lblTransportation = new JLabel("Transportation");
	lblTransportation.setBounds(527, 284, 147, 20);
	lblTransportation.setForeground(Color.WHITE);
	lblTransportation.setFont(new Font("Tahoma", Font.PLAIN, 13));
	lblTransportation.setBackground(Color.DARK_GRAY);
	frame.getContentPane().add(lblTransportation);

	textField_6 = new JTextField();
	textField_6.setBounds(718, 211, 147, 20);
	textField_6.setColumns(10);
	frame.getContentPane().add(textField_6);

	JLabel lblIndirectOrphanageExpenditure = new JLabel("INDIRECT ORPHANAGE EXPENDITURE:");
	lblIndirectOrphanageExpenditure.setBounds(930, 77, 277, 14);
	lblIndirectOrphanageExpenditure.setForeground(Color.WHITE);
	lblIndirectOrphanageExpenditure.setFont(new Font("Tahoma", Font.PLAIN, 15));
	frame.getContentPane().add(lblIndirectOrphanageExpenditure);

	JLabel lblInfrastructure = new JLabel("Infrastructure");
	lblInfrastructure.setBounds(954, 137, 147, 14);
	lblInfrastructure.setForeground(Color.WHITE);
	lblInfrastructure.setFont(new Font("Tahoma", Font.PLAIN, 13));
	frame.getContentPane().add(lblInfrastructure);

	textField_7 = new JTextField();
	textField_7.setBounds(1161, 127, 147, 20);
	textField_7.setColumns(10);
	frame.getContentPane().add(textField_7);

	JLabel lblSalaryAndWages = new JLabel("Salary and Wages");
	lblSalaryAndWages.setBounds(953, 171, 147, 18);
	lblSalaryAndWages.setForeground(Color.WHITE);
	lblSalaryAndWages.setFont(new Font("Tahoma", Font.PLAIN, 13));
	frame.getContentPane().add(lblSalaryAndWages);

	textField_8 = new JTextField();
	textField_8.setBounds(1161, 165, 147, 20);
	textField_8.setColumns(10);
	frame.getContentPane().add(textField_8);

	JLabel lblTransportationAllowance = new JLabel("Transportation Allowance");
	lblTransportationAllowance.setBounds(952, 210, 147, 14);
	lblTransportationAllowance.setForeground(Color.WHITE);
	lblTransportationAllowance.setFont(new Font("Tahoma", Font.PLAIN, 13));
	frame.getContentPane().add(lblTransportationAllowance);

	textField_9 = new JTextField();
	textField_9.setBounds(1160, 203, 147, 20);
	textField_9.setColumns(10);
	frame.getContentPane().add(textField_9);

	JLabel lblPrintingAndStationary = new JLabel("Printing and Stationary");
	lblPrintingAndStationary.setBounds(953, 242, 147, 18);
	lblPrintingAndStationary.setForeground(Color.WHITE);
	lblPrintingAndStationary.setFont(new Font("Tahoma", Font.PLAIN, 13));
	frame.getContentPane().add(lblPrintingAndStationary);

	textField_10 = new JTextField();
	textField_10.setBounds(1161, 240, 147, 20);
	textField_10.setColumns(10);
	frame.getContentPane().add(textField_10);

	JLabel lblTeleohoneAndInternet = new JLabel("Telephone and Internet");
	lblTeleohoneAndInternet.setBounds(953, 278, 147, 18);
	lblTeleohoneAndInternet.setForeground(Color.WHITE);
	lblTeleohoneAndInternet.setFont(new Font("Tahoma", Font.PLAIN, 13));
	frame.getContentPane().add(lblTeleohoneAndInternet);

	textField_11 = new JTextField();
	textField_11.setBounds(1162, 278, 147, 20);
	textField_11.setColumns(10);
	frame.getContentPane().add(textField_11);

	JLabel lblContributionAndDisaster = new JLabel("Disaster Relief");
	lblContributionAndDisaster.setBounds(953, 318, 140, 18);
	lblContributionAndDisaster.setForeground(Color.WHITE);
	lblContributionAndDisaster.setFont(new Font("Tahoma", Font.PLAIN, 13));
	frame.getContentPane().add(lblContributionAndDisaster);

	textField_12 = new JTextField();
	textField_12.setBounds(1162, 318, 147, 20);
	textField_12.setColumns(10);
	frame.getContentPane().add(textField_12);

	JLabel lblAuditFees = new JLabel("Audit Fees");
	lblAuditFees.setBounds(953, 356, 140, 18);
	lblAuditFees.setForeground(Color.WHITE);
	lblAuditFees.setFont(new Font("Tahoma", Font.PLAIN, 13));
	frame.getContentPane().add(lblAuditFees);

	textField_13 = new JTextField();
	textField_13.setBounds(1162, 357, 147, 20);
	textField_13.setColumns(10);
	frame.getContentPane().add(textField_13);

	JLabel lblAdminsitration = new JLabel("Adminsitration");
	lblAdminsitration.setBounds(953, 397, 140, 18);
	lblAdminsitration.setForeground(Color.WHITE);
	lblAdminsitration.setFont(new Font("Tahoma", Font.PLAIN, 13));
	frame.getContentPane().add(lblAdminsitration);

	textField_14 = new JTextField();
	textField_14.setBounds(1162, 397, 147, 20);
	textField_14.setColumns(10);
	frame.getContentPane().add(textField_14);

	JLabel lblBankLoans = new JLabel("Bank Loans");
	lblBankLoans.setBounds(953, 442, 140, 18);
	lblBankLoans.setForeground(Color.WHITE);
	lblBankLoans.setFont(new Font("Tahoma", Font.PLAIN, 13));
	frame.getContentPane().add(lblBankLoans);

	textField_15 = new JTextField();
	textField_15.setBounds(1162, 440, 147, 20);
	textField_15.setColumns(10);
	frame.getContentPane().add(textField_15);

	JLabel lblNewLabel_1 = new JLabel("Reserve Funds");
	lblNewLabel_1.setBounds(951, 482, 106, 14);
	lblNewLabel_1.setForeground(Color.WHITE);
	lblNewLabel_1.setBackground(Color.DARK_GRAY);
	lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
	frame.getContentPane().add(lblNewLabel_1);

	textField_16 = new JTextField();
	textField_16.setBounds(1162, 477, 147, 20);
	textField_16.setColumns(10);
	frame.getContentPane().add(textField_16);

	JLabel lblNewLabel_2 = new JLabel("FUNDS RECEIVED");
	lblNewLabel_2.setBounds(22, 87, 140, 14);
	lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
	lblNewLabel_2.setForeground(Color.WHITE);
	frame.getContentPane().add(lblNewLabel_2);

	JLabel lblNewLabel_3 = new JLabel("Funds from Corporate Companies");
	lblNewLabel_3.setBounds(51, 137, 200, 14);
	lblNewLabel_3.setForeground(Color.WHITE);
	lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
	frame.getContentPane().add(lblNewLabel_3);

	JTextArea textArea = new JTextArea();
	textArea.setBounds(290, 133, 147, 20);
	frame.getContentPane().add(textArea);

	JLabel lblNewLabel_3_1 = new JLabel("Funds From Foreign");
	lblNewLabel_3_1.setBounds(51, 172, 200, 16);
	lblNewLabel_3_1.setForeground(Color.WHITE);
	lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
	frame.getContentPane().add(lblNewLabel_3_1);

	JTextArea textArea_1 = new JTextArea();
	textArea_1.setBounds(290, 171, 147, 20);
	frame.getContentPane().add(textArea_1);

	JLabel lblNewLabel_3_1_1 = new JLabel("Local Donations");
	lblNewLabel_3_1_1.setBounds(52, 210, 200, 16);
	lblNewLabel_3_1_1.setForeground(Color.WHITE);
	lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
	frame.getContentPane().add(lblNewLabel_3_1_1);

	JTextArea textArea_1_1 = new JTextArea();
	textArea_1_1.setBounds(291, 208, 147, 20);
	frame.getContentPane().add(textArea_1_1);

	JLabel lblNewLabel_3_1_1_1 = new JLabel("Return from Investments");
	lblNewLabel_3_1_1_1.setBounds(50, 247, 200, 16);
	lblNewLabel_3_1_1_1.setForeground(Color.WHITE);
	lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
	frame.getContentPane().add(lblNewLabel_3_1_1_1);

	JTextArea textArea_1_1_1 = new JTextArea();
	textArea_1_1_1.setBounds(292, 247, 147, 20);
	frame.getContentPane().add(textArea_1_1_1);
	
	
	textArea.setText(String.valueOf(cc));
	textArea_1.setText(String.valueOf(f));
	textArea_1_1.setText(String.valueOf(l));
	textArea_1_1_1.setText(String.valueOf(i));  // cc,f,ld,i,fc,cw,mh,et,t,infra,sw,ta,ps,ti,dr,af,a,bl,rf;
	textField_2.setText(String.valueOf(fc1));
	textField_3.setText(String.valueOf(cw1));
	textField_6.setText(String.valueOf(mh1));
	textField_5.setText(String.valueOf(et1));
	textField_4.setText(String.valueOf(t1));
	textField_7.setText(String.valueOf(infra1));
	textField_8.setText(String.valueOf(sw1));
	textField_9.setText(String.valueOf(ta1));
	textField_10.setText(String.valueOf(ps1));
	textField_11.setText(String.valueOf(ti1));
	textField_12.setText(String.valueOf(dr1));
	textField_13.setText(String.valueOf(af1));
	textField_14.setText(String.valueOf(a1));
	textField_15.setText(String.valueOf(bl1));
	textField_16.setText(String.valueOf(rf1));
	
	
	
	
	
	JButton btnNewButton = new JButton("BACK");
	
	
	btnNewButton.setBackground(Color.WHITE);
	btnNewButton.setForeground(Color.BLACK);
	btnNewButton.setBounds(1010, 615, 134, 39);
	frame.getContentPane().add(btnNewButton);
	


	 btnNewButton.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			
			
				
				 try {
					 cc=Integer.parseInt(textArea.getText());
					f=Integer.parseInt(textArea_1.getText());
					l=Integer.parseInt(textArea_1_1.getText());
					i=Integer.parseInt(textArea_1_1_1.getText());
					 fc1=Integer.parseInt(textField_2.getText());
					 cw1=Integer.parseInt(textField_3.getText());
					 mh1=Integer.parseInt(textField_6.getText());
					 et1=Integer.parseInt(textField_5.getText());
					 t1=Integer.parseInt(textField_4.getText());
					 infra1=Integer.parseInt(textField_7.getText());
					 sw1=Integer.parseInt(textField_8.getText());
					 ta1=Integer.parseInt(textField_9.getText());
					 ps1=Integer.parseInt(textField_10.getText());
					 ti1=Integer.parseInt(textField_11.getText());
					 dr1=Integer.parseInt(textField_12.getText());
					 af1=Integer.parseInt(textField_13.getText());
					 a1=Integer.parseInt(textField_14.getText());
					 bl1=Integer.parseInt(textField_15.getText());
					 rf1=Integer.parseInt(textField_16.getText());
				     String regno;
				 
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
						
				Statement st=con.createStatement();
				ResultSet rs;
				
			
				st.executeUpdate("UPDATE `test`.`"+db+"` SET  `fcc`='"+cc+"',`ff`='"+f+"',`ld`='"+l+"',`ri`='"+i+"',`fc`='"+fc1+"',`cw`='"+cw1+"',`mh`='"+mh1+"',`et`='"+et1+"',`tran`='"+t1+"',`infra`='"+infra1+"',`sw`='"+sw1+"',`ta`='"+ta1+"',`ps`='"+ps1+"',`ti`='"+ti1+"',`dr`='"+dr1+"',`af`='"+af1+"',`ad`='"+a1+"',`bl`='"+bl1+"',`rf`='"+rf1+"' "
						                      + " WHERE `year`='"+y1+"'");
					                   
			    
			   //st.executeUpdate("INSERT INTO `test`.`table 2` ( `NAME`, `LOCATION`, `TOTALCHILD`, `TOTALDEST`, `DESTB`, `DESTG`, `TOTALORPHAN`, `ORPHANB`, `ORPHANG`, `MONTHADAPT`, `ADAPTB`, `ADAPTG`, `SCHOOLGOING`, `PRIMARY`, `SECONDARY`, `HIGHSEC`, `TRANSPORT`, `DOCTOR`, `VACCINE`, `CARETAKERGIRL`)VALUES('"+na+"','"+l+"','"+child+"','"+dest+"','"+dg+"','"+db+"','"+orp+"','"+og+"','"+ob+"','"+achild+"','"+g+"','"+b+"','"+school+"','"+p+"','"+s+"','"+hs+"','"+tr+"','"+d+"','"+v+"','"+m+"')");
			    
			    
			    
			    JOptionPane.showMessageDialog(frame,"DATA REGISTERED SUCCESSFULLY");
				 }
			    
		catch(Exception ae) {}
				 
		    System.out.println("F..."+y1);
		    OForm w1 = new OForm("u");
		    w1.frame.setVisible(true);
				 
				 
		
		
		}
		
	});
	
	}



	
	
	



/**
 * @wbp.parser.entryPoint
 */
private void initialize() {
frame = new JFrame();
frame.getContentPane().setBackground(Color.DARK_GRAY);
frame.setBounds(0, 0, 1370, 850);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);

JPanel panel = new JPanel();
panel.setBounds(0, 0, 1284, 39);
panel.setBackground(Color.DARK_GRAY);
frame.getContentPane().add(panel);

JTextArea txtrFinancialDetails = new JTextArea();
txtrFinancialDetails.setForeground(Color.WHITE);
txtrFinancialDetails.setBackground(Color.DARK_GRAY);
txtrFinancialDetails.setSelectedTextColor(Color.WHITE);
txtrFinancialDetails.setFont(new Font("Tahoma", Font.BOLD, 20));
txtrFinancialDetails.setText("FINANCIAL DETAILS");
panel.add(txtrFinancialDetails);

JLabel lblDirectOrphanageExpenses = new JLabel("DIRECT ORPHANAGE EXPENDITURE:");
lblDirectOrphanageExpenses.setBounds(495, 79, 254, 14);
lblDirectOrphanageExpenses.setFont(new Font("Tahoma", Font.PLAIN, 15));
lblDirectOrphanageExpenses.setForeground(Color.WHITE);
frame.getContentPane().add(lblDirectOrphanageExpenses);

JLabel lblFoodAndConsumables = new JLabel("Food and Consumables");
lblFoodAndConsumables.setBounds(524, 138, 147, 14);
lblFoodAndConsumables.setFont(new Font("Tahoma", Font.PLAIN, 13));
lblFoodAndConsumables.setForeground(Color.WHITE);
frame.getContentPane().add(lblFoodAndConsumables);

textField_2 = new JTextField();
textField_2.setBounds(716, 133, 147, 20);
frame.getContentPane().add(textField_2);
textField_2.setColumns(10);

JLabel lblNewLabel = new JLabel("Clothes and Wearings");
lblNewLabel.setBounds(522, 173, 147, 18);
lblNewLabel.setForeground(Color.WHITE);
lblNewLabel.setBackground(Color.DARK_GRAY);
lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
frame.getContentPane().add(lblNewLabel);

textField_3 = new JTextField();
textField_3.setBounds(717, 172, 147, 20);
textField_3.setColumns(10);
frame.getContentPane().add(textField_3);

JLabel lblMedicalAndHealth = new JLabel("Medical and Health");
lblMedicalAndHealth.setBounds(523, 208, 147, 20);
lblMedicalAndHealth.setForeground(Color.WHITE);
lblMedicalAndHealth.setFont(new Font("Tahoma", Font.PLAIN, 13));
lblMedicalAndHealth.setBackground(Color.DARK_GRAY);
frame.getContentPane().add(lblMedicalAndHealth);

textField_4 = new JTextField();
textField_4.setBounds(719, 283, 147, 20);
textField_4.setColumns(10);
frame.getContentPane().add(textField_4);

textField_5 = new JTextField();
textField_5.setBounds(720, 246, 147, 20);
textField_5.setColumns(10);
frame.getContentPane().add(textField_5);

JLabel lblEducationAndTutions = new JLabel("Education and Tutions");
lblEducationAndTutions.setBounds(525, 245, 147, 20);
lblEducationAndTutions.setForeground(Color.WHITE);
lblEducationAndTutions.setFont(new Font("Tahoma", Font.PLAIN, 13));
lblEducationAndTutions.setBackground(Color.DARK_GRAY);
frame.getContentPane().add(lblEducationAndTutions);

JLabel lblTransportation = new JLabel("Transportation");
lblTransportation.setBounds(527, 284, 147, 20);
lblTransportation.setForeground(Color.WHITE);
lblTransportation.setFont(new Font("Tahoma", Font.PLAIN, 13));
lblTransportation.setBackground(Color.DARK_GRAY);
frame.getContentPane().add(lblTransportation);

textField_6 = new JTextField();
textField_6.setBounds(718, 211, 147, 20);
textField_6.setColumns(10);
frame.getContentPane().add(textField_6);

JLabel lblIndirectOrphanageExpenditure = new JLabel("INDIRECT ORPHANAGE EXPENDITURE:");
lblIndirectOrphanageExpenditure.setBounds(930, 77, 277, 14);
lblIndirectOrphanageExpenditure.setForeground(Color.WHITE);
lblIndirectOrphanageExpenditure.setFont(new Font("Tahoma", Font.PLAIN, 15));
frame.getContentPane().add(lblIndirectOrphanageExpenditure);

JLabel lblInfrastructure = new JLabel("Infrastructure");
lblInfrastructure.setBounds(954, 137, 147, 14);
lblInfrastructure.setForeground(Color.WHITE);
lblInfrastructure.setFont(new Font("Tahoma", Font.PLAIN, 13));
frame.getContentPane().add(lblInfrastructure);

textField_7 = new JTextField();
textField_7.setBounds(1161, 127, 147, 20);
textField_7.setColumns(10);
frame.getContentPane().add(textField_7);

JLabel lblSalaryAndWages = new JLabel("Salary and Wages");
lblSalaryAndWages.setBounds(953, 171, 147, 18);
lblSalaryAndWages.setForeground(Color.WHITE);
lblSalaryAndWages.setFont(new Font("Tahoma", Font.PLAIN, 13));
frame.getContentPane().add(lblSalaryAndWages);

textField_8 = new JTextField();
textField_8.setBounds(1161, 165, 147, 20);
textField_8.setColumns(10);
frame.getContentPane().add(textField_8);

JLabel lblTransportationAllowance = new JLabel("Transportation Allowance");
lblTransportationAllowance.setBounds(952, 210, 147, 14);
lblTransportationAllowance.setForeground(Color.WHITE);
lblTransportationAllowance.setFont(new Font("Tahoma", Font.PLAIN, 13));
frame.getContentPane().add(lblTransportationAllowance);

textField_9 = new JTextField();
textField_9.setBounds(1160, 203, 147, 20);
textField_9.setColumns(10);
frame.getContentPane().add(textField_9);

JLabel lblPrintingAndStationary = new JLabel("Printing and Stationary");
lblPrintingAndStationary.setBounds(953, 242, 147, 18);
lblPrintingAndStationary.setForeground(Color.WHITE);
lblPrintingAndStationary.setFont(new Font("Tahoma", Font.PLAIN, 13));
frame.getContentPane().add(lblPrintingAndStationary);

textField_10 = new JTextField();
textField_10.setBounds(1161, 240, 147, 20);
textField_10.setColumns(10);
frame.getContentPane().add(textField_10);

JLabel lblTeleohoneAndInternet = new JLabel("Telephone and Internet");
lblTeleohoneAndInternet.setBounds(953, 278, 147, 18);
lblTeleohoneAndInternet.setForeground(Color.WHITE);
lblTeleohoneAndInternet.setFont(new Font("Tahoma", Font.PLAIN, 13));
frame.getContentPane().add(lblTeleohoneAndInternet);

textField_11 = new JTextField();
textField_11.setBounds(1162, 278, 147, 20);
textField_11.setColumns(10);
frame.getContentPane().add(textField_11);

JLabel lblContributionAndDisaster = new JLabel("Disaster Relief");
lblContributionAndDisaster.setBounds(953, 318, 140, 18);
lblContributionAndDisaster.setForeground(Color.WHITE);
lblContributionAndDisaster.setFont(new Font("Tahoma", Font.PLAIN, 13));
frame.getContentPane().add(lblContributionAndDisaster);

textField_12 = new JTextField();
textField_12.setBounds(1162, 318, 147, 20);
textField_12.setColumns(10);
frame.getContentPane().add(textField_12);

JLabel lblAuditFees = new JLabel("Audit Fees");
lblAuditFees.setBounds(953, 356, 140, 18);
lblAuditFees.setForeground(Color.WHITE);
lblAuditFees.setFont(new Font("Tahoma", Font.PLAIN, 13));
frame.getContentPane().add(lblAuditFees);

textField_13 = new JTextField();
textField_13.setBounds(1162, 357, 147, 20);
textField_13.setColumns(10);
frame.getContentPane().add(textField_13);

JLabel lblAdminsitration = new JLabel("Adminsitration");
lblAdminsitration.setBounds(953, 397, 140, 18);
lblAdminsitration.setForeground(Color.WHITE);
lblAdminsitration.setFont(new Font("Tahoma", Font.PLAIN, 13));
frame.getContentPane().add(lblAdminsitration);

textField_14 = new JTextField();
textField_14.setBounds(1162, 397, 147, 20);
textField_14.setColumns(10);
frame.getContentPane().add(textField_14);

JLabel lblBankLoans = new JLabel("Bank Loans");
lblBankLoans.setBounds(953, 442, 140, 18);
lblBankLoans.setForeground(Color.WHITE);
lblBankLoans.setFont(new Font("Tahoma", Font.PLAIN, 13));
frame.getContentPane().add(lblBankLoans);

textField_15 = new JTextField();
textField_15.setBounds(1162, 440, 147, 20);
textField_15.setColumns(10);
frame.getContentPane().add(textField_15);

JLabel lblNewLabel_1 = new JLabel("Reserve Funds");
lblNewLabel_1.setBounds(951, 482, 106, 14);
lblNewLabel_1.setForeground(Color.WHITE);
lblNewLabel_1.setBackground(Color.DARK_GRAY);
lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
frame.getContentPane().add(lblNewLabel_1);

textField_16 = new JTextField();
textField_16.setBounds(1162, 477, 147, 20);
textField_16.setColumns(10);
frame.getContentPane().add(textField_16);

JLabel lblNewLabel_2 = new JLabel("FUNDS RECEIVED");
lblNewLabel_2.setBounds(22, 87, 140, 14);
lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
lblNewLabel_2.setForeground(Color.WHITE);
frame.getContentPane().add(lblNewLabel_2);

JLabel lblNewLabel_3 = new JLabel("Funds from Corporate Companies");
lblNewLabel_3.setBounds(51, 137, 200, 14);
lblNewLabel_3.setForeground(Color.WHITE);
lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
frame.getContentPane().add(lblNewLabel_3);

JTextArea textArea = new JTextArea();
textArea.setBounds(290, 133, 147, 20);
frame.getContentPane().add(textArea);

JLabel lblNewLabel_3_1 = new JLabel("Funds From Foreign");
lblNewLabel_3_1.setBounds(51, 172, 200, 16);
lblNewLabel_3_1.setForeground(Color.WHITE);
lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
frame.getContentPane().add(lblNewLabel_3_1);

JTextArea textArea_1 = new JTextArea();
textArea_1.setBounds(290, 171, 147, 20);
frame.getContentPane().add(textArea_1);

JLabel lblNewLabel_3_1_1 = new JLabel("Local Donations");
lblNewLabel_3_1_1.setBounds(52, 210, 200, 16);
lblNewLabel_3_1_1.setForeground(Color.WHITE);
lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
frame.getContentPane().add(lblNewLabel_3_1_1);

JTextArea textArea_1_1 = new JTextArea();
textArea_1_1.setBounds(291, 208, 147, 20);
frame.getContentPane().add(textArea_1_1);

JLabel lblNewLabel_3_1_1_1 = new JLabel("Return from Investments");
lblNewLabel_3_1_1_1.setBounds(50, 247, 200, 16);
lblNewLabel_3_1_1_1.setForeground(Color.WHITE);
lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
frame.getContentPane().add(lblNewLabel_3_1_1_1);

JTextArea textArea_1_1_1 = new JTextArea();
textArea_1_1_1.setBounds(292, 247, 147, 20);
frame.getContentPane().add(textArea_1_1_1);
JButton btnNewButton = new JButton("BACK");
btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		

		 cc=Integer.parseInt(textArea.getText());
			f=Integer.parseInt(textArea_1.getText());
			l=Integer.parseInt(textArea_1_1.getText());
			i=Integer.parseInt(textArea_1_1_1.getText());
			 fc1=Integer.parseInt(textField_2.getText());
			 cw1=Integer.parseInt(textField_3.getText());
			 mh1=Integer.parseInt(textField_6.getText());
			 et1=Integer.parseInt(textField_5.getText());
			 t1=Integer.parseInt(textField_4.getText());
			 infra1=Integer.parseInt(textField_7.getText());
			 sw1=Integer.parseInt(textField_8.getText());
			 ta1=Integer.parseInt(textField_9.getText());
			 ps1=Integer.parseInt(textField_10.getText());
			 ti1=Integer.parseInt(textField_11.getText());
			 dr1=Integer.parseInt(textField_12.getText());
			 af1=Integer.parseInt(textField_13.getText());
			 a1=Integer.parseInt(textField_14.getText());
			 bl1=Integer.parseInt(textField_15.getText());
			 rf1=Integer.parseInt(textField_16.getText());
		
		
			
			 try {
				
			     String regno;
			 
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
					
			Statement st=con.createStatement();
			ResultSet rs;
			
			st.executeUpdate("UPDATE `test`.`"+db+"` SET  `fcc`='"+cc+"',`ff`='"+f+"',`ld`='"+l+"',`ri`='"+i+"',`fc`='"+fc1+"',`cw`='"+cw1+"',`mh`='"+mh1+"',`et`='"+et1+"',`tran`='"+t1+"',`infra`='"+infra1+"',`sw`='"+sw1+"',`ta`='"+ta1+"',`ps`='"+ps1+"',`ti`='"+ti1+"',`dr`='"+dr1+"',`af`='"+af1+"',`ad`='"+a1+"',`bl`='"+bl1+"',`rf`='"+rf1+"' "
                   + " WHERE `year`='"+y1+"'");
            
		
			//st.executeUpdate("UPDATE `test`.`"+db+"` (`fc`, `ff`, `ld`, `ri`, `fco`, `cw`, `mh`, `et`, `t`, `i`, `sw`, `ta`, `ps`, `ti`, `dr`, `af`, `a`, `bl`, `rf`)VALUES('arpan10008','"+cc+"','"+f+"','"+l+"','"+i+"','"+fc1+"','"+cw1+"','"+mh1+"','"+et1+"','"+t1+"','"+infra1+"','"+sw1+"','"+ta1+"','"+ps1+"','"+ti1+"','"+dr1+"','"+af1+"','"+a1+"','"+bl1+"','"+rf1+"')");
		  
		    
		   //st.executeUpdate("INSERT INTO `test`.`table 2` ( `NAME`, `LOCATION`, `TOTALCHILD`, `TOTALDEST`, `DESTB`, `DESTG`, `TOTALORPHAN`, `ORPHANB`, `ORPHANG`, `MONTHADAPT`, `ADAPTB`, `ADAPTG`, `SCHOOLGOING`, `PRIMARY`, `SECONDARY`, `HIGHSEC`, `TRANSPORT`, `DOCTOR`, `VACCINE`, `CARETAKERGIRL`)VALUES('"+na+"','"+l+"','"+child+"','"+dest+"','"+dg+"','"+db+"','"+orp+"','"+og+"','"+ob+"','"+achild+"','"+g+"','"+b+"','"+school+"','"+p+"','"+s+"','"+hs+"','"+tr+"','"+d+"','"+v+"','"+m+"')");
		    
		    
		    
		    JOptionPane.showMessageDialog(frame,"DATA REGISTERED SUCCESSFULLY");
			 }
		    
	catch(Exception ae) {}
	
                System.out.println("......");
                OForm window=new OForm("u");
				window.frame_1.setVisible(true);
		
	
		
	}
});
btnNewButton.setBackground(Color.WHITE);
btnNewButton.setForeground(Color.BLACK);
btnNewButton.setBounds(1010, 615, 134, 39);
frame.getContentPane().add(btnNewButton);


}

public void setVisible(boolean b) {
	// TODO Auto-generated method stub
	
}
}

