import java.util.Scanner; 
class Prime{
	public static void main(String args[]){
		int i ,j,a;
		int count=0;
         		Scanner x = new Scanner(System.in);
		System.out.print("enter a number");
	 	a = x.nextInt();
		for(i=1;i<=a;i++){
			for(j=1;j<=i;j++){
				if(i%j==0)
				count++;
	      }
	}
		if(count==2)
               		System.out.println(a + "is prime number");
		System.out.println(a + "is not prime number");	 
	}
}
