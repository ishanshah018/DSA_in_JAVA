// Circular-Queue Program

import java.util.*;

class cqueue {
    int r;
    int f;
    int capacity;
    int[] q;

    cqueue(int size) {
        capacity = size;
        r = -1;
        f = -1;
        q = new int[capacity];
    }

    void enqueue(int a) {
        if ((f == r + 1) || (f == 0 && r == capacity - 1)) {
            System.out.println("Queue Overflow !!");
        } else {
            if (f == -1) {
                f++;
            }
            r = (r + 1) % capacity;
            q[r] = a;
        }
    }

    int dequeue() {
        if (f == -1) {
            System.out.println("Queue Underflow !!");
            return -1;
        } else {
            int y = q[f];
            if (f == r) {
                f = -1;
                r = -1;
                return y;
            } else {
                f = (f + 1) % capacity;
                return y;
            }
        }
    }

    void display() {
        if (f == -1) {
            System.out.println("Queue is Empty..");
        } else {
            for (int i = f; i != r; i = (i + 1) % capacity) {
                System.out.print(q[i] + " ");
            }
            System.out.print(q[r]);
        }
    }
}

class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Queue: ");
        int size = sc.nextInt();

        cqueue cq = new cqueue(size);

        while (true) {
            System.out.println("\nPress\n 1)Enqueue \n 2)Dequeue \n 3)Display \n 4) Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Element to Enqueue: ");
                    int a = sc.nextInt();
                    cq.enqueue(a);

                    break;

                case 2:
                    int y = cq.dequeue();
                    if (y != -1) {
                        System.out.println("Element Removed is: " + y);
                    }

                    break;

                case 3:
                    System.out.println("Elements in Quueue are: ");
                    cq.display();

                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Input !!");
                    break;
            }
        }
    }
}
