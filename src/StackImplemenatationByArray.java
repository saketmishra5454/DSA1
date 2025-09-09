import java.util.Stack;

public class StackImplemenatationByArray {
    public static class Stack{
        private int[] arr =  new int[6];
        int idx = 0;
        void push(int x){
            if(isFull()) System.out.println("Stack is full");
            arr[idx] = x;
            idx++;
        }
        int peek(){
            if(idx == 0) {
                System.out.println("Stack is empty");
                return -1;
            }

            return arr[idx-1];

        }
        int pop(){
            if(idx == 0) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }
        boolean isEmpty(){
            if(arr.length == 0) return true;
            else{
                return false;
            }
                //System.out.println("Stack is empty");

        }
        boolean isFull(){
            if(arr.length == idx){
                System.out.println("Stack is full");
                return true;
            }
            else{
                return false;
            }

        }
        int isSize(){
            return arr.length;
        }
        void display(){
            for(int i = 0 ; i<arr.length ; i++){
                System.out.print(arr[i]+ " ");
            }
            System.out.println();

        }

    }


    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);

        //System.out.println(st.pop());

        st.display();
        System.out.println(st.isFull());


    }

}
