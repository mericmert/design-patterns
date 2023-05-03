package org.mericbulca.abstractfactory;

public class MacOsFactory extends GUIFactory {
    @Override
    protected Button create_button() {
        return new MacOSButton();
    }
}
