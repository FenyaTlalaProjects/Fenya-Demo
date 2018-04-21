package za.co.ltsmwebsystem.dao.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import za.co.ltsmwebsystem.model.Employee;

public class JavaMail {

	private static String emailFrom = "helpdesk@velaphanda.co.za";
	private static String password = "@Vela1357";
	
	@Autowired
	private HttpSession session = null;
	
	
	
	//Send email for password
	public static void sendPasswordToEmployee(Employee emp, String passw) {
			String[] to = { emp.getEmail() };
			String from = emailFrom;
			String pass = password;
			String body = "Hi "
					+ emp.getFirstName()
					+ " "
					+ emp.getLastName()
					+ ","
					+ "\n\nYour password is "
					+ passw
					+ "\n\nRemember to change your password on your first login\n\nKind Regards\nVelaphanda Support Team\nWebsite: www.velaphanda.com" +"\n";
			String subject = "Password Reset";
			Properties props = System.getProperties();
			String host = "smtp.mweb.co.za";
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", host);
			props.put("mail.smtp.user", from);
			props.put("mail.smtp.password", pass);
			props.put("mail.smtp.port", "25");
			props.put("mail.smtp.auth", "true");

			Session session = Session.getDefaultInstance(props);
			MimeMessage message = new MimeMessage(session);

			try {
				message.setFrom(new InternetAddress(from));
				InternetAddress[] toAddress = new InternetAddress[to.length];

				// To get the array of addresses
				for (int i = 0; i < to.length; i++) {
					toAddress[i] = new InternetAddress(to[i]);
				}

				for (int i = 0; i < toAddress.length; i++) {
					message.addRecipient(Message.RecipientType.TO, toAddress[i]);
				}

				message.setSubject(subject);
				message.setText(body);
				Transport transport = session.getTransport("smtp");
				transport.connect(host, from, pass);
				transport.sendMessage(message, message.getAllRecipients());
				transport.close();
			} catch (AddressException ae) {
				ae.printStackTrace();
			} catch (MessagingException me) {
				me.printStackTrace();
			}
	}
	
	//send email for blocked accounts
	public static void accountLocked(Employee employee, String managerMail) {
		String[] to = { employee.getEmail(), managerMail };
		String from = emailFrom;
		String pass = password;
		String body = "Hi "
				+ employee.getFirstName()
				+ ","
				+ "\n\nYour account has been blocked. Please consult your manager for password reset."
				+ "\n\nKind Regards\nVelaphanda Technical Team\nWebsite: www.velaphanda.com";
		String subject = "Password Reset Required";
		Properties props = System.getProperties();
		String host = "smtp.mweb.co.za";
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.user", from);
		props.put("mail.smtp.password", pass);
		props.put("mail.smtp.port", "25");
		props.put("mail.smtp.auth", "true");

		Session session = Session.getDefaultInstance(props);
		MimeMessage message = new MimeMessage(session);

		try {
			message.setFrom(new InternetAddress(from));
			InternetAddress[] toAddress = new InternetAddress[to.length];

			// To get the array of addresses
			for (int i = 0; i < to.length; i++) {
				toAddress[i] = new InternetAddress(to[i]);
			}

			for (int i = 0; i < toAddress.length; i++) {
				message.addRecipient(Message.RecipientType.TO, toAddress[i]);
			}

			message.setSubject(subject);
			message.setText(body);
			Transport transport = session.getTransport("smtp");
			transport.connect(host, from, pass);
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
		} catch (AddressException ae) {
			ae.printStackTrace();
		} catch (MessagingException me) {
			me.printStackTrace();
		}
	}
	
	
	
	
	
	
	//calculate sla end time for ticket
	private static String slaEndTime(String slaStart) throws ParseException{
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date currentDate = format.parse(slaStart);
		Calendar cal = Calendar.getInstance();
		// remove next line if you're always using the current time.
		cal.setTime(currentDate);
		cal.add(Calendar.HOUR, +4);
		String slaFourHour = format.format(cal.getTime());
		return ""+slaFourHour;
	}
	

}