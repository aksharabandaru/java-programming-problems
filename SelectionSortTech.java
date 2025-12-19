import java.util.*;
class SelectionSortTech {
    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};
        int n=arr.length;
        int min=arr[0];
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<n-1;i++){
            min=i;
            for(int j=i;j<n;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
        
    }
}
