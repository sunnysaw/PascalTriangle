/*
Question : Write a program to print pascal triangle.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,k,starting,ending;
        System.out.println("Enter the starting digit :");
        starting = sc.nextInt();
        System.out.println("Enter the ending length :");
        ending = sc.nextInt();
        System.out.println("Printing the result :");
        for (i = starting; i <= ending; i++){
             for (j = 1; j <= ending-i; j++) {
                 System.out.print("_");
             }
             int sum = starting;
             for (k = 1; k <= i; k++){
                 System.out.print(sum + " ");
                 sum = sum * (i - k) / k;
             }
            System.out.println();
        }
    }
}
