package factory;

import factory.buttons.Button;
import factory.dropdowns.Dropdown;
import factory.menus.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
    Dropdown createDropdown();
}
