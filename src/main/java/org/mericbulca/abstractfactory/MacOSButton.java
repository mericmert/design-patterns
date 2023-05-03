package org.mericbulca.abstractfactory;

public class MacOSButton implements Button {
    @Override
    public void onClick() {
        System.out.println("MacOS Button is clicked!");
    }
}
