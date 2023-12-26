package project3;

public class MethodVerification {

    public static void main(String[] args) {
       
        displayMessage("Hello from a static method!");

        
        MethodVerification obj = new MethodVerification();

        
        obj.displayMessageInstance("Hello from an instance method!");
        int sum = obj.addNumbers(2, 6);
        System.out.println("Sum of numbers: " + sum);
 
        double product = multiplyNumbers(1.2, 9);
        System.out.println("Product of numbers: " + product);

        System.out.println("Result of subtraction: " + subtractNumbers(10, 4));

        displayInfo("mouni", 23);
    }

    static void displayMessage(String message) {
        System.out.println(message);
    }

    void displayMessageInstance(String message) {
        System.out.println(message);
    }

    int addNumbers(int a, int b) {
        return a + b;
    }

    static double multiplyNumbers(double x, int y) {
        return x * y;
    }

    static int subtractNumbers(int a, int b) {
        return a - b;
    }

    static void displayInfo(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

