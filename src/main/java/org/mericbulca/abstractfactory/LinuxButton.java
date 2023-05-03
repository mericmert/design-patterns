package org.mericbulca.abstractfactory;

public class LinuxButton implements Button{
    @Override
    public void onClick() {
        System.out.println("Linux button is clicked!");
    }
}
