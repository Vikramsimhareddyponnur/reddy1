package interviewprograms;

import java.util.Arrays;

public class Anagramstring {

	public static void main(String[] args) {
		String s="ways";
		String s1="Syaw";
		s=s.toLowerCase();
		s1=s1.toLowerCase();
		if(s.length()!=s1.length())
		{
			System.out.println("both are not aegram");
			
		}
		else
		{
			char[]st1=s.toCharArray();
			char[]st2=s1.toCharArray();
			Arrays.sort(st1);
			Arrays.sort(st2);
			if(Arrays.equals(st1, st2)==true)
			{
				System.out.println("anagram");
			}
			else
			{
				System.out.println("not anagram");
				System.out.println("pull from github");
			}
		}

	}

}
