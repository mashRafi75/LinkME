package com.example.demo;


import org.apache.commons.mail.*;

public class EmailSender {

    public static void sendEmail(String recipient, String subject, String message, String atch) throws EmailException {

        EmailAttachment attachment = new EmailAttachment();
        attachment.setPath(atch);
        attachment.setDisposition(EmailAttachment.ATTACHMENT);
        attachment.setDescription("Attachment");
        attachment.setName("Attachment");
        String username = "LinkMe.teamtriobot@gmail.com";
        String password = "ecevtswamjksalyi";
        Email email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(587);
        email.setAuthenticator(new DefaultAuthenticator(username, password));
        email.setStartTLSEnabled(true);
        email.setFrom(username );
        email.setSubject(subject);
        email.setMsg(message);
        email.addTo(recipient);
        email.send();
    }
}
