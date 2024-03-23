//WAP to reverse String Using Stack

import java.util.*;

class Stacks3 {
    int top;
    int size;
    char sa[];

    Stacks3(int c) {
        size = c;
        top = -1;
        sa = new char[size];
    }

    void push(char a) {
        if (top >= size - 1) {
            System.out.println("Stack is Overflow ");
        } else {
            top++;
            sa[top] = a;
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow !");
        } else {
            top--;
            System.out.print(sa[top + 1]);
        }
    }
}

class Run1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to Reverse: ");
        String str = sc.nextLine();

        Stacks3 s1 = new Stacks3(str.length());

        for (int i = 0; i < str.length(); i++) {
            s1.push(str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            s1.pop();
        }
    }
}
