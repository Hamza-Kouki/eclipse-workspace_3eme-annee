package tp;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import com.sun.mail.smtp.SMTPTransport;
private class SendEmai_l {  
	    private static final String SMTP_SERVER = "smtp.gmail.com";
	    private static final String USERNAME = "hamzakouki33@gmail.com";
	    private static final String PASSWORD = "mouheblerrasoull";

	    private static final String EMAIL_FROM = "hamzakouki33@gmail.com";
	    private static final String EMAIL_TO = "khalfikaoula@gmail.com";
	    private static final String EMAIL_TO_CC = "khawla";

	    private static final String EMAIL_SUBJECT = "tst Hamza";
	    private static final String EMAIL_TEXT = "text test hamza";

	    public static void main(String[] args) {

	        Properties prop = System.getProperties();
	        prop.put("mail.smtp.host", SMTP_SERVER); //optional, defined in SMTPTransport
	        prop.put("mail.smtp.auth", "true");
	        prop.put("mail.smtp.port", "25"); // default port 25

	        Session session = Session.getInstance(prop, null);
	        Message msg = new MimeMessage(session);

	        try {
			
				// from
	            msg.setFrom(new InternetAddress(EMAIL_FROM));

				// to 
	            msg.setRecipients(Message.RecipientType.TO,
	                    InternetAddress.parse(EMAIL_TO, false));

				// cc
	            msg.setRecipients(Message.RecipientType.CC,
	                    InternetAddress.parse(EMAIL_TO_CC, false));

				// subject
	            msg.setSubject(EMAIL_SUBJECT);
				
				// content 
	            msg.setText(EMAIL_TEXT);
				
	            msg.setSentDate(new Date());

				// Get SMTPTransport
	            SMTPTransport t = (SMTPTransport) session.getTransport("smtp");
				
				// connect
	            t.connect(SMTP_SERVER, USERNAME, PASSWORD);
				
				// send
	            t.sendMessage(msg, msg.getAllRecipients());

	            System.out.println("Response: " + t.getLastServerResponse());

	            t.close();

	        } catch (MessagingException e) {
	            e.printStackTrace();
	        }


	    }
	}
