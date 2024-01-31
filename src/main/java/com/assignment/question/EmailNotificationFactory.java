package com.assignment.question;

import com.assignment.question.notification.Notification;
import com.assignment.question.notification.EmailNotification;
import com.assignment.question.sender.NotificationSender;
import com.assignment.question.sender.EmailNotificationSender;
import com.assignment.question.template.NotificationTemplate;
import com.assignment.question.template.EmailNotificationTemplate;

public class EmailNotificationFactory extends NotificationFactory {
    
    public  NotificationType notificationType(){
        return NotificationType.EMAIL;
        
    }
    public  Notification createNotification(String recipient, String sender, NotificationTemplate template){
        return new EmailNotification(recipient, sender, template);
    }
    public  NotificationSender createSenders(Notification notification){
        return new EmailNotificationSender(notification);
    }
    public  NotificationTemplate createtemplate(String message){
        return new EmailNotificationTemplate(message);
    }
    
}