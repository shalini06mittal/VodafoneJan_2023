package rotation;

public class ArrayRotation {

	public static int[] rotate(int n[], int k)
	{
		int res[] = new int[n.length];
		int j=0;
		for(int i=k;i<n.length;i++)
			res[j++] = n[i];
		
		for(int i=0;i<k;i++)
			res[j++] = n[i];
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,4,8,10,12,14,15,20};
		
		// Rotate the array at k (index)
		/*
		 * k=5
		 */
		for(int n : rotate(a, 5))
			System.out.print(n+" ");
	}

}
