import java.util.Scanner;
import java.util.Arrays;

public class Day02_ArrayInputAndPrint {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array:");

        String[] str = new String[4];

        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));
    }
}