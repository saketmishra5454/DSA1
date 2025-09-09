import java.util.*;
public class basicsOfStacks {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the size of the stack");
//        int n = input.nextInt();
//        System.out.println("Enter the elements in the stack");
//        for (int i = 1; i <= n; i++) {
//            int x = input.nextInt();
//            st.push(x);
//        }
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st+" ");
        Stack<Integer> st2 = new Stack<>();
        while(st.size()>0){
           // st2.pop();
            st2.push(st.pop());

        }
        System.out.println(st2);

        Stack<Integer> st3 = new Stack<>();
        while(st2.size()>0){
            st3.push(st2.pop());

        }
        System.out.println(st3);
    }


}
