package org.mericbulca.abstractfactory;

public class LinuxFactory extends GUIFactory{
    @Override
    protected Button create_button() {
        return new LinuxButton();
    }
}
