package org.mericbulca.abstractfactory;

public class WindowsFactory extends GUIFactory{
    @Override
    protected Button create_button() {
        return new WindowsButton();
    }
}
