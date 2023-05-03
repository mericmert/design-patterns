package org.mericbulca.builder;

/*
Builder Design pattern is used to reduce the complexity of the creation of complex objects.
When there is a lot of arguments needed to construct an object, it is difficult to maintain the order and
It is error-prone task. Thanks to Builder Pattern, we are able to create/construct complex objects through following
step-by-step procedure.
 */
/** Represents a Computer
 * @author mericmertbulca
 * @version 0.0.1
 */
public class Computer {
    //Required parameters
    private final String HDD;
    private final double RAM;

    //Optional parameters
    private boolean isGraphicsEnabled;
    private boolean isBluetoothEnabled;

    private Computer(ComputerBuilder builder){
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicsEnabled = builder.isGraphicsEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "HDD='" + HDD + '\'' +
                ", RAM=" + RAM +
                ", isGraphicsEnabled=" + isGraphicsEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }

    /** Builder class for Computer */
    public static class ComputerBuilder{
        private final String HDD;
        private final double RAM;

        private boolean isGraphicsEnabled;
        private boolean isBluetoothEnabled;
        /** Constructor for builder class of Computer
         * @param HDD Represents HDD type
         * @param RAM Represents the amount of RAM Computer has.
         */
        public ComputerBuilder(String HDD, double RAM){
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public ComputerBuilder setGraphicsEnabled(boolean graphicsEnabled) {
            this.isGraphicsEnabled = graphicsEnabled;

            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean bluetoothEnabled) {
            this.isBluetoothEnabled = bluetoothEnabled;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }

}



