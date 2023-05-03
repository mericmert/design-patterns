package org.mericbulca.abstractfactory;


public class FactoryProducer {
    public static GUIFactory createFactory(String type){
        return switch (type){
          case "MACOS" -> new MacOsFactory();
          case "LINUX" -> new LinuxFactory();
          case "WINDOWS" -> new WindowsFactory();
          default -> throw new IllegalArgumentException("There is no factory as " + type);
        };
    }
}
