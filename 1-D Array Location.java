//WAP TO FIND ABSE ADDRESS OF i th ELEMENT THE USER PROVIDES FOR ARRAY
//1-D ARRAY

import java.util.*;

class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter the Base value address: ");
        int b = sc.nextInt();
        System.out.println("Enter the datatype size(W)");
        int w = sc.nextInt();
        System.out.println("Enter the LowerBound Index Value: ");
        int lb = sc.nextInt();
        System.out.println("Enter [i] position of element for which you want to find the address: ");
        int i = sc.nextInt();

        if (i >= lb) {   
            if (i <= n) {
                int ans = b + ((i - lb) * w);
                System.out.println("Address of [" + i + "] is " + ans);
            } else {
                System.out.println("Invalid Argument !!");
            }
        } else {
            System.out.println("Invalid Argument !!");
        }
    }
}
