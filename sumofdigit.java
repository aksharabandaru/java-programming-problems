import java.util.*;
class sumofdigit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        while(n>0){
            c+=n%10;
            n=n/10;
        }
        System.out.println(c);

    }
}
