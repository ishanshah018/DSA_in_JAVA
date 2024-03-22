// WAP to PUSH Elements in a stack [STACK Size is taken from user] [Display the inserted elements] [Check the overflow condition].

import java.util.*;

class ex3 {
    int sa[];
    int top;
    int size;

    ex3(int s) {
        size = s;
        sa = new int[size];
        top = -1;
    }

    void push(int a) {
        if (top >= size - 1) {
            System.out.println("Your Stack is full:Overflow!!");
        } else {
            top++;
            sa[top] = a;
        }
    }

    void display() {
        System.out.println("Your Stack is: ");

        for (int i = top; i >= 0; i--) {
            System.out.println(sa[i]);
        }

    }

}

class run {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of a stack: ");
        int size = sc.nextInt();

        ex3 s1 = new ex3(size);
        while (true) {
            System.out.println("Press(1). For 'Push' , Press(2). For 'Display' and Press(3). For 'Exit'  ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Element to Push: ");
                    int x = sc.nextInt();
                    s1.push(x);

                    break;

                case 2:

                    s1.display();

                    break;

                case 3:
                    System.exit(0);

                default:
                    System.out.println("Invalid Input.");
                    break;
            }
        }
    }
}
