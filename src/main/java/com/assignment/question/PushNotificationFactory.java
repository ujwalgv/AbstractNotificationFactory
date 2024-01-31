package com.assignment.question;
import com.assignment.question.notification.Notification;
import com.assignment.question.notification.PushNotification;
import com.assignment.question.sender.NotificationSender;
import com.assignment.question.sender.PushNotificationSender;
import com.assignment.question.template.NotificationTemplate;
import com.assignment.question.template.PushNotificationTemplate;

public class PushNotificationFactory extends NotificationFactory {
      public  NotificationType notificationType(){
        return NotificationType.PUSH;
        
    }
    public  Notification createNotification(String recipient, String sender, NotificationTemplate template){
        return new PushNotification(recipient, template);
    }
    public  NotificationSender createSenders(Notification notification){
        return new PushNotificationSender(notification);
    }
    public  NotificationTemplate createtemplate(String message){
        return new PushNotificationTemplate(message);
    }
}