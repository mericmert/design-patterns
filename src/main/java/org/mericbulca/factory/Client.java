package org.mericbulca.factory;

public class Client {
    public static void main(String[] args){
        Notification notification = NotificationFactory.createNotification("Email");
        notification.notifyUser();
    }
}
