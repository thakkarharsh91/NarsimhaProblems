package recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {
		towerOfHanoi(3,'a','b','c');
	}
	
	public static void towerOfHanoi(int n, char src, char dest, char buff){
		if(n==1){
			System.out.println(src +" to "+dest );
			return;
		}
		towerOfHanoi(n-1, src, buff, dest);
		System.out.println(src+ " to "+ dest);
		towerOfHanoi(n-1, buff, dest, src);
	}
	
}
