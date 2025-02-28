public int mul(int a, int b) {
        return a * b;
    }
    
   
public double div(int a, int b) {
     if (b == 0) {
          throw new ArithmeticException("Division by zero is not allowed");
      }
        return (double) a / b;
}
