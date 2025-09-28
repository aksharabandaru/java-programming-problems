public class moveZero {
    static int[] movezero(int[] arr){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[c];
                arr[c]=temp;
                c++;
            }
        }
        return arr;
    }
 public static void main(String[] args){

        int[] arr={0,11,0,90,78,0,6,7,0,9};
        System.out.println(movezero(arr));
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}

