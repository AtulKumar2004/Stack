import java.util.*;

public class nextGreater {
    public static void main(String[] args) { // O(n)
        int arr[] = { 2, 5, 6, 0, 1, 3 };
        int ng[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {

            // 1 while
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // 2 if-else
            if (s.isEmpty()) {
                ng[i] = -1;
            } else {
                ng[i] = arr[s.peek()];
            }

            // 3 push in s
            s.push(i);
        }

        for (int i = 0; i < ng.length; i++) {
            System.out.print(ng[i] + " ");
        }
        System.out.println();

        // next Greater Right
        // next Greater Left
        // next Smaller Right
        // next Smaller Left
    }
}
