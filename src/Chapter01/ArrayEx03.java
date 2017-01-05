package Chapter01;

public class ArrayEx03 {
	public static void main(String[] args) {
		Student s1 = new Student();

		Student[] students = new Student[3]; // null / null / null

		for(Student s : students){
			System.out.println(s);
		}
		//흔히 하는 실수

		students[0] = new Student();
		students[0].name = "둘리";

		for(Student s : students){
			if( s != null){
				System.out.println(s.name);
			}
		}
	}
}
