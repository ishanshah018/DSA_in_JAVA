//PUSH POP PEEP DISPLAY FUNCTIONS FOR STACK IN JAVA

import java.util.*;

class Stacks1 {
    int sa[];
    int top;
    int size;

    Stacks1(int s) {
        size = s;
        sa = new int[size];
        top = -1;
    }

    void push(int a) {
        if (top >= size - 1) {
            System.out.println("Stack Overflow !!");
        } else {
            top++;
            sa[top] = a;
        }
    }

    void display() {
        System.out.println("Your Stack is: ");

        if (top == -1) {
            System.out.println("Stack is Empty ");
        } else {

            for (int i = top; i >= 0; i--) {
                System.out.println(sa[i]);
            }
        }

    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow !!");
        } else {
            top--;

        }
        return sa[top + 1];
    }

    void peep(int i1) {
        if (top - i1 + 1 < 0) {
            System.out.println("Stack Underflow on peep");
        } else if (top - i1 + 1 > top) {
            System.out.println("Element does not exist");
        } else {
            System.out.println("Element is: " + sa[top - i1 + 1]);
        }
    }
}

class ABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an element: ");
        int size = sc.nextInt();

        Stacks1 s1 = new Stacks1(size);

        while (true) {
            System.out.println("1.PUSH \n 2.Display \n 3.POP \n 4.PEEP \n 5.Exit. ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter element to push: ");
                    int x = sc.nextInt();

                    s1.push(x);
                    break;

                case 2:
                    s1.display();

                    break;

                case 3:
                    int y = s1.pop();
                    if (y != 0) {
                        System.out.println("You have deleted:" + y);
                    }

                    break;

                case 4:

                    System.out.println("Enter element to peep: ");
                    int i1 = sc.nextInt();
                    s1.peep(i1);

                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice !!");
                    break;
            }
        }
    }
}
