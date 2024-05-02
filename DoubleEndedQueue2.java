//This Java code implements a program to determine whether an input string is a palindrome. 
//using insertRear(), deleteRear()

import java.util.*;

class deque2 {
    int r;
    int f;
    int capacity;
    char[] q;

    deque2(int size) {
        capacity = size;
        r = -1;
        f = -1;
        q = new char[capacity];
    }

    boolean isFull() {
        return (f == r + 1) || (f == 0 && r == capacity - 1);
    }

    boolean isEmpty() {
        return (r == -1 && f == -1);
    }

    void insertRear(char a) {
        if (isFull()) {
            System.out.println("Overflow !!");
        } else {
            if (f == -1) {
                f++;
            }
            r = (r + 1) % capacity;
            q[r] = a;
        }
    }

    char deleteRear() {
        if (isEmpty()) {
            System.out.println("Underflow..");
            return '\0';
        } else {
            char y = q[r];

            if (f == r) {
                f = -1;
                r = -1;
            } else {
                if (r == 0) {
                    r = capacity - 1;
                } else {
                    r--;
                }

            }
            return y;
        }
    }

}

class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Characters: ");
        String str = sc.next();

        deque2 d = new deque2(str.length());

        // Logic to Insert the String

        for (int i = 0; i < str.length(); i++) {
            d.insertRear(str.charAt(i));
        }
        String rev = "";

        // Logic to Reverse the String

        while (!d.isEmpty()) {
            rev = rev + d.deleteRear();
        }
        System.out.println("Your Reverse String is:" + rev);

        // Logic to Check Palindrome or not

        if (str.equalsIgnoreCase(rev)) {
            System.out.println("Your Entered Character is PALINDROME..");
        } else {
            System.out.println("Your Entered Character is NOT PALINDROME..");
        }
    }
}
