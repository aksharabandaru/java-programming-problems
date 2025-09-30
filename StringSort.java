import java.util.Scanner;

class SringSort{
    static void selectionSort(String[] a){
        int n=a.length;
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[j].compareTo(a[min])<0){
                    min=j;
                }
            }
            if(min!=i){
                String temp=a[i];
                a[i]=a[min];
                a[min]=temp;

            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//size 
        String[] a=new String[n];
        for(int i=0;i<n;i++){
            a[i]=sc.next();//array input
        }
        selectionSort(a);//sort method
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");//print arr after sort
        }
        sc.close();
    }
}
