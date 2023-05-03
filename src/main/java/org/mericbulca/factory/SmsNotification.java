package org.mericbulca.factory;

public class SmsNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending A SMS Notification");
    }
}
