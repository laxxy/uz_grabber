package net.uz.core;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * Created by Никита Овсянников on 26.07.2017.
 */
public class SendEmail {

        public static void send() {
            // Recipient's email ID needs to be mentioned.
            String to = "tess.testss@gmail.com";

            // Sender's email ID needs to be mentioned
            String from = "tess.testss@gmail.com";

            // Assuming you are sending email from localhost
            String host = "smtp.gmail.com";

            // Get system properties
            Properties properties = System.getProperties();

            properties.setProperty("mail.user", "tess.testss@gmail.com");
            properties.setProperty("mail.password", "321654789");

            // Setup mail server
            properties.setProperty("smtp.gmail.com", host);

            // Get the default Session object.
            Session session = Session.getDefaultInstance(properties);

            try {
                // Create a default MimeMessage object.
                MimeMessage message = new MimeMessage(session);

                // Set From: header field of the header.
                message.setFrom(new InternetAddress(from));

                // Set To: header field of the header.
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

                // Set Subject: header field
                message.setSubject("Check it!!!!!");

                // Now set the actual message
                message.setText("This is actual message");

                // Send message
                Transport.send(message);
                System.out.println("Sent message successfully....");
            } catch (MessagingException mex) {
                mex.printStackTrace();
            }
        }

        public static void send1(String who) {
            final String username = "tess.testss@gmail.com";
            final String password = "321654789";

            Properties props = new Properties();
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.port", "587");

            Session session = Session.getInstance(props,
                    new javax.mail.Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(username, password);
                        }
                    });

            try {

                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress("tess.testss@gmail.com"));
                message.setRecipients(Message.RecipientType.TO,
                        InternetAddress.parse(who));
                message.setSubject("Testing Subject");
                message.setText("Dear Mail Crawler,"
                        + "\n\n No spam to my email, please!");

                Transport.send(message);

                System.out.println("Done");

            } catch (MessagingException e) {
                throw new RuntimeException(e);
            }
        }
}
