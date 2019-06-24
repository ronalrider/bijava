public class LetterCase
{
	public static void main(String[] args)
	{
		char c='S';
		if(c>='a' && c<='z')
		{
			System.out.println("Lower case");
		}
		else if(c>='A' && c<='Z')
		{
			System.out.println("Upper case");
		}
		else
		{
			System.out.println("not alphabet");
		}
	}
}