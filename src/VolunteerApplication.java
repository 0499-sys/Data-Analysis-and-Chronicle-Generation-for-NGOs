import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.Font;
import java.awt.Component;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.ComponentOrientation;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.border.MatteBorder;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;

import java.awt.Choice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.Dimension;
import java.awt.Scrollbar;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;

import java.awt.Cursor;

//import org.eclipse.wb.swing.FocusTraversalOnArray;

import javax.swing.JTextField;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;



public class VolunteerApplication extends LogIn1 {

private JFrame frame;
//private JFrame f;

public String s2;
public JPanel panel;
public JTextArea txtrVolunteerApplication;
public JTextArea textArea_2;
public JLabel lblNewLabel;
public  JLabel lblAddress;
public  JLabel lblAge;
public JLabel lblGender;
public  JLabel lblEmailId;
public  JLabel lblQualification;
public  JLabel lblReasonOfJoining;
public  JLabel lblState;
public JLabel lblPhoneNumber;
public  JLabel lblPhoner;
public JLabel lblPreviousVolunteeringExperience;
public  JLabel lblNewLabel_1;
private JLabel lblimage;
private JLabel lblNewLabel_1_1;
private JLabel lblNewLabel_1_1_1;
private JLabel lblAvailibilityAndVolunteer;
private JLabel lblNewLabel_1_2;
private JLabel lblNewLabel_2;
private JLabel lblNewLabel_2_1;
private JLabel lblNewLabel_2_1_1;
private JLabel lblNewLabel_2_2 ;
public  JRadioButton rdbtnNewRadioButton;
public  JRadioButton rdbtnNewRadioButton_1;
public  JRadioButton rdbtnNewRadioButton_1_1;
public  JComboBox combobox;
public  JCheckBox chckbxNewCheckBox;
public  JCheckBox chckbxAfternoons;
public JCheckBox chckbxEvenings;
public  JCheckBox chckbxWeekends;
public  JCheckBox chckbxOnceAWeek;
public JCheckBox chckbxAsNeeded;
public  JTextField textField;
public  JTextField textField_1;
public  JTextField textField_2;
public  JTextField textField_3;
public  JTextField textField_4;
public  JTextField textField_5;
public  JTextField textField_6;
public  JTextField textField_7;
public  JTextField textField_8;
public  JTextField textField_9;
public  JTextField textField_10;
public  JTextField textField_11;

public String name,add,city,state,eid,rofj,nn,tow,gen,grad,morn,after,week,as,even,once,phone,ephone;
public int dw,hrs,age;
String reg="111";
public static int i=1;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try
{
VolunteerApplication window = new VolunteerApplication();
window.frame.setVisible(true);
}
catch (Exception e)
{
e.printStackTrace();
}
}
});
}

/**
* Create the application.
*/
public VolunteerApplication() {
initialize();
}

/**
* Initialise the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.getContentPane().setName("nidhi");
frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
frame.getContentPane().setBackground(Color.DARK_GRAY);
frame.setBounds(0, 0, 1370, 850);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);
frame.setVisible(true);

JLabel lblNewLabel_4 = new JLabel("APPLICATION FORM");
lblNewLabel_4.setForeground(Color.WHITE);
lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD, 20));
lblNewLabel_4.setBounds(587, 11, 299, 22);
frame.getContentPane().add(lblNewLabel_4);

JLabel lblNewLabel = new JLabel("NAME:");
lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
lblNewLabel.setForeground(Color.WHITE);
lblNewLabel.setBounds(31, 60, 46, 14);
frame.getContentPane().add(lblNewLabel);

textField = new JTextField();
textField.setOpaque(false);
textField.setCaretColor(Color.WHITE);
textField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
textField.setForeground(Color.WHITE);
textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
textField.setBounds(131, 58, 302, 20);
frame.getContentPane().add(textField);
textField.setColumns(10);

JLabel lblAddress = new JLabel("ADDRESS:");
lblAddress.setForeground(Color.WHITE);
lblAddress.setFont(new Font("Tahoma", Font.BOLD, 13));
lblAddress.setBounds(572, 60, 83, 14);
frame.getContentPane().add(lblAddress);

textField_1 = new JTextField();
textField_1.setForeground(Color.WHITE);
textField_1.setCaretColor(Color.WHITE);
textField_1.setOpaque(false);
textField_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
textField_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
textField_1.setBounds(668, 58, 430, 20);
frame.getContentPane().add(textField_1);
textField_1.setColumns(10);

JLabel lblAge = new JLabel("CITY:");
lblAge.setForeground(Color.WHITE);
lblAge.setFont(new Font("Tahoma", Font.BOLD, 13));
lblAge.setBounds(31, 111, 83, 14);
frame.getContentPane().add(lblAge);

textField_2 = new JTextField();
textField_2.setOpaque(false);
textField_2.setForeground(Color.WHITE);
textField_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
textField_2.setColumns(10);
textField_2.setCaretColor(Color.WHITE);
textField_2.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
textField_2.setBounds(134, 109, 208, 20);
frame.getContentPane().add(textField_2);

JLabel lblState = new JLabel("STATE:");
lblState.setForeground(Color.WHITE);
lblState.setFont(new Font("Tahoma", Font.BOLD, 13));
lblState.setBounds(572, 111, 83, 14);
frame.getContentPane().add(lblState);

textField_3 = new JTextField();
textField_3.setOpaque(false);
textField_3.setForeground(Color.WHITE);
textField_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
textField_3.setColumns(10);
textField_3.setCaretColor(Color.WHITE);
textField_3.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
textField_3.setBounds(669, 109, 245, 20);
frame.getContentPane().add(textField_3);

JLabel lblPhoner = new JLabel("PHONE(m):");
lblPhoner.setForeground(Color.WHITE);
lblPhoner.setFont(new Font("Tahoma", Font.BOLD, 13));
lblPhoner.setBounds(31, 164, 74, 14);
frame.getContentPane().add(lblPhoner);

textField_4 = new JTextField();
textField_4.setOpaque(false);
textField_4.setForeground(Color.WHITE);
textField_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
textField_4.setColumns(10);
textField_4.setCaretColor(Color.WHITE);
textField_4.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
textField_4.setBounds(131, 162, 211, 20);
frame.getContentPane().add(textField_4);

JLabel lblPhoneNumber = new JLabel("EMERGENCY PHONE(M):");
lblPhoneNumber.setForeground(Color.WHITE);
lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 13));
lblPhoneNumber.setBounds(572, 164, 149, 14);
frame.getContentPane().add(lblPhoneNumber);

textField_5 = new JTextField();
textField_5.setOpaque(false);
textField_5.setForeground(Color.WHITE);
textField_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
textField_5.setColumns(10);
textField_5.setCaretColor(Color.WHITE);
textField_5.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
textField_5.setBounds(742, 158, 222, 20);
frame.getContentPane().add(textField_5);


JLabel lblGender = new JLabel("GENDER:");
lblGender.setForeground(Color.WHITE);
lblGender.setFont(new Font("Tahoma", Font.BOLD, 13));
lblGender.setBounds(31, 212, 83, 14);
frame.getContentPane().add(lblGender);


JRadioButton rdbtnNewRadioButton = new JRadioButton("MALE");
rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
rdbtnNewRadioButton.setBounds(138, 209, 63, 23);
frame.getContentPane().add(rdbtnNewRadioButton);

JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("FEMALE");
rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
rdbtnNewRadioButton_1.setBounds(244, 209, 74, 23);
frame.getContentPane().add(rdbtnNewRadioButton_1);

JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("OTHER");
rdbtnNewRadioButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
rdbtnNewRadioButton_1_1.setBounds(359, 209, 74, 23);
frame.getContentPane().add(rdbtnNewRadioButton_1_1);

ButtonGroup G1 = new ButtonGroup();
G1.add(rdbtnNewRadioButton);
G1.add(rdbtnNewRadioButton_1);
G1.add(rdbtnNewRadioButton_1_1);

JLabel lblQualification = new JLabel("QUALIFICATION:");
lblQualification.setForeground(Color.WHITE);
lblQualification.setFont(new Font("Tahoma", Font.BOLD, 13));
lblQualification.setBounds(573, 211, 106, 14);
frame.getContentPane().add(lblQualification);

String[] s1 = {"10th","12th","Graduation"};
JComboBox combobox = new JComboBox(s1);
combobox.setSelectedIndex(0);
combobox.setForeground(Color.DARK_GRAY);
combobox.setBackground(Color.WHITE);
combobox.setFont(new Font("Tahoma", Font.PLAIN, 13));
combobox.setBounds(701, 208, 120, 20);
frame.getContentPane().add(combobox);

JLabel lblEmailId = new JLabel("EMAIL ID:");
lblEmailId.setForeground(Color.WHITE);
lblEmailId.setFont(new Font("Tahoma", Font.BOLD, 13));
lblEmailId.setBounds(31, 260, 83, 14);
frame.getContentPane().add(lblEmailId);

textField_6 = new JTextField();
textField_6.setOpaque(false);
textField_6.setForeground(Color.WHITE);
textField_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
textField_6.setColumns(10);
textField_6.setCaretColor(Color.WHITE);
textField_6.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
textField_6.setBounds(131, 258, 311, 20);
frame.getContentPane().add(textField_6);

JLabel lblAge_1 = new JLabel("AGE:");
lblAge_1.setForeground(Color.WHITE);
lblAge_1.setFont(new Font("Tahoma", Font.BOLD, 13));
lblAge_1.setBounds(572, 260, 106, 14);
frame.getContentPane().add(lblAge_1);

textField_7 = new JTextField();
textField_7.setOpaque(false);
textField_7.setForeground(Color.WHITE);
textField_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
textField_7.setColumns(10);
textField_7.setCaretColor(Color.WHITE);
textField_7.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
textField_7.setBounds(701, 258, 127, 20);
frame.getContentPane().add(textField_7);

JLabel lblReasonOfJoining = new JLabel("REASON OF JOINING:");
lblReasonOfJoining.setForeground(Color.WHITE);
lblReasonOfJoining.setFont(new Font("Tahoma", Font.BOLD, 13));
lblReasonOfJoining.setBounds(32, 323, 133, 14);
frame.getContentPane().add(lblReasonOfJoining);

JScrollPane scrollPane_1 = new JScrollPane();
scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
scrollPane_1.setBounds(205, 295, 722, 81);
frame.getContentPane().add(scrollPane_1);

JTextArea textArea_2 = new JTextArea();
textArea_2.setCaretColor(Color.BLACK);
textArea_2.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
textArea_2.setRows(4);
textArea_2.setColumns(10);
textArea_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
scrollPane_1.setViewportView(textArea_2);

JLabel lblPreviousVolunteeringExperience = new JLabel("PREVIOUS VOLUNTEERING EXPERIENCE IF ANY:");
lblPreviousVolunteeringExperience.setForeground(Color.WHITE);
lblPreviousVolunteeringExperience.setFont(new Font("Tahoma", Font.BOLD, 13));
lblPreviousVolunteeringExperience.setBounds(31, 389, 311, 14);
frame.getContentPane().add(lblPreviousVolunteeringExperience);

JLabel lblNewLabel_1 = new JLabel("Name of NGO:");
lblNewLabel_1.setForeground(Color.WHITE);
lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
lblNewLabel_1.setBounds(59, 432, 106, 14);
frame.getContentPane().add(lblNewLabel_1);

textField_8 = new JTextField();
textField_8.setOpaque(false);
textField_8.setForeground(Color.WHITE);
textField_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
textField_8.setColumns(10);
textField_8.setCaretColor(Color.WHITE);
textField_8.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
textField_8.setBounds(184, 430, 302, 20);
frame.getContentPane().add(textField_8);


JLabel lblNewLabel_1_1 = new JLabel("Type of Work:");
lblNewLabel_1_1.setForeground(Color.WHITE);
lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
lblNewLabel_1_1.setBounds(648, 436, 106, 14);
frame.getContentPane().add(lblNewLabel_1_1);

textField_10 = new JTextField();
textField_10.setOpaque(false);
textField_10.setForeground(Color.WHITE);
textField_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
textField_10.setColumns(10);
textField_10.setCaretColor(Color.WHITE);
textField_10.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
textField_10.setBounds(764, 430, 495, 20);
frame.getContentPane().add(textField_10);

JLabel lblNewLabel_1_1_1 = new JLabel("Duration of Work:");
lblNewLabel_1_1_1.setForeground(Color.WHITE);
lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
lblNewLabel_1_1_1.setBounds(60, 470, 141, 14);
frame.getContentPane().add(lblNewLabel_1_1_1);

JLabel lblInMonths = new JLabel("(In Months)");
lblInMonths.setForeground(Color.WHITE);
lblInMonths.setFont(new Font("Tahoma", Font.PLAIN, 13));
lblInMonths.setBounds(403, 471, 74, 14);
frame.getContentPane().add(lblInMonths);

textField_9 = new JTextField();
textField_9.setOpaque(false);
textField_9.setForeground(Color.WHITE);
textField_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
textField_9.setColumns(10);
textField_9.setCaretColor(Color.WHITE);
textField_9.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
textField_9.setBounds(184, 468, 208, 20);
frame.getContentPane().add(textField_9);


JLabel lblAvailibilityAndVolunteer = new JLabel("AVAILIBILITY AND VOLUNTEER ASSIGNMENT PREFERENCES:");
lblAvailibilityAndVolunteer.setForeground(Color.WHITE);
lblAvailibilityAndVolunteer.setFont(new Font("Tahoma", Font.BOLD, 13));
lblAvailibilityAndVolunteer.setBounds(28, 513, 414, 14);
frame.getContentPane().add(lblAvailibilityAndVolunteer);

JLabel lblNewLabel_1_2 = new JLabel("Please Check all that are applicable");
lblNewLabel_1_2.setForeground(Color.WHITE);
lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
lblNewLabel_1_2.setBounds(38, 538, 251, 14);
frame.getContentPane().add(lblNewLabel_1_2);

JLabel lblNewLabel_2 = new JLabel("I am Availabe:");
lblNewLabel_2.setForeground(Color.WHITE);
lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
lblNewLabel_2.setBounds(59, 563, 96, 14);
frame.getContentPane().add(lblNewLabel_2);

JLabel lblNewLabel_2_1 = new JLabel("(Mon to Fri)");
lblNewLabel_2_1.setForeground(Color.WHITE);
lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
lblNewLabel_2_1.setBounds(193, 563, 96, 14);
frame.getContentPane().add(lblNewLabel_2_1);

JCheckBox chckbxNewCheckBox = new JCheckBox("Morning");
chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
chckbxNewCheckBox.setBounds(301, 560, 96, 23);
frame.getContentPane().add(chckbxNewCheckBox);

JCheckBox chckbxAfternoons = new JCheckBox("Afternoons ");
chckbxAfternoons.setFont(new Font("Tahoma", Font.PLAIN, 13));
chckbxAfternoons.setBounds(463, 559, 105, 23);
frame.getContentPane().add(chckbxAfternoons);

JCheckBox chckbxEvenings = new JCheckBox("Evenings");
chckbxEvenings.setFont(new Font("Tahoma", Font.PLAIN, 13));
chckbxEvenings.setBounds(625, 559, 96, 23);
frame.getContentPane().add(chckbxEvenings);

JLabel lblNewLabel_2_1_1 = new JLabel("(OR)");
lblNewLabel_2_1_1.setForeground(Color.WHITE);
lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
lblNewLabel_2_1_1.setBounds(212, 608, 35, 14);
frame.getContentPane().add(lblNewLabel_2_1_1);

JCheckBox chckbxWeekends = new JCheckBox("Weekends");
chckbxWeekends.setFont(new Font("Tahoma", Font.PLAIN, 13));
chckbxWeekends.setBounds(301, 605, 96, 23);
frame.getContentPane().add(chckbxWeekends);

JCheckBox chckbxOnceAWeek = new JCheckBox("Once A Week");
chckbxOnceAWeek.setFont(new Font("Tahoma", Font.PLAIN, 13));
chckbxOnceAWeek.setBounds(463, 604, 105, 23);
frame.getContentPane().add(chckbxOnceAWeek);

JCheckBox chckbxAsNeeded = new JCheckBox("As Needed");
chckbxAsNeeded.setFont(new Font("Tahoma", Font.PLAIN, 13));
chckbxAsNeeded.setBounds(625, 605, 96, 23);
frame.getContentPane().add(chckbxAsNeeded);

JLabel lblNewLabel_2_2 = new JLabel("No. Of Hours You can Contribute:");
lblNewLabel_2_2.setForeground(Color.WHITE);
lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 13));
lblNewLabel_2_2.setBounds(59, 663, 230, 14);
frame.getContentPane().add(lblNewLabel_2_2);

JLabel lblNewLabel_3 = new JLabel("(Per Day)");
lblNewLabel_3.setForeground(Color.WHITE);
lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
lblNewLabel_3.setBounds(118, 688, 83, 14);
frame.getContentPane().add(lblNewLabel_3);

textField_11 = new JTextField();
textField_11.setOpaque(false);
textField_11.setForeground(Color.WHITE);
textField_11.setFont(new Font("Tahoma", Font.PLAIN, 13));
textField_11.setColumns(10);
textField_11.setCaretColor(Color.WHITE);
textField_11.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
textField_11.setBounds(301, 661, 106, 20);
frame.getContentPane().add(textField_11);


JButton btnNewButton_1 = new JButton("SUBMIT");
btnNewButton_1.setBackground(new Color(240, 240, 240));
btnNewButton_1.setBounds(1108, 640, 120, 43);
frame.getContentPane().add(btnNewButton_1);

btnNewButton_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {

	try {
		
name = textField.getText();
add =  textField_1.getText();
city = textField_2.getText();
state =textField_3.getText();
phone =textField_4.getText();
ephone =textField_5.getText();

System.out.println("...."+name);



          if (rdbtnNewRadioButton.isSelected()) {

                gen = "Male";
            }

            else if (rdbtnNewRadioButton_1.isSelected()) {

                gen = "Female";
            }
            else if (rdbtnNewRadioButton_1_1.isSelected()) {

                gen = "Other";
            }
           
            //input for drop down
           
grad=combobox.getSelectedItem().toString();
eid =textField_6.getText();
age=Integer.parseInt(textField_7.getText());
rofj =textArea_2.getText();
nn=textField_8.getText();
tow=(textField_10.getText());
dw=Integer.parseInt(textField_9.getText());
hrs=Integer.parseInt(textField_11.getText());

//input for checkbox
         
            if(chckbxNewCheckBox.isSelected())
            {
            	System.out.println("dddffff");
            morn="Yes";
            }
            else {
            	morn="No";
            }
            if(chckbxAfternoons.isSelected())
            {
            after="Yes";
            }
            else {
            	after="No";
            }
             if(chckbxEvenings.isSelected())
            {
            even="Yes";
            }
             else {
            	 even="No";
             }
           if(chckbxWeekends.isSelected())
            {
            week="Yes";
            }
           else {
        	   week="No";
           }
           if(chckbxOnceAWeek.isSelected())
            {
            once="Yes";
            }
           else {
        	   once="No";
           }
           if(chckbxAsNeeded.isSelected())
            {
            as="Yes";
            }
           else {
        	   
        	   
        	   as="No";
           }

 
if(phone.length()==10)
{
if(ephone.length()==10)
{
if(age>15 && age<60)
{
 
	
	
		  //System.out.println("vvvvv");
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
				
		Statement st=con.createStatement();
	   
		i++;
		st.executeUpdate("INSERT INTO `test`.`volunteer`(`Vid`,`regno`,`Name`,`Gen`,`Address`,`City`,`State`,`Phone`,`Ephone`,`Eid`,`Rofj`,`Nn`,`Tow`,`Quali`,`Age`,`Dow`,`Noh`,`Morn`,`After`,`Even`,`Week`,`Once`,`As`) VALUES('"+i+"','"+reg+"','"+name+"','"+gen+"','"+add+"','"+city+"','"+state+"','"+phone+"','"+ephone+"','"+eid+"','"+rofj+"','"+nn+"','"+tow+"','"+grad+"','"+age+"','"+dw+"','"+hrs+"','"+morn+"','"+after+"','"+even+"','"+week+"','"+once+"','"+as+"') ");
		System.out.println("vvvvv");
		                   //INSERT INTO `test`.`volunteer` (`Vid`, `regno`, `Name`, `Gen`, `Address`, `City`, `State`, `Phone`, `Ephone`, `Eid`, `Rofj`, `Nn`, `Tow`, `Quali`, `Age`, `Dow`, `Noh`, `Morn`, `After`, `Even`, `Week`, `Once`, `As`) VALUES 
		
		JOptionPane.showMessageDialog(frame,"REGISTERED SUCCESSFULLY");
		HomePage h1=new HomePage();
		h1.setVisible(true);
	
	
	
}
else
{

JOptionPane.showMessageDialog(frame,"NOT IN AGE LIMIT.SORRY!");
}
}
else
{
JOptionPane.showMessageDialog(frame,"INVALID EMERGENCY NUMBER");
}
}
else
{
//System.out.println("phone="+phone);

JOptionPane.showMessageDialog(frame,"INVALID PHONE NUMBER");
}
}
        catch(Exception e) {
		
		System.out.println("\neee."+e.getMessage());
	    }
}

});



/*JLabel lblimage = new JLabel("");
lblimage.setBackground(new Color(240, 240, 240));
lblimage.setBounds(-12, 0, 46, 14);
frame.getContentPane().add(lblimage);

Image img =new ImageIcon(this.getClass().getResource("/93189.jpg")).getImage();
Dimension screenSz = Toolkit.getDefaultToolkit().getScreenSize();
   
   
    lblimage.setIcon(new ImageIcon(img));
    lblimage.setSize(screenSz.width, screenSz.height);*/

}

public void setVisible(boolean b) {
// TODO Auto-generated method stub

}
}