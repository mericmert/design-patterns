package org.mericbulca.factory;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending a E-mail Notification!");
    }
}
