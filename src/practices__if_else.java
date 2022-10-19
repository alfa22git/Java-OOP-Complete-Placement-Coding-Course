import java.util.Scanner;

public class practices__if_else {
	public static void main(String[] args) {
		System.out.print("Enter the Input Age Number: ");
		// Taking Input Number Using Scanner class.

		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();

		if( number >= 0 && number <18){
			System.out.println("Not Adult");
		} else if( number >= 18 && number <= 120 ){
			System.out.println("Adult");
		} else if( number <= 0 || number > 120){
			System.out.println("Please Re-enter The Correct Number Between 0 to 120. \n Thank You.");
		}
	}
}
