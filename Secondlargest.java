import java.util.*;
class Secondlargest{
    static int secondLargest(int[] arr){
   int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        return (second == Integer.MIN_VALUE) ? -1 : second;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int n=sc.nextInt();
        System.out.println("Enter array elements: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(secondLargest(arr));
    }
}


// //import java.util.*;

// class Solution {
//     public int getSecondLargest(int[] arr) {
//        Arrays.sort(arr);
//    int min=Integer.MIN_VALUE;
//    int max=arr[arr.length-1];
//    for (int i : arr){
//     if(i<max){
//          min=i;
//     }
//    }
  


//         return (min == Integer.MIN_VALUE) ? -1 : min; // return -1 if no second largest
//     }
// }
