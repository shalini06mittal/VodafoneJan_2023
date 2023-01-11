package basic;

public class ForEachLoop {

	public static void main(String[] args) {
		int nos[] = {1,2,3,4,5};
//		for (int i = 0; i < nos.length; i++) {
//			System.out.println(nos[i]);
//		}

		// if you just want to iterate and access the values but do not modify the array
		// for each
		for(int x:nos )
			System.out.println(x);
		
		String colors[] = {"red","blue","green"};
		for(String color:colors)
			System.out.println(color);
		
	}

}
