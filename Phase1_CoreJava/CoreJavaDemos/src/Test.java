import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hexa");
		String no = sc.nextLine();//A64B 
		int decimal = 0, p=no.length()-1;
		int p1 = no.length() -1; // 3
		for(int i=0;i<no.length();i++)
		{
			char ch = no.charAt(i);//A
			int d=10;
			//p = no.length() - 1 - i;
			if(ch>='A' && ch<='F') {
				for(char c ='A';c<='F';c++)
				{
					if(ch==c)
					{
						decimal += d*Math.pow(16, p1); 
						break;
					}
					d++;
				}
			}
			else {
				int n = ch-'0';
				decimal += n*Math.pow(16, p1); 
			}
			p1--;
		}
		System.out.println(decimal);




	}

}
