import java.util.*;
class Anagram 
{
	//main method
	public static void main(String[] args) 
	{
		//creating object of Scanner
		Scanner scan = new Scanner(System.in);

		//creating a character by taking a string and converting it as a character array
		char[] a = scan.next().toCharArray();
		char[] b = scan.next().toCharArray();

		//declaring required integer variabels
		int found = 0;
		int count1;
		int count2;

		//using loop and accessing the characters using ascii values
		for (int x=97; x<=122 ;x++ )
		{
			count1 = 0; count2 = 0;

			//for each loop to traverse each character in the array "a"
			for (char i: a )
			{
				//comparing the characters
				if (i==x || i==x-32)
				{
					//if they matched, increase the count1 by 1
					count1++;
				}
			}
			//for each loop to traverse each character in the array "b"
			for (char j: b )
			{
				//comparing the characters
				if (j==x || j==x-32)
				{
					//if the match is found, increment the count2 by 1
					count2++;
				}
			}

			//if count1 and count2 are not equal
			if (count1 != count2)
			{
				//change value of found as 1
				found = 1;
			}
		}

		//if the value found remains 0, the strings are anagrams
		if (found == 0)
		{
			//print Anagram
			System.out.println("Anagram");
		}
		//otherwise
		else{
			//print Not Angaram
			System.out.println("Not Anagram");
		}
	}
}
