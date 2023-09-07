package interviewprograms;
public class Smallestlargeststring {
	public static void main(String[] args) {
		String s="kurnool is famous             food is samosa";
		String w="",s1="",large="";
		String [] ws =new String[100];
		int length=0;
		s=s+"";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				w=w+s.charAt(i);
			}
			else
			{
				ws[length]=w;
				length++;
				w="";
			}
		}
		s1=large=ws[0];
		for(int k=0;k<length;k++)
		{
			if(s1.length()>ws[k].length())
				s1=ws[k];
			if(large.length()<ws[k].length())
				large=ws[k];
		}
		System.out.println("small word :"+s1);
		System.out.println("large word :"+large);
	}
}
