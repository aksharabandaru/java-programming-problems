import java.util.*;
class BubbleSortTech {
    public static void main(String[] args) {
        int arr[] = {13,46,9,24,52,20,9,9,9};
        int n=arr.length;
        for(int i=n-1;i>=1;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
                
            }
        }
        System.out.println(Arrays.toString(arr));
        
    }
}
