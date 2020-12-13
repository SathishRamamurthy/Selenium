package Factorial;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m=15;
		boolean bflag =false;
		int i,n=0;
		n=m/2;
		
		for(i=2;i<=n;i++) {
			
			if(m%i==0)
			{
		System.out.println("it is not prime number");
		
	bflag=true;
	break;
			}}
			if(bflag==false)
			{
			System.out.println("it is  prime number");
	}

}
}
		