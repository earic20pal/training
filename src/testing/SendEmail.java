import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class SendEmail
{
 public static void main(String [] args){
      String to = "ravi.pal@franconnect.net";//change accordingly
      String from = "ravi.pal@franconnect.net";//change accordingly
      String host = "192.168.9.165";//or IP address
      Transport tp;

     //Get the session object
      Properties properties = System.getProperties();
      properties.setProperty("mail.smtp.host", host);
      Session session = Session.getDefaultInstance(properties);

     //compose the message
      try{
         MimeMessage message = new MimeMessage(session);
         message.setFrom(new InternetAddress(from));
         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
         message.setSubject("Ping");
         message.setText("Hello, this is example of sending email  ");
         tp= session.getTransport();

         // Send message
         tp.send(message);
         System.out.println("message sent successfully....");

      }catch (MessagingException mex) {mex.printStackTrace();}
   }
}
