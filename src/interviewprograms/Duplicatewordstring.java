package interviewprograms;

public class Duplicatewordstring {

	public static void main(String[] args) {
		String s="red alert is their in kurnool";
		int c;
		s=s.toLowerCase();
		String word[]=s.split("");
		System.out.println("duplicate :");
		for(int i=0;i<word.length;i++)
		{
			c=1;
			for(int j=i+1;j<word.length;j++)
			{
				if(word[i].equals(word[j]))
				{
					c++;
					word[j]="0";
				}
			}
		
		if(c>1&&word[i]!="0")
		System.out.println(word[i]);
		}	
		
	}

}
