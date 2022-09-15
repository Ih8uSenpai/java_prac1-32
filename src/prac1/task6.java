package prac1;
import java.util.Random;
public class task6 {
    public static void main(String[] arg){
        //using method random()
        int n = 1 + (int)(Math.random() * 10);
        int [] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = (int)(Math.random()*100);
        System.out.println("//Using method random()\nArray length = "+ n + "\narray elements:");
        for (int el: a)
            System.out.println(el);
        //using class Random
        Random rand = new Random();
        n = 1 + rand.nextInt(10);
        int [] a1 = new int[n];
        System.out.println("//Using class Random\nArray length = " +n + "\narray elements:");
        for(int i = 0; i < n; i++)
            a1[i] = rand.nextInt(100);
        for (int el: a1)
            System.out.println(el);
    }
}
