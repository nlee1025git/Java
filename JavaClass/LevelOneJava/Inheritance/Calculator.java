package Inheritance;

public class Calculator extends Calculate {

    // adds two ints
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // adds any number of ints
    @Override
    public int add(int... nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    // adds any number of doubles
    public double add(double... nums) {
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    // adds int with dobule
    public double add(int num1, double num2) {
        return num1 + num2;
    }

    // adds double with int
    public double add(double num1, int num2) {
        return num1 + num2;
    }

    // adds pi to double
    public double add(double num) {
        return num + Calculate.PI;
    }

    // double the int num
    public int add(int num) {
        return num + num;
    }

    // adds two doubles and int
    public double add(double num1, double num2, int num3) {
        return num1 + num2 + num3;
    }

    // adds double and two ints
    public int add(double num1, int num2, int num3) {
        return (int) num1 + num2 + num3;
    }
}