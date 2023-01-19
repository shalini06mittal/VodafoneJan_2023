package sorting;

public class BinarySearch {
	/*
	 * 1. array should be sorted
	 * 2. Divide the array in 2 parts and check if sv is the middle value or on rt / left side of the array
	 */
	public static void main(String[] args) {
		int a[] = {1,4,8,10,12,14,15,20};
		
		int sv = 10;
		boolean found = false;
		int l=0, h=a.length-1;
		while(l<=h)
		{
			int m = (l+h)/2;
			if(a[m] == sv)
			{
				found = true;
				break;
			}
			else if(sv < a[m])
				h = m-1;
			else
				l = m+1;
		}
		if(found)
			System.out.println("Found");
		else
			System.out.println("not found");

	}

}
