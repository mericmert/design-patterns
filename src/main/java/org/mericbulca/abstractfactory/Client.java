package org.mericbulca.abstractfactory;

public class Client {
    public static void main(String[] args) {
        GUIFactory factory = FactoryProducer.createFactory("LINUX");
        Button button = factory.create_button();
        button.onClick();
    }
}
