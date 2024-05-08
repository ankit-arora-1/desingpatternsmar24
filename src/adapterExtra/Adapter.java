package adapterExtra;

public class Adapter implements ITarget {
    private Adaptee adaptee = new Adaptee();
    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
