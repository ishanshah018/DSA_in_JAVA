//ALL FUNCTIONS FOR STACK IN JAVA

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
            System.out.println(" Empty ");
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

    void change(int po, int val) {
        if (top - po + 1 <0) {
            System.out.println("Stack Underflow on Change ");
        } else if (top - po + 1 > top) {
            System.out.println("Element does not exist ");
        } else {
            sa[top - po + 1] = val;
            System.out.println("Your Updated Stack is: ");
            display();
        }
    }

    void peek() {
        if (top > -1) {
            System.out.println("Element at TOP is: " + sa[top]);
        }
    }

    void count() {
        System.out.println("Total Elements in Stack are: " + (top + 1));
    }

    void isEmpty() {
        if (top <= -1) {
            System.out.println("Stack is Empty ");
        } else {
            System.out.println("Stack is not Empty ");
        }
    }

    void isFull() {
        if (top >= size - 1) {
            System.out.println("Stack is Full");
        } else {
            System.out.println("Stack is not Full");
        }
    }
}

class PQR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an element: ");
        int size = sc.nextInt();

        Stacks1 s1 = new Stacks1(size);

        while (true) {
            System.out.println(
                    "1.PUSH \n 2.Display \n 3.POP \n 4.PEEP \n 5.CHANGE \n 6.PEEK \n 7.COUNT \n 8.isEmpty \n 9.isFull \n 10.Exit.  ");
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
                    System.out.println("Enter which position to change?:");
                    int po = sc.nextInt();
                    System.out.println("Enter New Value: ");
                    int val = sc.nextInt();
                    s1.change(po, val);

                    break;

                case 6:
                    s1.peek();

                    break;

                case 7:
                    s1.count();
                    break;

                case 8:
                    s1.isEmpty();
                    break;

                case 9:
                    s1.isFull();
                    break;

                case 10:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice !!");
                    break;
            }
        }
    }
}
