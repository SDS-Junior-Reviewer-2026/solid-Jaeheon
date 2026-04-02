package greeter;

public abstract class Greeter {
    public static final int NORMAL = 0;
    public static final int FORMAL = 1;
    public static final int CASUAL = 2;
    public static final int INTIMATE = 3;

    public abstract String greet();
}