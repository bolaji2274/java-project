import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class recursive {

    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 2};
        List<int[]> permutations = generatePermutations(arr);

        for (int[] perm : permutations) {
            System.out.println(Arrays.toString(perm));
        }
    }

    public static List<int[]> generatePermutations(int[] arr) {
        List<int[]> permutations = new ArrayList<>();
        generatePermutationsHelper(arr, 0, permutations);
        return permutations;
    }

    private static void generatePermutationsHelper(int[] arr, int index, List<int[]> permutations) {
        if (index == arr.length) {
            permutations.add(Arrays.copyOf(arr, arr.length));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            generatePermutationsHelper(arr, index + 1, permutations);
            swap(arr, index, i); // Backtrack to the original state
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
