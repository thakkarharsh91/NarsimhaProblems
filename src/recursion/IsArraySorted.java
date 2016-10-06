package recursion;

public class IsArraySorted {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,6};
		System.out.println(isSorted(a, a.length));
	}
	
	public static boolean isSorted(int[] a, int i){
		if(i == 1)
			return true;
		return a[i-1] < a[i-2] ? false : isSorted(a, i-1);
	}
}
