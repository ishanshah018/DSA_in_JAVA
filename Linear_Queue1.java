
// Write a Java Program to Implement The Basic Operation of Queue Using Switch Case.
// Enqueue,Dequeue,Display
import java.util.*;

class queue {
    int f;
    int r;
    int capacity;
    int[] q;

    queue(int size) {
        capacity = size;
        f = -1;
        r = -1;
        q = new int[capacity];
    }

    void enqueue(int a) {
        if (r == capacity - 1) {
            System.out.println("Overflow !!");
        } else {
            if (f == -1) {
                f = 0;
            }
            r++;
            q[r] = a;
        }
    }

    int dequeue() {
        if (f == -1) {
            System.out.println("Underflow !!");
            return -1;
        } else {
            int y = q[f];

            if (f == r) {
                f = -1;
                r = -1;
            } else {
                f++;
            }
            return y;
        }
    }

    void display() {
        if (f == -1) {
            System.out.println("Queue is Empty !!");
        } else {
            for (int i = f; i <= r; i++) {
                System.out.print(q[i] + " ");
            }
        }

    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Queue: ");
        int size = sc.nextInt();
        queue q1 = new queue(size);

        while (true) {
            System.out.println("Enter Your Choice \n 1) Enqueue \n 2) Dequeue \n 3) Display \n 4) Exit.");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Element To Insert: ");
                    int a = sc.nextInt();
                    q1.enqueue(a);
                    break;

                case 2:
                    System.out.println("The Deleted Element is: " + q1.dequeue());
                    break;

                case 3:
                    System.out.println("Your queue is: ");
                    q1.display();
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice !!");
                    break;
            }
        }
    }
}
