import java.util.Scanner;

public class BubbleSort {
    static void bubbleSort(int[] a){
        int n=a.length;
        for(int i=0;i<n-1;i++){//n-1 
            for(int j=0;j<n-i-1;j++){//n-1-i last element fixed
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//size 
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();//array input
        }
        bubbleSort(a);//sort method
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");//print arr after sort
        }
    }
}
