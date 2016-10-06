package recursion;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(factorial(2));
		System.out.println(factorialIterative(5));
	}
	
	public static int factorial(int n){
		if(n < 3)
			return n;
		return n * factorial(n-1);
	}
	
	public static int factorialIterative(int n){
		int fact = 1;
		
		for(int i =1;i<=n;i++){
			fact = fact * i;
		}
		return fact;
	}
}
