package factory.buttons;

public class AndroidButton implements Button {
    @Override
    public void changeSize() {
        System.out.println("Changing size for android button");
    }
}
