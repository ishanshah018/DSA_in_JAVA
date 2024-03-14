//WAP TO FIND ABSE ADDRESS OF i th * j th ELEMENT THE USER PROVIDES FOR ARRAY
//2-D ARRAY

import java.util.*;

class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the Columns: ");
        int col = sc.nextInt();
        System.out.println("Enter the base value of address: ");
        int b = sc.nextInt();
        System.out.println("Enter the datatype size(W)");
        int w = sc.nextInt();
        System.out.println("Enter the i th position you want to find.");
        int i = sc.nextInt();
        System.out.println("Enter the j th position you want to find.");
        int j = sc.nextInt();
        System.out.println("Enter the start Row Index of Matrix");
        int lr = sc.nextInt();
        System.out.println("Enter the start Column Index of Matrix");
        int lc = sc.nextInt();

        System.out.println("Enter (1): For RMO. and Enter (2): For CMO");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                if (i <= row && j <= col) {
                    int rmo_ans = b + (((i - lr) * col) + (j - lc)) * w;

                    System.out.println("Address of [" + i + "][" + j + "] is: " + rmo_ans);
                } else {
                    System.out.println("Invalid input!!");
                }
                break;

            case 2:
                if (i <= row && j <= col) {
                    int cmo_ans = b + (((j - lc) * row) + (i - lr)) * w;

                    System.out.println("Address of [" + i + "][" + j + "] is: " + cmo_ans);
                } else {
                    System.out.println("Invalid input!!");
                }
                break;

            default:

                System.out.println("Invalid Choice Only Choice 1 & 2 are allowed ");
                break;
        }

    }
}
