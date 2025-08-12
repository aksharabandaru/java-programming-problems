import java.util.*;
class BinaryToDecimal{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int binNum=sc.nextInt();
        int decNum=0;
        int unitPlace=0;
        int pow=1;
        while(binNum>0){
            unitPlace=binNum%10;
            decNum+=(unitPlace*pow);
            binNum/=10;
            pow*=2;

        }
        System.out.println(decNum);
    }
 } 
