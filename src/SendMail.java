import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail 
{
	public String to="rajvikapadia99@gmail.com";
	public String val="123465";
	
	public SendMail()
	{
		// Sender's email ID needs to be mentioned
        String from = "nnrsproject2019@gmail.com";

        // Assuming you are sending email from through gmails smtp
        String host = "smtp.gmail.com";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

            @Override
			protected PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication("nnrsproject2019@gmail.com", "nnrs@123");

            }

        });

        // Used to debug SMTP issues
        session.setDebug(true);

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject("OTP for your TaxiCab Account");
            
            String st = "Hello,\n\nUse the given Verification Code to Sign In: "+ val +"\n\nThank You for Using TaxiCab:)";
            // Now set the actual message
            message.setText(st);
            
            // Send message
            Transport.send(message);
        
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }

    }
	public static void main(String st[])
	{
		SendMail sm=new SendMail();
	}
	
	/*
	 *  This code will send email to customers based on gmnail or yahoo selction ifrom the database
	 * 
	 */
	public void sendEmailToCustomer(String emailServiceProvider) {
		EmailService eservice = null;
	
		// check for gmail and send email
		
		if(emailServiceProvider.equals("GMAIL"))
		{
			eservice.sendEmail();
		}
		
		else if (emailServiceProvider.equals("YAHOO")) {
			eservice.sendEmail();
		}

	}
}