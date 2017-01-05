package Chapter01;

public class ArrayEqual {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30 };
		int[] b = { 10, 20, 30 };
		
		boolean result = equals( a ,b );
		
		System.out.println( result );
	}
	public static boolean equals(int[] arr1, int[] arr2){
		
		if(arr1 == null || 
		   arr2 == null || 
		   arr1.length != arr2.length ){
			return false;
		}
		
		for(int value = 0; value < arr1.length; value++){
			if(arr1[value] != arr2[value]){
				return false;
			}
		}
		return true;
	}
}
