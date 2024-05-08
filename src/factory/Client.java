package factory;

import factory.buttons.Button;
import factory.dropdowns.Dropdown;
import factory.menus.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatforms.IOS);

        UIFactory uiFactory = flutter.createUIFactory();
        Button button = uiFactory.createButton();
        button.changeSize();

        Menu menu = uiFactory.createMenu();
        Dropdown dropdown = uiFactory.createDropdown();
    }
}
