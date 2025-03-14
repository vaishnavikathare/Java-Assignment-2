


class IT2023bit151{
	
	public static void main(String[] args)
	{
		IT2023bit151 a=new IT2023bit151();
		
		System.out.println();
		System.out.println(a.sumOfDigit(123));
		System.out.println();
		System.out.println(a.isPalindrome(1223421));
		System.out.println();
		System.out.println(a.getCountallPPS("ab"));
		System.out.println();
	}
	
	String sumOfDigit(int num)
	{
		int sum=0;
		String str="";
		while(num>0)
		{
			int rem=num%10;
			num=num/10;
			sum=sum+rem;
			str=rem+ "+" + str;
		}
		String newStr=str.substring(0,str.length()-1);
		newStr=newStr+ "=" + sum;
		return newStr;
		// return String.valueOf(newStr);
		// return newStr+"";
	}
	
	
//____________________________________________________________________________________________________________//
	
	
	String isPalindrome(int number)
	{
		int rev=0;
		int newNum=number;
		while(number>0)
		{
			int rem=number%10;
			number=number/10;
			rev=rev*10+rem;
		}
		if(newNum==rev)
		{
			return "The given number "+ newNum + " is palindrome";
		}
		String num=Integer.toString(newNum);
		String sb="";
		for(int index=0; index<num.length()/2; index++)
		{
				if(num.charAt(index)!=num.charAt(num.length()-1-index))
				{
					sb+= "The given number " + newNum + " is not palindrome because the digit " + num.charAt(index) + " at position " + (index+1) + " is not matching with the digit " + num.charAt(num.length()-1-index) + " at position " + ((num.length()-index-1)+1);
				}    
		}
		return sb ;
	}
	
	
//_____________________________________________________________________________________________________________________________//	
	
	
	int getCountallPPS(String text)
	{
		int emptyString=1;
		for(int i=0; i<text.length(); i++)
		{
			for(int j=i+1; j<=text.length(); j++)
			{
				String word=text.substring(i,j);
				StringBuilder sb=new StringBuilder(word);
				String newWord=sb.toString();
				String revWord=sb.reverse().toString();
				if(newWord.equals(revWord))
				{
					emptyString++;
				}
				
			}
		}
		return emptyString;
	}	
	
}
