package org.mericbulca.abstractfactory;


/*
Abstract factory pattern lets user produce families of related objects (Like button, checkbox, form)
without specifying their concrete classes. Abstraction is achieved by Abstract Factory interface which has
creation methods for related objects.
 */
public abstract class GUIFactory {
    protected abstract Button create_button();

}
