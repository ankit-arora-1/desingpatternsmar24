package factory;

import factory.buttons.Button;
import factory.buttons.IOSButton;
import factory.dropdowns.Dropdown;
import factory.menus.Menu;

public class IOSUIFactory implements UIFactory {
    @Override
    public IOSButton createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return null;
    }

    @Override
    public Dropdown createDropdown() {
        return null;
    }
}
