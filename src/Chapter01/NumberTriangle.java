package Chapter01;

import java.util.*;

public class NumberTriangle {
	public static void main(String[] args){
		if(args.length == 0){
			return;
		}
		int number = Integer.parseInt( args[0] );
		
		Scanner in = new Scanner(System.in);
	
		for(int i = 1; i < number ; i++){
			for(int j = 0; j < i ; j++){
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
