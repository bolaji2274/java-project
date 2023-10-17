public class testForSum {
    public static void main(String[] args) {
        int[] intArr = {5, 1, 23, 21, 17, 2, 3, 9, 12};
        int testInt = 22;

        boolean result = testForSum(intArr, testInt);

        System.out.println("Does the array contain three entries whose sum is " + testInt + "? " + result);
    }

    public static boolean testForSum(int[] intArr, int testInt) {
        int n = intArr.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (intArr[i] + intArr[j] + intArr[k] == testInt) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}