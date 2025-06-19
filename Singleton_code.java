
public class Singleton_code {
    private static Singleton_code instance;

    private Singleton_code() {
        // private constructor
    }

    public static Singleton_code getInstance() {
        if (instance == null) {
            instance = new Singleton_code();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton Instance Accessed");
    }

    public static void main(String[] args) {
        Singleton_code obj = Singleton_code.getInstance();
        obj.showMessage();
    }
}
