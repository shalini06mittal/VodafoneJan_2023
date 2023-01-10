package basic;

public class LoopsDemo {

	public static void main(String[] args) {
		// what is repeated => printing 1
		/*
		 * initializatio  : start = 1
		 * condition : start <= 10
		 * incr / decr : start+=1
		 * 
		 * for(initialize;condition;update)
		 */
		for(int start=0; start<10 ;start++)
			System.out.println(1);
		
	
		/**
		 * initialize
		 * while(condition)
		 * {
		 * BL
		 * update
		 * }
		 */
		
		int x = 1;
		while(x<=10)
		{
			System.out.println(x*x);
			x++;
		}
		
		/**
		 * initialize
		 * do{
		 * BL
		 * update
		 * }
		 * while(condition);
		 */
		int x1 = 1;
		do
		{
			System.out.println(x1*x1);
			x1++;
		}while(x1<11);
		
	}

}
