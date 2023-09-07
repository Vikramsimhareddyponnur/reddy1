package interviewprograms;

public class PunctionCountstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		String s="chi\nni?,:'ur the sudent';.";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='!'||s.charAt(i)==','||s.charAt(i)==';'||s.charAt(i)=='.'||s.charAt(i)=='?'||s.charAt(i)=='-'||s.charAt(i)==':')
			{
				c++;
			}
		}
System.out.println("number of punctions"+c);
	}

}
