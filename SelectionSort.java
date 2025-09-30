import java.util.Scanner;

class SelectionSort{
    static void selectionSort(int[] a){
        int n=a.length;
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[i]){
                    min=j;
                }
            }
            if(min!=i){
                int temp=a[i];
                a[i]=a[min];
                a[min]=temp;

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
        selectionSort(a);//sort method
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");//print arr after sort
        }
    }
}
