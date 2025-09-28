import java.util.Scanner;

public class secondLargeLoop {
    static int secondLar(int[] arr){
        int n=arr.length;
        int second=Integer.MIN_VALUE;
        int first=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>first){
                first=arr[i];
            }
            else if(arr[i]>second && arr[i]!=first){
                second=arr[i];
            }
        }
        return second;
    }
     public static void main(String[] args){

        int[] arr={11,90,78,59,58,14,82,82,81,90,90};
        System.out.println(secondLar(arr));
    }
}  add this 
