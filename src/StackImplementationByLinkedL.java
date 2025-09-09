import java.util.*;

public class StackImplementationByLinkedL {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class StackLL {
        Node head = null;
        int size = 0;

        void push(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                size++;

            } else {
                newNode.next = head;
                head = newNode;
                size++;

            }

        }

        int pop() {
            if (head == null) {
                System.out.println("Stack is Empty");
                return -1;
            } else {
                int x = head.val;
                head = head.next;
                size--;
                return x;

            }
        }

        int peek() {
            if (head == null) {
                System.out.println("Stack is Empty");
                return -1;
            }

                //System.out.println(head.val);
                return head.val;



        }

        void size() {
            System.out.println(size);
        }

        boolean isEmpty() {
            System.out.println(size==0);
            return false;
        }

        void displayRec(Node h) {
            if (h == null) {
                return;
            }
            displayRec(h.next);
            System.out.print(h.val+ " ");

        }

        void display(){
            displayRec(head);
            System.out.println();
        }

        void displayRev() {
                Node temp = head;
                while (temp!=null) {
                    System.out.print(temp.val + " ");
                    temp = temp.next;
                    size++;

                }
                System.out.println();

            }
//
//            void disSt(Node h){
//            if(h == null){
//                return;
//            }
//            disSt(h.next);
//            System.out.print(h.val+ " ");
//
//
//
//            }
//            void st(){
//            disSt(head);
//            }

//        void dst(Node h){
//            if(h == null){
//                return;
//            }
//            dst(h.next);
//            System.out.print(h.val + " ");
//
//        }
//
//        void st(){
//            dst(head);
//            System.out.println();
//        }






        public static void main(String[] args) {
            StackLL st = new StackLL();
            st.push(10);
            st.push(20);
            st.push(30);
            st.push(40);
            st.push(50);
            st.push(0);

//            st.display();
//
//            st.displayRev();
           // st.peek();
//           st.pop();
//           st.size();
////            st.displayRev();
//            st.display();
//            st.size();
//            st.push(60);
//            st.display();
//
          //st.isEmpty();
//
//            st.size();

            System.out.println(st.peek());
//            st.display();
//            st.size();
//            st.pop();
//            st.display();
//            st.size();



        }
    }
}
