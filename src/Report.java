import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.jdbc.JDBCCategoryDataset;

public class Report extends JFrame {
	
	
	
	
	public Report() {
		
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
			
		    String s="SELECT year,child FROM `test`.`shweta orphan` ";
			JDBCCategoryDataset data=new JDBCCategoryDataset(con,s);
		
			JFreeChart chart=ChartFactory.createBarChart("Bar", "Year","No of Children", data,  PlotOrientation.VERTICAL, true, true, false);
			chart.isBorderVisible();
			chart.setBackgroundPaint(Color.GRAY);
			chart.setBorderVisible(true);
			
			
			
			ChartPanel panel=new ChartPanel(chart);  
		    setContentPane(panel);  
			
		   }
		
		catch(Exception e) {}
		
		}

	
	
	public static void main(String[] args) {
		
		 Report example=new Report();  
	      example.setSize(1000, 800);  
	      example.setLocationRelativeTo(null);  
	      example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  
	      example.setVisible(true);  

	}

}
