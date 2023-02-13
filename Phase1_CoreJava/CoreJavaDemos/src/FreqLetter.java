
public class FreqLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "computer hardware";
		for(char a ='a';a<='z';a++)
		{
			int c= 0;
			for(int i=0;i<s.length();i++)
			{
				char ch = s.charAt(i);
				if(ch==a)
					c++;
			}
			if(c!=0)
			System.out.println(a+" "+c);
		}
	}

}
