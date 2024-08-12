class Node {
    int value;
    Node left;
    Node right;

    Node(int v) {
        value = v;
        left = null;
        right = null;
    }
}

class BST {
    Node root;

    BST() {
        root = null;
    }

    void insert(int data) {
        if (root == null) {
            root = new Node(data);
            return;
        }
        Node parent = null, current = root;
        while (current != null) {
            parent = current;
            if (data < current.value) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        if (data < parent.value) {
            parent.left = new Node(data);
        } else {
            parent.right = new Node(data);
        }
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node n) {
        if (n != null) {
            inorderRec(n.left);
            System.out.print(" " + n.value);
            inorderRec(n.right);

        }
    }

    void delete(int data) {
        root = deleteRec(root, data);
    }

    Node findMin(Node n) {
        if (n != null) {
            while (n.left != null) {
                n = n.left;
            }
        }
        return n;
    }

    Node findMax(Node n) {
        if (n != null) {
            while (n.right != null) {
                n = n.right;
            }
        }
        return n;
    }

    Node deleteRec(Node r, int d) {
        // if root is empty
        if (r == null) {
            return null;
        }
        // if node is in leftsubtree
        if (d < r.value) {
            r.left = deleteRec(r.left, d);

        } else if (d > r.value) {
            // if node is in right subtree
            r.right = deleteRec(r.right, d);
        }
        // if node is found
        else {
            // no left & right child
            if (r.left == null && r.right == null) {
                r = null;
                return r;
            }
            // if only left child
            else if (r.right == null) {
                return r.left;
            }
            // if only right child
            else if (r.left == null) {
                return r.right;
            }
            // if both children left & right child
            else {
                // find succesor using findmin
                r.value = findMin(r.right).value;
                /// delete succesor
                r.right = deleteRec(r.right, r.value);

            }
        }
        return r;
    }

    void search(Node n, int data) {
        if (n == null) {
            System.out.println("Tree Is Empty..");
            return;
        }
        while (n != null) {
            if (n.value == data) {
                System.out.println("Element Found: " + data);
                return;
            } else if (data < n.value) {
                n = n.left;
            } else {
                n = n.right;
            }
        }
        System.out.println("Element not found !!");
    }

    public static void main(String[] args) {
        BST b = new BST();
        b.insert(5);
        b.insert(10);
        b.insert(2);
        b.inorder(); // 2,5,10
        System.out.println("Inserting 25,20,30");
        b.insert(25);
        b.insert(20);
        b.insert(30);
        b.inorder();
        b.delete(30);
        System.out.println("Deleting 30");
        b.inorder();

        System.out.println("Max Element:");
        Node max = b.findMax(b.root);
        System.out.println(max.value);

        b.search(b.root, 25);

    }
}
