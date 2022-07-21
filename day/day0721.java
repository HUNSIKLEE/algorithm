import java.util.*;

public class Test{
    public static void main(String[] args){
        Scanner score = new Scanner(System.in);
        int a = score.nextInt();
        int b = score.nextInt();
        
        System.out.println(a * (b % 10));
        System.out.println(a * (b % 100 / 10));
        System.out.println(a * (b / 100));
        System.out.println(a * b);
    }
}