package org.mericbulca.builder;

public class Client {

    public static void main(String[] args){
        Computer computer =
                new Computer.ComputerBuilder("Asus ZyX950", 16)
                        .setBluetoothEnabled(false)
                        .setGraphicsEnabled(true)
                        .build();

        System.out.println(computer);

    }
}
