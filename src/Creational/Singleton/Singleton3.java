package Creational.Singleton;

// + Thread safe
// + Lazy init
// - perfomance (every time sync)
public class Singleton3 {
    private Singleton3() {
        System.out.println("Singleton 3 created");
    }

    private static Singleton3 instance = null;

    public static synchronized Singleton3 getInstance() {
        if (instance == null)
            instance = new Singleton3();

        return instance;
    }
}
