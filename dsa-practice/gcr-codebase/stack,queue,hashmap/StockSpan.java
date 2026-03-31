import java.util.*;

class StockSpan {

    static int[] calculateSpan(int[] price) {
        int n = price.length;
        int[] span = new int[n];
        Stack<Integer> st = new Stack<>();

        // First day span is always 1
        span[0] = 1;
        st.push(0);

        for (int i = 1; i < n; i++) {

            // Remove indices with smaller or equal prices
            while (!st.isEmpty() && price[st.peek()] <= price[i]) {
                st.pop();
            }

            // If stack empty, span is full range
            span[i] = st.isEmpty() ? (i + 1) : (i - st.peek());

            // Push current index
            st.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        int[] price = {100, 80, 60, 70, 60, 75, 85};
        int[] span = calculateSpan(price);

        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}

