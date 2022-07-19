
import java.util.Scanner;

public class day0720 {


	public static void main(String[] args) {

		Scanner ketIn = new Scanner(System.in);


		int a = ketIn.nextInt();

		int b = ketIn.nextInt();

		int c = ketIn.nextInt();



		System.out.println( (a + b) % c);
		System.out.println( ((a % c ) + (b % c))%c );
		System.out.println( (a * b) % c );
		System.out.println( ((a % c ) * (b % c))%c );


	}

}
