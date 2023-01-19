package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// selection sort
		
		int a[] = {10, 4, 1, 8, 12, 18, 2};
		for(int i=0;i<a.length;i++)
		{
			int idx = i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[idx] > a[j])
				{
					idx = j;
				}
			}
			int t = a[i];
			a[i] = a[idx];
			a[idx] = t;
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		String s[] = {"Red","Blue","Black","Cyan","Green"};
		for(int i=0;i<s.length;i++)
		{
			int idx = i;
			for(int j=i+1;j<s.length;j++)
			{
				if(s[idx].compareTo(s[j]) > 0)
				{
					idx = j;
				}
			}
			String t = s[i];
			s[i] = s[idx];
			s[idx] = t;
		}
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}

	}

}
