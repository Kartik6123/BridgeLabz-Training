import java.util.*;

class StockSpanRecursion {

    // Sorts the entire stack
    static void sort(Stack<Integer> st) {
        if (st.isEmpty()) return;

        int top = st.pop();
        sort(st);
        insert(st, top);
    }

    // Inserts an element in sorted order
    static void insert(Stack<Integer> st, int x) {

        // Place element if stack is empty or top is smaller
        if (st.isEmpty() || st.peek() <= x) {
            st.push(x);
            return;
        }

        int temp = st.pop();
        insert(st, x);
        st.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(30);
        st.push(10);
        st.push(20);
        st.push(5);

        sort(st);

        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }
}

