
public class Singleton {

    private static final Singleton instance = new Singleton();

    // Private constructor ensure that the class cannot be initiated from outside
    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }
}