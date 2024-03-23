//Fibonacci Series using Recursion.

import java.util.*;

class Run6 {
    public static void main(String[] args) {
        int a = 0, b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Fibonnaci series of " + n + " terms is: ");
        System.out.println(a);
        System.out.println(b);

        ex5 r = new ex5();
        r.fibo(a, b, n - 1);
    }

}

class ex5 {
    void fibo(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;

        System.out.println(c);
        fibo(b, c, n - 1);
    }
}
