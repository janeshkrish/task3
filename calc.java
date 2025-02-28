public int mul(int a, int b) {
        return a * b;
    }
    
   
public double div(int a, int b) {
     if (b == 0) {
          throw new ArithmeticException("Division by zero is not allowed");
      }
        return (double) a / b;
}
public class Calculator {
    
    // Method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    public static int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
    }
}

