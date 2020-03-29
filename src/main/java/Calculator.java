public class Calculator {

    public long factorial(int a) {
        long result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
            System.out.print(result + " ");
        }
        return result;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public Boolean isTwoPositiveNumber(int a, int b) {
        if (a > 0 && b > 0) {
            System.out.println("Two number are positive");
            return true;
        } else
            return false;
    }
}
