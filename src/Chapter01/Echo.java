package Chapter01;

public class Echo {

	public static void main(String[] args) {
		if( args.length == 0){
			System.out.println("usage : java SumToInput2 [number]");
			return;
		}
		int number = Integer.parseInt(args[0]);
		System.out.println(args[0]);
		
	}
}
