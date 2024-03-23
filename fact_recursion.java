// WAP Factorial using Recursion

import java.util.*;

class ex4 {
    int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
}

class Run5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        ex4 ab = new ex4();
        int ans = ab.fact(n);
        System.out.println("Factorial of " + n + " is: ");
        System.out.println(ans);
    }
}
