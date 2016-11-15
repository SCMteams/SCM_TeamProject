import java.util.Scanner;

public class CallCalculateAndDisplay {

	public static void main(String[] args) {
		String name;
		double salary;
		double turnover;
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter name :");
		name = scan.nextLine();
		System.out.print("Enter salary :");
		salary = scan.nextInt();
		System.out.print("Enter turnover :");
		turnover = scan.nextInt();
		Calculate cal=new Calculate(salary, turnover);
	}

}
