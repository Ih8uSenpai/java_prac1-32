package prac1;
public class task3 {
    public static void main(String [] args){
        int [] a = new int[]{1, 2, 3, 4, 5};
        //using for
        int i = 0, s = 0;
        for (; i < a.length; i++) {
            s+= a[i];
            if (i == a.length - 1)
                System.out.println(s);
        } s = 0; i = 0;
        //using while
        while(i < a.length) {
            s += a[i];
            i++;
        }
        System.out.println(s); s = 0; i = 0;
        //using do while
        do {
            s += a[i];
            i++;
        } while(i < a.length);
        System.out.println(s);
    }
}
