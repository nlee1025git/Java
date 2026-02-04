package Inheritance;

public abstract class Calculate {
    public static final double pi = 3.14;

    public abstract int add(int num1, int num2);

    public abstract int add(int... nums);

    // add doubles
    public double add(double num1, double num2) {
        return num1 + num2;
    }
}
