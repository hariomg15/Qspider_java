
import java.util.*;
public class function {
    public static int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("n1= ");
        int n1=sc.nextInt();
        System.out.print("n2= ");
        int n2=sc.nextInt();
        
         int a=add(n1,n2);
        System.out.println("addition= "+a);

    }
    
}
