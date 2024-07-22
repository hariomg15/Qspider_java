
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int  number=sc.nextInt();
        // int number=123;
        int rev=0;
        int n2=number;

       while( number!=0){
        rev=(rev*10)+number%10;//rev=(0*10)+(123%10)
        //123%10=3
        number=number/10;// number=123/10=12
        
       }
       System.out.println("Reverse no. is:"+rev);
        }
    }

