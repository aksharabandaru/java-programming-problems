import java.util.*;

class Solution {
    public int getSecondLargest(int[] arr) {
       Arrays.sort(arr);
   int min=Integer.MIN_VALUE;
   int max=arr[arr.length-1];
   for (int i : arr){
    if(i<max){
         min=i;
    }
   }
  


        return (min == Integer.MIN_VALUE) ? -1 : min; // return -1 if no second largest
    }
}
