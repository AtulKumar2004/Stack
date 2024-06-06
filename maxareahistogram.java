import java.util.*;

public class maxareahistogram {

    public static void maxArea(int arr[]) { // O(n) - optimized
        
        int maxarea = 0;
        int nsl[] = new int[arr.length];
        int nsr[] = new int[arr.length];

        // Next Smaller right - O(n)
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // Next Smaller Left - O(n)
        s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // Calculate area and maximum area - O(n)
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int area = height * width;
            maxarea = Math.max(maxarea, area);
        }

        System.out.println("Maximum area in histogram = " + maxarea);
    }

    public static void main(String[] args) {
        int arr[] = { 2,4 };
        maxArea(arr);
    }
}
