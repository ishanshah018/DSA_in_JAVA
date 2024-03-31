// Evaluation Of Prefix Expression

import java.util.*;

class post {
    int sa[];
    int capacity;
    int top;

    post(int size) {
        capacity = size;
        top = -1;
        sa = new int[capacity];
    }

    void push(int a) {
        top++;
        sa[top] = a;
    }

    int pop() {
        top--;
        return sa[top + 1];
    }

    int evalpost(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                push(c - '0');
            } else {
                int op1 = pop();
                int op2 = pop();
                switch (c) {
                    case '+':
                        push(op1 + op2);

                        break;

                    case '-':
                        push(op1 - op2);

                        break;

                    case '*':
                        push(op1 * op2);

                        break;

                    case '/':
                        push(op1 / op2);

                        break;

                    case '%':
                        push(op1 % op2);

                        break;

                    case '^':
                        push((int) Math.pow(op1, op2));

                        break;

                    case '$':
                        push((int) Math.pow(op1, op2));

                        break;

                    default:
                        System.out.println();
                        break;

                }
            }
        }
        return pop();
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the prefix expression: ");
        String s = sc.nextLine();

        post p = new post(s.length());

        int ans = p.evalpost(s);

        System.out.println("Evaluation of prefix expression is: " + ans);
    }
}
