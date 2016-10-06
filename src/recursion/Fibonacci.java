package recursion;

public class Fibonacci {

	public static void main(String[] args) {
		for (int i = 0; i <= 3; i++)
            System.out.println(i + ": " + fibonacci(i));
		System.out.println();
		for (int i = 0; i <= 5; i++)
            System.out.println(i + ": " + fibonacci(i));
	}
	
	public static int fibonacci(int n){
		if(n < 2)
			return n;
		else
			return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static int fibonacciIterative(int n){
		if(n < 3)
			return n;
		else{
			int fib1 = 1, fib2 = 1, fibonacci = 1;
			for(int i =3;i<=n;i++){
				fibonacci = fib1 + fib2;
				fib1 = fib2;
				fib2 = fibonacci;
			}
			return fibonacci;
		}
		
	}
	
}
