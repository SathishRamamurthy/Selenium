package Factorial;



public class calculator {


		public int add(int num1,int num2,int num3) {
	
	return num1+num2+num3;
	
	}
	
	public static void main(String[] args) {
		
		calculator calc = new calculator();
		
		int addition =calc.add(1, 2, 3);
		
		System.out.println(addition);
	}
	

}
