package factory;

import factory.buttons.AndroidButton;
import factory.buttons.Button;
import factory.dropdowns.AndroidDropdown;
import factory.dropdowns.Dropdown;
import factory.menus.AndroidMenu;
import factory.menus.Menu;

public class AndroidUIFactory implements UIFactory {
    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public AndroidDropdown createDropdown() {
        return new AndroidDropdown();
    }
}
