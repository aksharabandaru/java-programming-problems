import java.util.*;
class DecimalToBinary{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int decNum=sc.nextInt();
        int binNum=0;
        int paraty=0;
        int pow=1;
        while(decNum>0){
            paraty=decNum%2;
            binNum+=(paraty*pow);
            pow*=10;
            decNum/=2;

        }
        System.out.println(binNum);



    }
 }
