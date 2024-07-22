
import java.util.Scanner;

public class loop {
    public static void main(String args[]){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of num=");
        num=sc.nextInt();

        for(int i=0;i<=num;i++){
            for(int j=1;j<num-i;j++);
            System.out.print("*");
        }
        System.out.println();
    }
}
