package sorting;

public class LinerSearch {

	public static void main(String[] args) {
		int a[] = {10, 4, 1, 8, 12, 18, 2};
		
		int sv = 100;
		boolean found = false;
		for (int i = 0; i < a.length; i++) {
			if(a[i] == sv)
			{
				found = true;
				break;
			}
		}
		if(found)
			System.out.println("Found");
		else
			System.out.println("not found");

	}

}
