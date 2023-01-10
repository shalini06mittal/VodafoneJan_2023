package basic;

public class NestedLoopsDemo {

	public static void main(String[] args) {
		
		/**
		 * 3 shows
		 * show1 => 
		 * movie 1 => 0 to 120
		 * show2 => 
		 * movie 2 => 0 to 120
		 * show3 => 
		 * movie 3 => 0 to 120
		 */
		for(int show = 1;show<=3;show++) // outer loop
		{
			System.out.println("Show "+show);
			for(int i=0;i<=2;i++) // inner loop
			{
				System.out.println("playing movie secs "+i);
			}
		}

		for(int x=1;x<=3;x++)
		{
			for(int y=1;y<=3;y++) {
				if(x==y) break;
				System.out.println(x+" "+y);
			}
		}
	}

}
