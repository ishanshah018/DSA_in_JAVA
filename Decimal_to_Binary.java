//WAP to convert Decimal No. To Binary. using concept of Stack

import java.util.*;

class Stacks4 {
    int top;
    int size;
    int sa[];

    Stacks4(int s) {
        size = s;
        top = -1;
        sa = new int[size];
    }

    void push(int a) {
        if (top >= size - 1) {
            System.out.println("Stack Overflow.");
        } else {
            top++;
            sa[top] = a;
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is Underflow");
        } else {
            top--;
            System.out.print(sa[top + 1]);
        }
    }
}

class Run2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal No.");
        int no = sc.nextInt();

        Stacks4 s1 = new Stacks4(8000);

        while (no > 0) {
            s1.push(no % 2);
            no = no / 2;
        }
        System.out.println("Your Binary Number is: ");
        while (s1.top > -1) {
            s1.pop();
        }

    }
}
