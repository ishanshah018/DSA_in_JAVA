// TOWER OF HANOI [DSA IN JAVA]

import java.util.*;

class Run4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of DISKS: ");
        int n = sc.nextInt();

        tower t = new tower();
        t.toh(n, 'S', 'D', 'A');
    }

}

class tower {
    void toh(int n, char S, char D, char A) {
        if (n == 1) {
            System.out.println("Move Stack " + n + " from " + S + " to " + D);
        } else {
            toh(n - 1, S, A, D);
            System.out.println("Move Stack " + n + " from " + S + " to " + D);

            toh(n - 1, A, D, S);
        }
    }
}
