class Link {
    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    node first = null;

    void insertfirst(int data) {
        node n = new node(data);
        if (first == null) {
            first = n;
        } else {
            n.next = first;
            first = n;
        }
    }

    void insertlast(int data) {
        node n = new node(data);
        if (first == null) {
            first = n;
        } else {
            node c = first;
            while (c.next != null) {
                c = c.next;
            }
            c.next = n;
        }
    }

    void insertbefore(int value, int data) {
        int flag = 0;
        node c = first;

        while (c != null) {
            if (c.data == value) {
                flag = 1;
            }
            c = c.next;
        }
        if (flag == 0) {
            System.out.println("Value does not exists..");
        } else {
            if (first.data == value) {
                insertfirst(data);
            } else {
                node n = new node(data);
                node c1 = first;

                while (c1.next.data != value) {
                    c1 = c1.next;
                }
                n.next = c1.next;
                c1.next = n;
            }
        }
    }

    void insertafter(int value, int data) {
        int flag = 0;
        node c = first;

        while (c != null) {
            if (c.data == value) {
                flag = 1;
            }
            c = c.next;
        }
        if (flag == 0) {
            System.out.println("Value does not exist ");
        } else {
            node n = new node(data);
            node c1 = first;

            while (c1.data != value) {
                c1 = c1.next;
            }
            n.next = c1.next;
            c1.next = n;
        }
    }

    void deletefirst() {
        if (first == null) {
            System.out.println("Underflow !!");
        } else {
            System.out.println("Deleted Element is:" + first.data);
            first = first.next;
        }
    }

    void deletelast() {
        if (first == null) {
            System.out.println("Underflow !!");
        } else if (first.next == null) {
            System.out.println("Deleted element is: " + first.data);
        } else {
            node c = first;
            while (c.next.next != null) {
                c = c.next;
            }
            System.out.println("Deleted Element is: " + c.next.data);
            c.next = null;
        }
    }

    void deletevalue(int value) {
        if (first == null) {
            System.out.println("Underflow !!");
        } else {
            int flag = 0;
            node c = first;

            while (c != null) {
                if (c.data == value) {
                    flag = 1;
                }
                c = c.next;
            }
            if (flag == 0) {
                System.out.println("Value does not exist..");
            } else {
                if (first.data == value) {
                    deletefirst();
                } else {
                    node c1 = first;

                    while (c1.next.data != value) {
                        c1 = c1.next;
                    }
                    System.out.println("Deleted Elememt is: " + c1.next.data);
                    c1.next = c1.next.next;
                }
            }
        }
    }

    void display() {
        if (first == null) {
            System.out.println("List is Empty");
        } else {
            node c = first;
            while (c != null) {
                System.out.print(c.data + "--> ");
                c = c.next;
            }
            System.out.print("null");
            System.out.println();
        }
    }

}

class LinkMain {
    public static void main(String[] args) {
        Link l = new Link();

        l.insertfirst(10);
        l.insertfirst(20);
        l.insertlast(30);
        l.insertfirst(40);
        l.insertbefore(10, 50);
        l.insertafter(10, 70);
        l.insertbefore(40, 90);
        l.insertlast(55);
        l.insertafter(90, 120);
        l.deletefirst();
        l.deletelast();
        l.deletevalue(50);
        l.display();
    }
}
