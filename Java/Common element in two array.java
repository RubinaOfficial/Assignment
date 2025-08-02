import java.util.HashSet;
import java.util.Set;

public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        Set<Integer> set1 = new HashSet<>();
        for (int n : arr1)
            set1.add(n);

        System.out.print("Common Elements: ");
        for (int n : arr2) {
            if (set1.contains(n))
                System.out.print(n + " ");
        }
    }
}
