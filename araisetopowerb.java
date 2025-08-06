import java.util.*;
class araisetopowerb{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int ans=a;
        int b=sc.nextInt();
        for(int i=1;i<b;i++){
            ans*=a;
        }
        System.out.println(ans);

    }
}
