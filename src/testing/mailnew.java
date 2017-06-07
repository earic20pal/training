/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author ravi
 */
public class mailnew {
    
    public static void main(String args[])
    {
        try {
            String server="192.168.8.8";
            String from="nothingnonti@franconnect.net";
            String to="ravi.pal@franconnect.net";
            String port="25";
            String username="";
            String password="";
            String subject="Hello";
            int count = 1;
            
            
            Properties properties = System.getProperties();
            properties.put("mail.smtp.host", server);
            properties.put("mail.smtp.port", "" + port);
            
            Session session = Session.getInstance(properties);
            Session session1 = Session.getInstance(properties);
            Transport transport = session.getTransport("smtp");
            Transport transport1 = session1.getTransport("smtp");
            
            
            transport.connect(server, username, password);
            transport1.connect(server, username, password);
            
            for (int i = 0; i < count; i++) {
                
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress(from));
                InternetAddress[] address = {new InternetAddress(to)};
                message.setRecipients(Message.RecipientType.TO, address);
                
                message.setSubject(subject + " from session 1");
                message.setSentDate(new Date());
                message.setText("Hello test");
                
                message.saveChanges();
                transport.sendMessage(message, address);
               
                Message message1 = new MimeMessage(session);
                message1.setFrom(new InternetAddress(from));
                InternetAddress[] address1 = {new InternetAddress(to)};
                message1.setRecipients(Message.RecipientType.TO, address);
                
                message1.setSubject(subject + " from session 2");
                message1.setSentDate(new Date());
                message1.setText("Hello test how are you");
                
                message1.saveChanges();
                transport1.sendMessage(message1, address1);
               
                
            }
            
            transport.close();
            transport1.close();
        } catch (MessagingException ex) {
            Logger.getLogger(mailnew.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
