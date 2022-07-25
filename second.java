import java.util.Scanner;
class Second{
	public static void main(String[] args){
		boolean x = false;
		System.out.println("enter any number");
		Scanner a = new Scanner(System.in);
			int num = a.nextInt();
		System.out.println("your value" + num);
		for (int i = 2; i <= num / 2;i++){
			if (num % i == 0){
				x = true;
			 	break;
			}
		}
		if (!x)
			System.out.println(num + "is prime");
		else
			System.out.println(num + "is non prime");		
}
}