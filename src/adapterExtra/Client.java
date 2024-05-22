package adapterExtra;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Client {
    public static void main(String[] args) {
        ITarget iTarget = new Adapter();
        iTarget.request();
    }
}
