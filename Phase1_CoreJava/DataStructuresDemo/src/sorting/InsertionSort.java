package sorting;

public class InsertionSort {
// selection insertion and bubble O(n2)
	public static void main(String[] args) {
		int a[] = {10, 4, 1, 8, 12, 18, 2};
		for(int i=1;i<a.length;i++)
		{
			int key = a[i];
			int j = i-1;
			while(j>-1 && a[j] > key)
			{
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}















