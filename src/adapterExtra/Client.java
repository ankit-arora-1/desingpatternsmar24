package adapterExtra;

public class Client {
    public static void main(String[] args) {
        ITarget iTarget = new Adapter();
        iTarget.request();
    }
}
