// All Functions of Double-Ended Queue(deque)

import java.util.*;

class deque {
    int r;
    int f;
    int capacity;
    int[] q;

    deque(int size) {
        capacity = size;
        r = -1;
        f = -1;
        q = new int[capacity];
    }

    boolean isFull() {
        return (f == r + 1) || (f == 0 && r == capacity - 1);
    }

    boolean isEmpty() {
        return (r == -1 && f == -1);
    }

    void insertRear(int a) {
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

    void insertFront(int b) {
        if (isFull()) {
            System.out.println("Overflow!!");
        } else {
            if (f == -1 && r == -1) {
                f = 0;
                r = 0;
            } else if (f == 0) {
                f = capacity - 1;
            } else {
                f--;
            }
            q[f] = b;
        }
    }

    int deleteFront() {
        if (isEmpty()) {
            System.out.println("Underflow..");
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

    int deleteRear() {
        if (isEmpty()) {
            System.out.println("Underflow..");
            return -1;
        } else {
            int y = q[r];

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

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty..");
        } else {
            int i = f;
            while (i != r) {
                System.out.println(q[i] + " ");
                i = (i + 1) % capacity;
            }
            System.out.println(q[r]);
        }
    }

    int getRear() {
        if (r == -1) {
            System.out.println("Rear is on default(-1)");
            return -1;
        } else {
            return q[r];
        }
    }

    int getFront() {
        if (f == -1) {
            System.out.println("Front is on default(-1)");
            return -1;
        } else {
            return q[f];
        }
    }

    void count() {
        if (isEmpty()) {
            System.out.println("Queue Empty..");
        } else {
            int count = 0;
            int i = f;
            while (i != r) {
                count++;
                i = (i + 1) % capacity;
            }
            System.out.println("Total elements in Queue are: " + (count + 1));
        }
    }

}

class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Queue: ");
        int size = sc.nextInt();
        deque d = new deque(size);

        while (true) {
            System.out.println(
                    "\n Press \n 1)insertRear \n 2) insertFront \n 3) deleteFront \n 4) deleteRear \n 5) display \n 6) getRear \n 7) getFront \n 8) count \n 9) isFull \n 10) isEmpty \n 11) EXIT ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter element to insert at Rear: ");
                    int a = sc.nextInt();
                    d.insertRear(a);
                    break;

                case 2:
                    System.out.println("Enter element to insert at Front: ");
                    int b = sc.nextInt();
                    d.insertFront(b);
                    break;

                case 3:
                    d.deleteFront();
                    break;

                case 4:
                    d.deleteRear();
                    break;

                case 5:
                    System.out.println("Elements in Queue are: ");
                    d.display();
                    break;

                case 6:
                    System.out.println("Rear Element is:" + d.getRear());
                    break;

                case 7:
                    System.out.println("Front Element is:" + d.getFront());
                    break;

                case 8:
                    d.count();
                    break;

                case 9:
                    System.out.println(d.isFull());
                    break;

                case 10:
                    System.out.println(d.isEmpty());
                    break;

                case 11:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice(1-11 Accepted !!)");
                    break;
            }
        }
    }
}
