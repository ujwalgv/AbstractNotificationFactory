# Abstract Factory Pattern Implementation Guide

## Step 1: Understand the Abstract Factory
- Walk through the given abstract `NotificationFactory` class provided in the assignment. This contains the abstract method of `notificationType()`.
- Now as per `TASK-1`, you will need to add the factory methods to create the **notification**, **templates**, and **senders** to the abstract factory class.
- **NotificationFactory Class:**
  So add the below abstract methods -
    - `createNotification(...)`: Creates a notification instance.
    - `createSenders(...)`: Creates a sender instance.
    - `createTemplate(...)`: Creates a template instance.

## Step 2: Implement EmailNotificationFactory

- **EmailNotificationFactory Class:**
  - Make the `EmailNotificationFactory` extend the `NotificationFactory`.
  - Implement the abstract methods:

    ```java
    public class EmailNotificationFactory extends NotificationFactory {

        @Override
        public NotificationType notificationType() {
            return NotificationType.EMAIL;
        }

        @Override
        public Notification createNotification(String recipient, String sender, NotificationTemplate template) {
            return new EmailNotification(recipient, sender, template);
        }

        @Override
        public NotificationSender createSenders(Notification notification) {
            return new EmailNotificationSender(notification);
        }

        @Override
        public NotificationTemplate createTemplate(String message) {
            return new EmailNotificationTemplate(message);
        }
    }
    ```

## Step 3: Implement PushNotificationFactory

- **PushNotificationFactory Class:**
  - Similarly, implement the `PushNotificationFactory` by extending the `NotificationFactory`
  - Implement the abstract methods:

    ```java
    public class PushNotificationFactory extends NotificationFactory {

        @Override
        public NotificationType notificationType() {
            return NotificationType.PUSH;
        }

        @Override
        public Notification createNotification(String recipient, String sender, NotificationTemplate template) {
            return new PushNotification(recipient, template);
        }

        @Override
        public NotificationSender createSenders(Notification notification) {
            return new PushNotificationSender(notification);
        }

        @Override
        public NotificationTemplate createTemplate(String message) {
            return new PushNotificationTemplate(message);
        }
    }
    ```
