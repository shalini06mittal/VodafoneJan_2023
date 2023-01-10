package basic;

public class ArrayDemo {

	public static void main(String[] args) {
		/*
		 *  1. collection of data of same type
		 *  2. it is stored in continous memory locations
		 *  3. size once declared is fixed
		 *  4. uses [] syntax to create arrays
		 *  5. arrays support indexing
		 */
		
		int x;
		x = 10;
		
		int arr[];// declared an array
		// new - used to reserve memory
		// int - 4
		// 5*4 = 20 bytes
		// create an arra
		//arr[] = new int[5]; // wrong syntax
		arr = new int[5];
		// initialize the array
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 3;
		arr[3] = 8;
		arr[4] = 5;
		System.out.println(arr[3]);
		
		// declarations and creation
		int nos[] = new int[30];
		System.out.println(nos.length);
		System.out.println(nos[0]);
		for(int i=0;i<nos.length;i++)
		{
			nos[i] = i+1;
		}
		for(int i=0;i<nos.length;i++)
		{
			System.out.println(nos[i]);
		}
		
		// declare, create and initialize
		double temps[]= {30.56, 25.89, 56.90, 77.90};
		System.out.println(temps.length);
	}

}
