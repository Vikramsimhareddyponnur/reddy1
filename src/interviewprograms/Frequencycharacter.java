package interviewprograms;
public class Frequencycharacter {
	public static void main(String[] args) {
		String s="avanger  end game";
		int[]f=new  int[s.length()];
		int i,j;
		char[] s1=s.toCharArray();
		for(i=0;i<s.length();i++)
		{
			f[i]=1;
			for(j=i+1;j<s.length();j++)
			{
				if(s1[i]==s1[j])
				{
					f[i]++;
					s1[j]='0';
				}
			}
			
		}
		System.out.println("character frequency");
		for(i=0;i<f.length;i++)
		{
			if(s1[i]!=' '  &&s1[i]!='0')
			System.out.println(s1[i]+"-"+f[i]);
		}
	}
}
