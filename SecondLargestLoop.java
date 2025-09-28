public class secondLargeloop {
    static int secondLar(int[] arr) {
        int n = arr.length;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] < first) {
                second = arr[i];
            }
        }
        return (second == Integer.MIN_VALUE) ? -1 : second; // -1 if no second largest exists
    }

    public static void main(String[] args) {
        int[] arr = {11, 90, 78, 59, 58, 14, 82, 82, 81, 90, 90};
        System.out.println(secondLar(arr)); // Output:  82
    }
}

