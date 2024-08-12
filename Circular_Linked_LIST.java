class CLL {
    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    node first = null;

    void insertatfirst(int data) {
        node n = new node(data);
        if (first == null) {
            first = n;
            n.next = first;
        } else {
            node c = first;
            while (c.next != first) {
                c = c.next;
            }
            n.next = first;
            c.next = n;
            first = n;
        }
    }

    void insertatlast(int data) {
        node n = new node(data);
        if (first == null) {
            first = n;
            n.next = first;
        } else {
            node c = first;
            while (c.next != first) {
                c = c.next;
            }
            c.next = n;
            n.next = first;
        }
    }

    void insertbefore(int value, int data) {
        if (first == null) {
            System.out.println("List is Empty..");
        } else {
            int flag = 0;
            node c = first;
            do {
                if (c.data == value) {
                    flag = 1;
                }
                c = c.next;
            } while (c != first);

            if (flag == 0) {
                System.out.println("Value not found..");
            } else {
                if (first.data == value) {
                    insertatfirst(data);
                } else {
                    node c1 = first;

                    while (c1.next.data != value) {
                        c1 = c1.next;
                    }
                    node n = new node(data);
                    n.next = c1.next;
                    c1.next = n;
                }
            }
        }
    }

    void insertafter(int data, int value) {
        if (first == null) {
            System.out.println("List is Empty..");
        } else {
            int flag = 0;
            node c = first;
            do {
                if (c.data == value) {
                    flag = 1;
                }
                c = c.next;
            } while (c != first);

            if (flag == 0) {
                System.out.println("Element not found..");
            } else {
                node c1 = first;

                while (c1.data != value) {
                    c1 = c1.next;
                }
                node n = new node(data);
                n.next = c1.next;
                c1.next = n;
            }
        }
    }

    void deletefirst() {
        if (first.next == first) {
            first = null;
        } else {
            node c = first;
            while (c.next != first) {
                c = c.next;
            }
            node del = first;
            c.next = first.next;
            first = first.next;
            del.next = null;
        }
    }

    void deletelast() {
        if (first == null) {
            System.out.println("List is Empty..");
        } else if (first.next == first) {
            first = null;
        } else {
            node c = first;
            while (c.next.next != first) {
                c = c.next;
            }
            node del = c.next;
            c.next = first;
            del.next = null;
        }
    }

    void deletevalue(int value) {
        if (first == null) {
            System.out.println("List is Empty");
        } else {
            int flag = 0;
            node c = first;
            do {
                if (c.data == value) {
                    flag = 1;
                }
            } while (c != first);

            if (flag == 0) {
                System.out.println("Value does not exist..");
            } else {
                node c1 = first;
                while (c1.next.data != value) {
                    c1 = c1.next;
                }
                node del = c1.next;
                c1.next = c1.next.next;
                del.next = null;
            }
        }
    }

    void display() {
        if (first == null) {
            System.out.println("List is Empty..");
        } else {
            node c = first;
            do {
                System.out.print(c.data + "->");
                c = c.next;
            } while (c.next != first);
            System.out.print(c.data + "->");
            System.out.print("CLL..");
            System.out.println();
        }
    }

}

class Main1 {
    public static void main(String[] args) {
        CLL c = new CLL();
        c.insertatfirst(30);
        c.insertatfirst(20);
        c.insertatfirst(10);
        c.insertatlast(40);
        c.insertatlast(50);
        c.insertafter(25, 20);
        c.insertbefore(35, 40);
        c.display();
    }
}
