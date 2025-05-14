/*
 * class Fbonacci returns the no.n of fbonacci num 
 * use the function of recursion
 */

public class Fibonacci{
    public static int fibonacci(int n){
        if(n == 1 || n == 2)
            return 1;
        return fibonacci( n- 1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
         for (int i = 0; i < args.length; i++) {
            try {
                int n = Integer.parseInt(args[i]);
                System.out.println(fibonacci(n));
            } catch (NumberFormatException e) {
                System.out.printf("%s is not a valid number.\n", args[i]);
            }
        }
    }
}