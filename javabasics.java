import java.util.Scanner;
public class javabasics {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        if (num % 2 == 0 ){
            System.out.println("The number is Even ");
        }
        else {
            System.out.println("The number is Odd");
        }
        int sum =0 ;
        for (int i = 1; i <= 11 ; i++){
            System.out.println( i ) ;
            sum += i;

        }
        System.out.println("The sum of the numbers is  " + sum);
    }
}