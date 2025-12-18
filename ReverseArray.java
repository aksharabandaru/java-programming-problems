import java.util.*;
class ReverseArray{
    public static void reverse(int i, int j, int[] arr) {
        if (i >= j / 2) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j - i];
        arr[j - i] = temp;
        reverse(i + 1, j, arr);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        reverse(0, arr.length - 1, arr);
        System.out.println(Arrays.toString(arr)); // [5, 4, 3, 2, 1]
    }
}
