class DLL {
    class node {
        int data;
        node next;
        node prev;

        node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    node first = null;

    void insertfirst(int data) {
        node n = new node(data);
        if (first == null) {
            first = n;
        } else {
            n.next = first;
            first.prev = n;
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
            n.prev = c;
        }
    }

    void insertbefore(int data, int value) {
        if (first == null) {
            System.out.println("List is Empty..");
        } else {
            int flag = 0;
            node c = first;
            while (c.next != null) {
                if (c.data == value) {
                    flag = 1;
                }
                c = c.next;
            }
            if (flag == 0) {
                System.out.println("Value not found..");
            } else {
                if (first.data == value) {
                    insertfirst(data);
                } else {
                    node c1 = first;
                    while (c1.data != value) {
                        c1 = c1.next;
                    }
                    node n = new node(data);
                    n.next = c1;
                    c1.prev.next = n;
                    n.prev = c1.prev;
                    c1.prev = n;

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
            while (c != null) {
                if (c.data == value) {
                    flag = 1;
                }
                c = c.next;
            }
            if (flag == 0) {
                System.out.println("Value does not exist..");
            } else {
                node c1 = first;
                while (c1.data != value) {
                    c1 = c1.next;
                }
                if (c1.next == null) {
                    insertlast(data);
                } else {
                    node n = new node(data);
                    n.next = c1.next;
                    c1.next.prev = n;
                    c1.next = n;
                    n.prev = c1;
                }
            }
        }
    }

    void deletefirst() {
        if (first == null) {
            System.out.println("List is Empty..");
        } else {
            if (first.next == null) {
                first = null;
            } else {
                node del = first;
                first.next.prev = null;
                first = first.next;
                del.next = null;
            }
        }
    }

    void deletelast() {
        if (first == null) {
            System.out.println("List is Empty");
        } else {
            if (first.next == null) {
                first = null;
            } else {
                node c = first;
                while (c.next != null) {
                    c = c.next;
                }
                node del = c;
                c.prev.next = null;
                del.prev = null;
            }
        }
    }

    void deletevalue(int value) {
        if (first == null) {
            System.out.println("List is Empty");
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
                System.out.println("Value not found..");
            } else {
                if (first.data == value) {
                    deletefirst();
                } else {
                    node c1 = first;
                    while (c1.data != value) {
                        c1 = c1.next;
                    }
                    if (c1.next == null) {
                        deletelast();
                    } else {
                        node del = c1;
                        c1.prev.next = c1.next;
                        c1.next.prev = c1.prev;
                        del.prev = null;
                        del.next = null;
                    }
                }
            }
        }
    }

    void display() {
        if (first == null) {
            System.out.println("List is Empty");
        } else {
            node c = first;
            System.out.print("null<-->");
            while (c != null) {
                System.out.print(c.data + "<-->");
                c = c.next;
            }
            System.out.print("null");
            System.out.println();
        }
    }

    void displayreverse() {
        if (first == null) {
            System.out.println("List is Empty");
        } else {
            node c = first;
            System.out.print("null<-->");
            while (c.next != null) {
                c = c.next;
            }
            while (c != null) {
                System.out.print(c.data + "<-->");
                c = c.prev;
            }
            System.out.print("null");
            System.out.println();
        }
    }
}

class Main2 {
    public static void main(String[] args) {
        DLL d = new DLL();
        d.insertfirst(30);
        d.insertfirst(20);
        d.insertfirst(10);
        d.insertlast(40);
        d.insertbefore(25, 30);
        d.insertafter(35, 30);
        d.insertafter(45, 40);
        // d.deletefirst();
        // d.deletelast();
        // d.deletevalue(30);
        // d.deletevalue(20);
        // d.deletevalue(40);
        d.display();
        d.displayreverse();
    }
}
