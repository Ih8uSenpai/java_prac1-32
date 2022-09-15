package prac1;
import java.util.Scanner;

public class task7 {
    static long F(int n){
        long s = 1;
        for (int i = 2; i <= n; i++)
            s *= i;
        return s;
    }
    public static void main(String[] args)
    {
        System.out.println("Enter number to get its factorial");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.printf("%d! = " + F(n), n);
    }
}
