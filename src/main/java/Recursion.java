import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recursion {

    /**
     * O(n log n)
     */
    public static List<Integer> mergeSort(List<Integer> n) {
        if (n.size() < 2)
            return new ArrayList<>(n);

        List<Integer> left = n.subList(0, n.size() / 2);
        List<Integer> right = n.subList(n.size() / 2, n.size());

        left = mergeSort(left);
        right = mergeSort(right);

        int i = 0, j = 0;
        List<Integer> sorted = new ArrayList();

        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                sorted.add(left.get(i));
                i++;
            } else {
                sorted.add(right.get(j));
                j++;
            }
        }

        while (i < left.size())
            sorted.add(left.get(i++));

        while (j < right.size())
            sorted.add(right.get(j++));

        return sorted;
    }


    /**
     * calculating Time and Space complexity
     * @see <a href="https://syedtousifahmed.medium.com/calculating-the-factorial-of-number-recursively-time-and-space-analysis-dd47ac5f2607
     *      ">syedtousifahmed</a>
     *
     * O(n)
     */
    public static int fact(int n) {
        if (n == 1)
            return 1;

        return n * fact(n - 1);
    }

    /**
     * O(2^n)
     */
    public static int fibonacci(int n) {
        if (n < 2) return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(mergeSort(Arrays.asList(4, 5, 6, 7, 8, -9, 1)));
        System.out.println(fact(5));
        System.out.println(fibonacci(7));
    }
}

