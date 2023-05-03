package org.mericbulca.factory;

/*
Factory pattern is used when the construction/creation logic depends on user input, and you want to
take the construction responsibility out from the user to Factory class.
It provides SR and OCP principles.
You should have common interface with multiple classes implementing that common interface.
*/

/** Notification Factory
@author mericmertbulca
@version 0.0.1
 */
public class NotificationFactory {
    public static Notification createNotification(String type) {

        if (type == null || type.isEmpty()) return null;

        return switch (type) {
            case "SMS" -> new SmsNotification();
            case "Email" -> new EmailNotification();
            default -> throw new IllegalArgumentException("Unknown Notification Type" + type);
        };
    }
}
