import java.util.*;
class Secondlargest{
    static int secondLargest(int[] arr){
    Arrays.sort(arr);
    return arr[arr.length-2];

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
