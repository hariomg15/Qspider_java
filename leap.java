import java.util.Scanner;

public class leap {
    public static void main(String args[]){
        float year;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        year=sc.nextFloat();

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("Entered year is leap year");
        }
        else{
            System.out.println("Not leap year");
        }
    }
}
