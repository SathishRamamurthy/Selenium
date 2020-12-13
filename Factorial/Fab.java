package Factorial;

public class Fab {

	public static void main(String[] args) {
	

		int i,r=8;
		int a =0;
		int b=1;
		int c;
		
		System.out.println(a);
for (i=1;i<r;i++) {
	c=a+b;
	b=a;
	a=c;
	System.out.println(c);
}
}
}